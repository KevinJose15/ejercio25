package EjercioJuego;

public class Main {
    public static void main(String[] args) {
        Nivel2 obj = new Nivel2();
        obj.imprimePreguntas();

        System.out.println("*************MARCADOR*************");
        System.out.println("Nivel 2");
        System.out.println("Tu puntaje es:" + obj.puntaje);
    }
}
