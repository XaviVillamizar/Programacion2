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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite un numero");
        int num1=kb.nextInt();
        System.out.println("Digite otro numero");
        int num2=kb.nextInt();
        
       int dist = Math.abs(num1-num2);
       System.out.println("La distancia es: "+dist);
    }
    
}
