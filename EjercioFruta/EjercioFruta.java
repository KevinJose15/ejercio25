package EjercioFruta;

import java.util.Scanner;

public class EjercioFruta {
    public static void main(String[] args) {
        
    
        // Crear un vector para almacenar las frutas
        String[] frutas = new String[10];
        
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese 10 nombres de frutas
        System.out.println("Ingrese los nombres de 10 frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Fruta " + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        // Mostrar las frutas en orden inverso
        System.out.println("\nLas frutas en orden inverso son:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
} 
/*
Sandía
Uva
Piña
Limón
Naranja
Plátano
Fresa
Mango
Pera
Manzana*/

