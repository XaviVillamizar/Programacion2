/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio9_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Por favor, digite un año");
        int año = kb.nextInt();
        
        if (año % 400==0){
        System.out.println("Es año bisiesto");
        }
        else if (año % 100 == 0){
        System.out.println("No es bisiesto");    
        }
        else if (año % 4 == 0){
        System.out.println("Es bisiesto");    
        }
        else{
        System.out.println("No es bisiesto");    
        }
    }
    
}
/****/