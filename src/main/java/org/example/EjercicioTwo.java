package org.example;

import java.util.Scanner;

public class EjercicioTwo {
    private void methodoWhile(){
        int i,number,c=0;
        Scanner tecla = new Scanner(System.in);
        System.out.println("NUMERO: ");
        number = tecla.nextInt();

        while (number>0){
            number= number/10;
            c++;
        }
        System.out.println("cantidad digitos "+ c);
    }
    public void consumidor(){
        methodoWhile();
    }
}
