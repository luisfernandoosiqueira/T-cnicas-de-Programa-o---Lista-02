package com.mycompany.lista01java;

/**
 *
 * @author Luís Fernando
 */
public class Exercicio05 {
        
    public static void main(String[] args) {
        
        int distancia;
        
        System.out.println("Informe a velocidade");
        int velocidade = new java.util.Scanner(System.in).nextInt();
        System.out.println("Informe o tempo de viagem");
        int tempo = new java.util.Scanner(System.in).nextInt();
        
        distancia = velocidade * tempo;
        
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Tempo de viagem: " + tempo + " horas");
        System.out.println("Distância percorrida " + distancia + " km");
        
    }
}

