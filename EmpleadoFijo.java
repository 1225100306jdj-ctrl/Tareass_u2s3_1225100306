package utng.gtid2.jdj.herencia;

public class EmpleadoFijo extends Empleado {

    private double salarioMensual;
    private double bono;

    public EmpleadoFijo(String nombre,
                        String departamento,
                        double salarioMensual,
                        double bono) {

        super(nombre, departamento);
        this.salarioMensual = salarioMensual;
        this.bono = bono;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual + bono;
    }

    @Override
    public String toString() {
        return super.toString() + " | Empleado Fijo";
    }
}
