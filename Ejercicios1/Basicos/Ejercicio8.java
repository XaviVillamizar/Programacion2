/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;

import java.util.Scanner;

//Un vendedor recibe un sueldo base más un 10% extra por
//comisión de sus ventas, el vendedor desea saber cuanto
//dinero obtendrá por concepto de comisiones por las tres
//ventas que realiza en el mes y el total que recibirá en el mes,
//tomando en cuenta su sueldo base y comisiones.

public class N_8 {
    public static void main(String[]args){
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("calcular el sueldo base mas las comiciones");
        System.out.println("ingrese su sueldo base");
        float sueldo=teclado.nextFloat();
        
        System.out.println("ingrese la primera venta");
        float vent1= teclado.nextFloat();
        System.out.println("ingrese la segunda venta");
        float vent2=teclado.nextFloat();
        System.out.println("ingrese la tercera venta");
        float vent3=teclado.nextFloat();
        
        float comision= (vent1+vent2+vent3)*.10f;
        
        float total = sueldo+comision;
        
        System.out.println ("las comisones son: "+comision);
        System.out.println("el total que recibira en el mes es de: "+total);
        
        
        
    }
}
