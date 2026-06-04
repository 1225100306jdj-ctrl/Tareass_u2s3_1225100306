package utng.gtid2.jdj.herencia;

public class Empleado {


    protected String nombre;
    protected String departamento;
    protected int numEmpleado;

    private static int contadorEmpleados = 0;

    public Empleado(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
        contadorEmpleados++;
        this.numEmpleado = contadorEmpleados;
    }

    public double calcularSalario() {
        return 0.0;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Departamento: " + departamento);
        System.out.println("Número Empleado: " + numEmpleado);
    }

    @Override
    public String toString() {
        return "[" + numEmpleado + "] " + nombre
                + " | " + departamento
                + " | $" + calcularSalario();
    }
}

