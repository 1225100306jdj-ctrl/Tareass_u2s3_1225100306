package utng.gtid2.jdj.herencia;

public class Main {

    public static double calcularNomina(Empleado[] empleados) {

        double total = 0;

        for (Empleado e : empleados) {
            total += e.calcularSalario();
        }

        return total;
    }

    public static void generarReporte(Empleado[] empleados) {

        System.out.println("\n===== REPORTE DE EMPLEADOS =====");

        for (Empleado e : empleados) {

            System.out.println(e);

            if (e instanceof Docente docente) {

                docente.asignarMateria("POO");

            } else if (e instanceof EmpleadoPorHoras eph) {

                System.out.println(
                        "Horas trabajadas: "
                                + eph.getHorasTrabajadas());
            }

            System.out.println("--------------------------------");
        }

        System.out.println(
                "\nTOTAL NOMINA: $"
                        + calcularNomina(empleados));
    }

    public static void main(String[] args) {

        System.out.println("=== CASOS DE PRUEBA ===");

        EmpleadoFijo ef =
                new EmpleadoFijo(
                        "Ana",
                        "TI",
                        15000,
                        2500);

        EmpleadoPorHoras ep =
                new EmpleadoPorHoras(
                        "Luis",
                        "Mantenimiento",
                        160,
                        85.0);

        Docente d =
                new Docente(
                        "Dr. Garcia",
                        4,
                        3500);

        System.out.println(ef.calcularSalario());
        System.out.println(ep.calcularSalario());
        System.out.println(d.calcularSalario());

        Empleado[] empleados = {
                ef,
                ep,
                d,
                new EmpleadoFijo(
                        "Carlos",
                        "Administracion",
                        12000,
                        1500),
                new EmpleadoPorHoras(
                        "Mariana",
                        "Soporte",
                        120,
                        90),
                new Docente(
                        "Dra. Lopez",
                        2,
                        4000)
        };

        generarReporte(empleados);
    }
}