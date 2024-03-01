package com.mycompany.lista01java;

/**
 *
 * @author Luís Fernando
 */
public class Exercicio06 {
   
      public static void main(String[] args) {
        
        int distancia;
        
        System.out.println("Informe o coordenada x1");
        int x1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Informe o coordenada y1");
        int y1 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Informe o coordenada x2");
        int x2 = new java.util.Scanner(System.in).nextInt();
        System.out.println("Informe o coordenada y2");
        int y2 = new java.util.Scanner(System.in).nextInt();
        
        distancia = (int)((Math.pow(x1-x2, 2)) + (Math.pow(y1-y2, 2)));
        
        System.out.println("Ponto 1:(" + x1 + "," + "" + y1 + ")");
        System.out.println("Ponto 2:(" + x2 + "," + "" + y2 + ")");
        System.out.println("Distância: " + distancia);
        
    }  
    
}
