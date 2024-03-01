package com.mycompany.lista01java;

/**
 *
 * @author Luís Fernando
 */
public class Exercicio15 {

    public static void main(String[] args) {

        System.out.println("Informe o tamanho da matriz quadrada");

        int num = new java.util.Scanner(System.in).nextInt();

        int[][] matriz = new int[num][num];

        System.out.println("Informe cada valor da matriz:");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matriz[i][j] = new java.util.Scanner(System.in).nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("* "); 
                }
            }
            System.out.println();
        }
    }
}


