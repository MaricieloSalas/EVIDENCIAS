package org.example;

import java.util.Scanner;

public class Matrices {
    public void ejemplo1(){
        int suma = 0;
        int numero[][]= new int[3][2];
        Scanner tecla = new Scanner(System.in);
        System.out.println("NUMERO (0,0): ");
        numero[0][0]= tecla.nextInt();
        System.out.println("NUMERO (0,1): ");
        numero[0][1]= tecla.nextInt();
        System.out.println("NUMERO (1,0): ");
        numero[1][0]= tecla.nextInt();
        System.out.println("NUMERO (1,1): ");
        numero[1][1]= tecla.nextInt();
        System.out.println("NUMERO (2,0): ");
        numero[2][0]= tecla.nextInt();
        System.out.println("NUMERO (2,1): ");
        numero[2][1]= tecla.nextInt();

        for (int i = 0; i <=2 ; i++) {
            for (int j = 0; j <= 1; j++) {
                suma = suma + numero[i][j];
            }
        }
        System.out.println("suma "+suma);
    }
    public void ejemplo2(){
        int suma0 = 0,suma1 = 0,suma2 = 0;
        int numero[][]= new int[4][3];
        Scanner tecla = new Scanner(System.in);
        System.out.println("NUMERO (0,0): ");
        numero[0][0]= tecla.nextInt();
        System.out.println("NUMERO (0,1): ");
        numero[0][1]= tecla.nextInt();
        System.out.println("NUMERO (0,2): ");
        numero[0][2]= tecla.nextInt();
        System.out.println("NUMERO (1,0): ");
        numero[1][0]= tecla.nextInt();
        System.out.println("NUMERO (1,1): ");
        numero[1][1]= tecla.nextInt();
        System.out.println("NUMERO (1,2): ");
        numero[1][2]= tecla.nextInt();
        System.out.println("NUMERO (2,0): ");
        numero[2][0]= tecla.nextInt();
        System.out.println("NUMERO (2,1): ");
        numero[2][1]= tecla.nextInt();
        System.out.println("NUMERO (2,1): ");
        numero[2][2]= tecla.nextInt();
        System.out.println("NUMERO (3,0): ");
        numero[3][0]= tecla.nextInt();
        System.out.println("NUMERO (3,1): ");
        numero[3][1]= tecla.nextInt();
        System.out.println("NUMERO (3,2): ");
        numero[3][2]= tecla.nextInt();

        for (int i = 0; i <=3 ; i++) {
            suma0= suma0+ numero[i][0];
            suma1= suma1+ numero[i][1];
            suma2= suma2+ numero[i][2];
        }
        System.out.println("suma columna 0 "+ suma0);
        System.out.println("suma columna 1 "+ suma1);
        System.out.println("suma columna 2 "+ suma2);
    }
    public void problema3(){
        int pares = 0, impares = 0;
        int numero[][]= new int[3][2];
        Scanner tecla = new Scanner(System.in);
        System.out.println("NUMERO (0,0): ");
        numero[0][0]= tecla.nextInt();
        System.out.println("NUMERO (0,1): ");
        numero[0][1]= tecla.nextInt();
        System.out.println("NUMERO (1,0): ");
        numero[1][0]= tecla.nextInt();
        System.out.println("NUMERO (1,1): ");
        numero[1][1]= tecla.nextInt();
        System.out.println("NUMERO (2,0): ");
        numero[2][0]= tecla.nextInt();
        System.out.println("NUMERO (2,1): ");
        numero[2][1]= tecla.nextInt();
        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <= 1; j++) {
                if (numero[i][j]%2==0){
                    pares=pares+1;
                }else {
                    impares= impares+1;
                }
            }
        }
        System.out.println("pares "+ pares);
        System.out.println("impares "+impares);
    }
}