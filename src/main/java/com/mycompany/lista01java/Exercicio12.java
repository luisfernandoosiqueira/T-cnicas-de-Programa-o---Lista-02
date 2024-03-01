package com.mycompany.lista01java;

/**
 *
 * @author Luís Fernando
 */
public class Exercicio12 {

    public static void main(String[] args) {

        int fatorial = 1;

        System.out.println("Informe um número");

        int n = new java.util.Scanner(System.in).nextInt();

        for (int i = 1; i <= n; i++) {

            fatorial *= i;

        }

        System.out.print("O fatorial de " + n + "é " + fatorial);

    }

}
