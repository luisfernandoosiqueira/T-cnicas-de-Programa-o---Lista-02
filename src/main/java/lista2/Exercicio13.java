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
 * @brief Class Exercicio13
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
