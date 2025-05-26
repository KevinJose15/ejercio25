package EjercioProfecion;

public class Main {
  public static void main(String[] args) {
       
        Ingeniero ingeniero = new Ingeniero(2500.00, 500.00);
        Medico medico = new Medico(150.00, 40);
        Profesor profesor = new Profesor(2000.00);

      
        ingeniero.mostrarInformacion();
        medico.mostrarInformacion();
        profesor.mostrarInformacion();
    }
}
