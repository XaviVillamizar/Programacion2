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
public class Ejercicio6_bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite el numero base");
        double num = kb.nextDouble();
        System.out.println("Digite el numero que equivaldra al exponente");
        int exp = kb.nextInt();
        
        double result=num;
        
        for(int i=1; i<exp; i++){
        result=result*num;
        }
        
        System.out.println("El resultado es: "+result);
        
    }
    
}/****/
