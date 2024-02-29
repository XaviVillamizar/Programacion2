/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;
import java.util.Scanner;
//Realiza un programa que pida un número entero entre uno y
//doce e imprima el número de días que tiene el mes
//correspondiente.

public class Condi_N15 {
    public static void main (String []args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Este programa te va a decir el numero de dias que tiene el mes, recuerda ingresar solo numeros del 1 al 12");
        System.out.println ("digite un numero del 1 al 12");
        int num = teclado.nextInt();
        if (num<1 || num>12){
            System.out.println("el numero que ingresaste no cumple la condicion");
        }else {
            if (num == 1 || num== 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12){
                System.out.println("el mes tiene 31 dias");
            }else {
                if (num == 2){
                    System.out.println("el mes tiene 29 dias");
                }else {
                    if (num == 4 || num == 6 || num == 9 || num == 11){
                        System.out.println("el mes tiene 30 dias");
                    }
                }
                
            }
        }
       
        
    }
    
}
