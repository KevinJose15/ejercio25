package EjercioSueldo;

public class Sueldo extends Persona{
      private double tarifaHora;
    private int horasTrabajadas;

    public Sueldo(String nombre, int edad, double tarifaHora, int horasTrabajadas) {
        super(nombre, edad);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void registrar() {
        System.out.println("Registro del consultor:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }

    @Override
    public double calcularSueldo() {
        return tarifaHora * horasTrabajadas;
    }
}
