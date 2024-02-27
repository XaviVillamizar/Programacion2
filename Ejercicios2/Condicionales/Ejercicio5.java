/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios2.Condicionales;
import java.util.Scanner;

/**
 *
 * @author LabSispc01
 */
public class Ejercicio5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa calcula la potencia de un numero y su exponente;");
        System.out.println("El numero a calcular: ");
            int numero = scanner.nextInt();
        System.out.println("El exponente del numero a calcular: ");
            int exponente = scanner.nextInt();
            
        if (numero>=1) {
            System.out.println("El resultado es: " + (Math.pow(numero, exponente)));
        }else if (exponente==0) {
            System.out.println("El resultado es 1.");
        }else {
            System.out.println("El resultado es: " + (Math.pow(numero, 1/exponente)));
    }
    }
}