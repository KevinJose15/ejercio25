package EjercioSueldo;

public class Empleado extends Persona {
    private double salarioBase;
    private double bonificacion;

    public Empleado(String nombre, int edad, double salarioBase, double bonificacion) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }

    @Override
    public void registrar() {
        System.out.println("Registro del empleado:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bonificacion;
    }
}
