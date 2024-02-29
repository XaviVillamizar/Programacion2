/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;
//Una tienda ofrece un descuento del 15% sobre el total de la
//compra y un cliente desea saber cuánto deberá pagar
//finalmente por su pedido.

import java.util.Scanner;

public class N_9 {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("calcular descuento");
        System.out.println("ingrese el valor a pagar");
        float valor= teclado.nextFloat();
        
        float descuento = valor*.10f;
        
        System.out.println("el valor total a pagar  es de: "+descuento);
    }
    
}
