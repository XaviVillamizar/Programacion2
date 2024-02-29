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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite un numero");
        int num=kb.nextInt();
        
        double raiz=Math.sqrt(num);
        double raiz3=Math.cbrt(num);
        System.out.println("la raiz cuadrada es: "+raiz);
        System.out.println("la raiz cubica es: "+raiz3);
    }
    
}
