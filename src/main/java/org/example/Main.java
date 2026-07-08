package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matrices matrices=new Matrices();
        matrices.problema3();
    }
    public static void methodWhile(){
        int n, i,c = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero: ");
        n= teclado.nextInt();
        i = 1;
        while (i<=n){
            if (i%5==0){
                c++;
            }
            i++;
        }
        System.out.printf("cantidad " + c);
    }
    private static void methodFor() {
        int n, c = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero: ");
        n = teclado.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0) {
                c++;
            }
        }
        System.out.printf("cantidad " + c);
    }
}