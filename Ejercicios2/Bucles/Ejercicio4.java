/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;
import java.util.Scanner;
//Escribir un programa que imprima todos los números pares entre dos números
//que se le pidan al usuario.

public class Bucles_N4 {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        int min , max;
        
        System.out.println("programa para imprimir los numeros pares entre dos numeros que el usuario digite");
        System.out.println("ingrese el primer numero (recuerde solo valores enteros)");
        int num1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero ");
        int num2 = teclado.nextInt();
        
        if (num1 < num2){
           min = num1;
           max = num2;
        }else {
            min = num2;
            max = num1;
        }
        
        for (int i = min+1; i<max; i++){
           if (i%2==0){
               System.out.print(i+", ");
           }
        }
        
    }
}
