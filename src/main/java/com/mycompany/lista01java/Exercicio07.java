package com.mycompany.lista01java;

/**
 *
 * @author Luís Fernando
 */
public class Exercicio07 {
 
        public static void main(String[] args) {
            
            int maior;
            
            System.out.println("Entre com um valor para A");
            
            int a = new java.util.Scanner(System.in).nextInt();
            
            System.out.println("Entre com um valor para B");
            
            int b = new java.util.Scanner(System.in).nextInt();
            
            if (a>b) {
            maior = a;
            }
            
            else {
            maior = b;
            }
            
            System.out.println("Valor de A: " + a);
            System.out.println("Valor de B: " + b);
            System.out.println("Maior: " + maior);
            
        }   
    
}
