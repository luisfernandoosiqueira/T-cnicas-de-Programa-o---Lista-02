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
 * @brief Class Exercicio14
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

