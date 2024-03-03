/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package lista2;
import java.util.*;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 01/03/2024
 * @brief Class Exercicio06
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
