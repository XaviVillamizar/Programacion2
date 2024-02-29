/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite un numero de 2 cifras");
        int num=kb.nextInt();
        
        int dig1=num/10;
        int dig2=num%10;
        int inv = dig2*10+dig1;
        
        System.out.println("El numero invertido es: "+inv);
    }
    
}
