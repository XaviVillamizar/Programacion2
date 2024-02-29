/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basicos;

import java.util.Scanner;

/**
 *
 * @author LabSispc03
 */
public class Ejercicio1 {
    
        public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        
            System.out.println("Digite su nombre: ");
            String nombre = teclado.nextLine();
        
        System.out.println("Hola, Buen dia "+nombre);
    }
}
