package utng.gtid2.jdj.herencia;

public class Docente extends Empleado {

    private int materiasImpartidas;
    private double pagoMateria;

    public Docente(String nombre,
                   int materiasImpartidas,
                   double pagoMateria) {

        super(nombre, "Docencia");
        this.materiasImpartidas = materiasImpartidas;
        this.pagoMateria = pagoMateria;
    }

    public double bonoCatedra() {

        if (materiasImpartidas >= 3) {
            return 1500.0;
        }

        return 0.0;
    }

    @Override
    public double calcularSalario() {
        return (materiasImpartidas * pagoMateria)
                + bonoCatedra();
    }

    public void asignarMateria(String materia) {
        System.out.println(nombre
                + " asignado a la materia "
                + materia);
    }

    @Override
    public String toString() {
        return super.toString() + " | Docente";
    }
}