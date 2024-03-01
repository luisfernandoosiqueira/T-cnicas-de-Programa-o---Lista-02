package com.mycompany.lista01java;

/**
 *
 * @author Luís Fernando
 */
public class Exercicio14 {
  
    public static void main(String[] args) {
        
        int limite = 1000;
        
        for (int num = 2; num <= limite; num++) {
            boolean ehPrimo = true; 
            
            int raiz = (int) Math.sqrt(num);
            
            for (int divisor = 2; divisor <= raiz; divisor++) {
                if (num % divisor == 0) { 
                    ehPrimo = false; 
                    break; 
                }
            }
            
            if (ehPrimo) {
                System.out.println(num); 
            }
        }
    }
} 

