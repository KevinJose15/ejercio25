package EjercioSueldo;

public class Main {
      public static void main(String[] args) {
        // Uso de polimorfismo
        Persona empleado = new Empleado("Carlos López", 30, 1500.00, 300.00);
        Persona consultor = new Sueldo("María Pérez", 28, 50.00, 120);

        // Registrar y calcular sueldo para ambos
        empleado.registrar();
        System.out.println("Sueldo total del empleado: $" + empleado.calcularSueldo());

        consultor.registrar();
        System.out.println("Sueldo total del consultor: $" + consultor.calcularSueldo());
    }
}
