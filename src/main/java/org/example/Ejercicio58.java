package org.example;

import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingresa número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Ingresa el valor K: ");
        int k = sc.nextInt();

        int suma = 0;
        System.out.println("\nMatriz multiplicada por K:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = matriz[i][j] * k;
                suma += matriz[i][j];
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nSuma de los elementos multiplicados: " + suma);

    }
}
