package org.example;
import java.util.Scanner;
public class  Ejercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[4];
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }
        double promedio = (double) suma / numeros.length;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
