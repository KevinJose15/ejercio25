package EjercioVehiculo;

public class Main {
     public static void main(String[] args) {
        Carro[] flota = {
            new Carro("Kia", "SOUL", "Blaco"),
            new Barco("Lagoon", "52 Fly", "negro"),
            new Avion("papel", "A350-941", "celeste")
        };

        for (Carro v : flota) {
            System.out.print(v.getClass().getSimpleName() + ": ");
            v.mover();
        }
    }
}
