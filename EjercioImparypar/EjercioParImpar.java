package EjercioImparypar;

import java.util.Scanner;

public class EjercioParImpar {
    public static void main(String[] args) {
    int [] numeros  = new int [12];
    int pares = 0;
    int impares = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese 12 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
        System.out.print("numeros " + (i + 1) + ": ");
        numeros[i] = scanner.nextInt();

    if(numeros[i] %2 ==0){
        pares++;
    }else{
        impares++;
    }
     }
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    scanner.close();    
   
    }
}
