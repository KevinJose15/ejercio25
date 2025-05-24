package Ejerciomayorymenor;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
    int [] numeros  = new int [10];
    int mayor = 0;
    int menor = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
        System.out.print("numeros " + (i + 1) + ": ");
        numeros[i] = scanner.nextInt();
     }

    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > mayor) {
            mayor = numeros[i];
            }
        if (numeros[i] < menor) {
            menor = numeros[i];
            }
        }
        System.out.println("\nCantidad de números mayor: " + mayor);
        System.out.println("Cantidad de números menor: " + menor);
    scanner.close();    
   
    }
}
