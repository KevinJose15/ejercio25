import java.util.Scanner;

public class Articulo {
 public static void main(String[] args) {
        String[][] articulos = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los nombres de 9 artículos:");
        for (int i = 0; i < articulos.length; i++) {
            for (int j = 0; j < articulos[i].length; j++) {
                System.out.print("Artículo [" + (i + 1) + "][" + (j + 1) + "]: ");
                articulos[i][j] = scanner.nextLine();
            }
        }
        System.out.println("\nContenido de la matriz en orden invertido:");
        for (int i = articulos.length - 1; i >= 0; i--) {
            for (int j = 0; j < articulos[i].length; j++) {
                System.out.print(articulos[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}