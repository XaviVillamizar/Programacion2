/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;
import java.util.Scanner;
/**
 *
 * @author LabSispc01
 */
public class ejercicio19{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese el numero de respuestas correctas: ");
    int respuestaCo = scanner.nextInt();
    System.out.print("Ingrese el numero de respuestas incorrectas: ");
    int respuestaInco = scanner.nextInt();
    System.out.print("Ingrese el numero de respuestas no contestadas: ");
    int respuestaNA = scanner.nextInt();
    
    int notaFinal = (respuestaCo*5) - respuestaInco;
    
    System.out.println("Su nota final es: "+notaFinal);
    }
}
