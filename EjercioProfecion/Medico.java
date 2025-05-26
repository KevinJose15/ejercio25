package EjercioProfecion;

public class Medico implements Profesion {
    private double tarifaPorConsulta;
    private int numeroConsultas;

    public Medico(double tarifaPorConsulta, int numeroConsultas) {
        this.tarifaPorConsulta = tarifaPorConsulta;
        this.numeroConsultas = numeroConsultas;
    }

    @Override
    public double calcularSueldo() {
        return tarifaPorConsulta * numeroConsultas;
    }

    public void mostrarInformacion() {
        System.out.println("Soy un Médico. Mi sueldo es: $" + calcularSueldo());
    }
}
