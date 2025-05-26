package EjercioProfecion;

public class Ingeniero implements Profesion {
    private double salarioBase;
    private double bonificacion;

    public Ingeniero(double salarioBase, double bonificacion) {
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bonificacion;
    }

    public void mostrarInformacion() {
        System.out.println("Soy un Ingeniero. Mi sueldo es: $" + calcularSueldo());
    }
}
