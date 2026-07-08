package org.example;

import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][2];
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Ingresa número [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                suma += matriz[i][j];
            }
        }

        double promedio = (double) suma / (3 * 2);

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
