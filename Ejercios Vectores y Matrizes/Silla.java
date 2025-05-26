

import java.util.Scanner;

public class Silla {
    public static void main(String[] args) {

        int filas = 3;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 12 valores numéricos para la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor en posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        boolean hayPuntoDeSilla = false;
        System.out.println("\nPuntos de silla encontrados:");

        for (int i = 0; i < filas; i++) {
            int minColIndex = 0;
            int minValorFila = matriz[i][0];
            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] < minValorFila) {
                    minValorFila = matriz[i][j];
                    minColIndex = j;
                }
            }

            boolean esPuntoDeSilla = true;
            for (int k = 0; k < filas; k++) {
                if (matriz[k][minColIndex] > minValorFila) {
                    esPuntoDeSilla = false;
                    break;
                }
            }

            if (esPuntoDeSilla) {
                hayPuntoDeSilla = true;
                System.out.println("Punto de silla: " + minValorFila + " en posición [" + (i + 1) + "]["
                        + (minColIndex + 1) + "]");
            }
        }

        if (!hayPuntoDeSilla) {
            System.out.println("No se encontraron puntos de silla en la matriz.");
        }
        scanner.close();
    }
}
