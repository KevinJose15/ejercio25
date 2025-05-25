package EjercioTranspuesta;

import java.util.Scanner;

public class Transpuesta {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 9 valores numéricos para la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Valor en posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("\nMatriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
