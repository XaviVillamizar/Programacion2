/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;
import java.util.Scanner;
//Escribe un programa que calcule la media de tres números introducidos por teclado.

public class N_6 {
         public static void main (String[]args){
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("programa para calcular la media de tres numeros");
        System.out.println("ingrese el primer numero (solo numeros enteros)");
        int n1=teclado.nextInt();
        System.out.println("ingrese el segundo numero (solo numeros enteros)");
        int n2=teclado.nextInt();
        System.out.println("ingrese el tercer numero (solo numeros enteros)");
        int n3=teclado.nextInt();
        
        int suma= n1+n2+n3;
        int med= suma/3;
        
        System.out.println("la media es: "+med);
        
    }
    
    
}
