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
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite un valor A");
        int A=kb.nextInt();
        System.out.println("Digite un valor B");
        int B=kb.nextInt();
        
        int C=A;
        A=B;
        B=C;
        
        System.out.println("EL actual valor de A es: "+A+" y el actual valor de B es: "+B);
    }
    
}
