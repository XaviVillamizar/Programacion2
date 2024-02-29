/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;

import java.util.Scanner;

//Realiza un programa que pida por teclado el resultado (dato
//entero) obtenido al lanzar un dado de seis caras y muestre por
//pantalla el número en letras (dato cadena) de la cara opuesta al
//resultado obtenido.
//Nota1: En las caras opuestas de un dado de seis caras están los
//números: 1-6, 2-5 y 3-4.
//Nota 2: Si el número del dado introducido es menor que 1 o mayor
//que 6, se mostrará el mensaje: «ERROR: número incorrecto

public class Condi_N13 {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("bienvenido, este programa te dira la cara contraria del dado, recuerda que no puede ser un numero negativo ni mayor que 6");
        System.out.println("ingrese el resultado del dado");
        int dado= teclado.nextInt();
        
        if (dado <1 || dado >6){
            System.out.println("el numero que ingresastes no cumple con las condiciones");
        }else{
            if (dado ==1 || dado==6){
                String uno= "si el numero del dado te dio 1 su cara opuesta es 6  (1-6) y si el numero del dado te dio 6 su cara opuesta es 1 (6-1)";
                System.out.println(uno);
            }else{
                if(dado ==2 || dado==5){
                    String dos= "si el numero del dado te dio 2 su cara opuesta es 5  (2-5) y si el numero del dado te dio 5 su cara opuesta es 2 (5-2)";
                    System.out.println(dos);
                }else {
                    if(dado ==3 || dado ==4){
                        String tres= "si el numero del dado te dio 3 su cara opuesta es 4  (3-4) y si el numero del dado te dio 4 su cara opuesta es 3 (4-3)";
                        System.out.println(tres);
                    }
                }
            }
        }
        
    }
    
}
