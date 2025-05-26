public class Main {
    public static void main(String[] args) {
        Futbolita jugador = new Futbolita();
        jugador.nombre = "Benzema";
        jugador.viajar();
        jugador.concentrarse();

        Entrenador tecnico = new Entrenador();
        tecnico.nombre = "Xavi";
        tecnico.viajar();
        tecnico.dirigirPartido();

        Masajista masajista = new Masajista();
        masajista.nombre = "Messi";
        masajista.viajar();
        masajista.darMasaje();
    }
}
