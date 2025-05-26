package EjercioVehiculo;

public class Barco extends Carro {
       public Barco(String marca, String modelo, String color) {
        super(marca, modelo, color);
    }

    @Override
    public void mover() {
        System.out.println("El barco navega .");

    }
}
