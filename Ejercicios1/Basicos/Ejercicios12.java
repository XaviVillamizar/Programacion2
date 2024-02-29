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
public class Ejercicios12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite el valor de x1");
        int x1=kb.nextInt();
         System.out.println("Digite el valor de y1");
        int y1=kb.nextInt();
         System.out.println("Digite el valor de x2");
        int x2=kb.nextInt();
         System.out.println("Digite el valor de y2");
        int y2=kb.nextInt();
        
        double dist = Math.sqrt (Math.pow ((x2-x1),2) + Math.pow ((y2-y1),2));
        
        System.out.println("La distancia es: "+dist);
    }
    
}
