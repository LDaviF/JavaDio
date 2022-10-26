package edu.davi.firstWeek.view.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();

        System.out.println("Digite o segunddo valor: ");
        b = scan.nextInt();
    }

    public static int somar(int a , int b) {
        return a + b;
    }

    public static int subtrair(int a, int b ) {
        return a - b;
    }

    public static int multiplicar(int a, int b ) {
        return a * b;
    }

    public static int dividir(int a, int b ) {
        return a / b;
    }


}
