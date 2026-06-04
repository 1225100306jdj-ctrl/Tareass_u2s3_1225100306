package utng.gtid2.jdj.herencia;

public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre,
        String departamento,
        int horasTrabajadas,
        double tarifaHora) {

        super(nombre, departamento);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Empleado por Horas";
    }
}