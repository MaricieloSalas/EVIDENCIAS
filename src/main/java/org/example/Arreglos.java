package org.example;

import java.util.Scanner;

//tema de cambio//
public class Arreglos {
    public void ejercicioOne(){
        int suma =0;//hola
        int number[]= new int[5];
        Scanner tecla = new Scanner(System.in);
        System.out.printf("Numero 1: ");
        number[0] = tecla.nextInt();
        System.out.printf("Numero 2: ");
        number[1] = tecla.nextInt();
        System.out.printf("Numero 3: ");
        number[2] = tecla.nextInt();
        System.out.printf("Numero 4: ");
        number[3] = tecla.nextInt();
        System.out.printf("Numero 5: ");
        number[4] = tecla.nextInt();
        for (int i = 0; i <5; i++) {
            suma = suma+ number[i];
        }
        System.out.println("suma "+suma);
    }
    public void ejercicioDos(){
        int mayor = 0;
        int number[]= new int[5];
        Scanner tecla = new Scanner(System.in);
        System.out.printf("Numero 1: ");
        number[0] = tecla.nextInt();
        System.out.printf("Numero 2: ");
        number[1] = tecla.nextInt();
        System.out.printf("Numero 3: ");
        number[2] = tecla.nextInt();
        System.out.printf("Numero 4: ");
        number[3] = tecla.nextInt();
        System.out.printf("Numero 5: ");
        number[4] = tecla.nextInt();
        for (int i = 0; i < 5; i++) {
            if (number[i]>mayor){
                mayor=number[i];
            }
        }
        System.out.println("mayor acumuado "+ mayor);
    }
    public void ejercicioTres(){
        int nb = 0, proces = -1;
        int number[]= new int[7];
        Scanner tecla = new Scanner(System.in);
        System.out.printf("Numero 1: ");
        number[0] = tecla.nextInt();
        System.out.printf("Numero 2: ");
        number[1] = tecla.nextInt();
        System.out.printf("Numero 3: ");
        number[2] = tecla.nextInt();
        System.out.printf("Numero 4: ");
        number[3] = tecla.nextInt();
        System.out.printf("Numero 5: ");
        number[4] = tecla.nextInt();
        System.out.printf("Numero 6: ");
        number[5] = tecla.nextInt();
        System.out.printf("Numero 7: ");
        number[6] = tecla.nextInt();

        System.out.println("NUMERO A BUSCAR ");
        nb=tecla.nextInt();
        String result = "NO EXISTE";

        for (int i = 0; i <=number.length -1; i++) {
            if (number[i]==nb){
                result="EXISTE";
                proces=i;
                break;
            }
        }
        System.out.println("RESPUESTA "+ result);
        System.out.println("POSICCION "+ proces);
    }
}
