package EjercioProfecion;

public class Profesor implements Profesion {
    private double salarioMensual;

    public Profesor(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSueldo() {
        return salarioMensual;
    }

    public void mostrarInformacion() {
        System.out.println("Soy un Profesor. Mi sueldo es: $" + calcularSueldo());
    }
}

