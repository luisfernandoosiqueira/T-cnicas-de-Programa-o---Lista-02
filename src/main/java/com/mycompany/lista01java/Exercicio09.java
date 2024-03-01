/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista01java;

/**
 *
 * @author Luís Fernando
 */
public class Exercicio09 {
    
    public static void main(String[] args) {
            
            String triangulo;
            
            System.out.println("Informe o primeiro lado");
            
            int a = new java.util.Scanner(System.in).nextInt();
            
            System.out.println("Informe o segundo lado");
            
            int b = new java.util.Scanner(System.in).nextInt();
            
            System.out.println("Informe o terceiro lado");
            
            int c = new java.util.Scanner(System.in).nextInt();
            
            if (a==b && a==c && b==c){
                triangulo = "Equilátero";
            }
            
            else if (a != b && a != c && b != c){
                triangulo = "Escaleno";    
            }

            else {
                triangulo = "Isósceles";    
            }
                     
        System.out.println(triangulo);
            
        }   
  }
