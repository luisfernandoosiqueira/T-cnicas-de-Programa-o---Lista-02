package com.mycompany.lista01java;

/**
 *
 * @author Luís Fernando
 */
public class Exercicio13 {

    public static void main(String[] args) {

        int i = 1;
            
        System.out.println("Informe o valor da base");

        int base = new java.util.Scanner(System.in).nextInt();

        System.out.println("Informe o valor do expoente");

        int expoente = new java.util.Scanner(System.in).nextInt();

        int potencia = base;
        
        while (i < expoente) {

            base = base * potencia;
            
            i++;

        }

        potencia = base;
        
        System.out.println(potencia);
            
    }
}
