/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;
import java.util.Scanner;
// Crea un programa que reciba por teclado una cantidad de minutos y te devuelva la conversión en horas y minutos equivalentes.

public class N_7 {
    
    public static void main (String[]args){
        
        Scanner teclado= new Scanner (System.in);
        
        System.out.println("programa para transformar x minutos en horas y minutos ");
        
        System.out.println("ingrese los minutos (solo valores enteros)");
        int min = teclado.nextInt();
        
        float horaf = min/60;
        float minf=min%60;
        
        System.out.println("hora: "+horaf+" min: "+minf);
        
    }
    
}
