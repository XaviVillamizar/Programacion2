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
public class Iniciales {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
    System.out.print("Ingrese su primer apellido: ");
        String apellido1 = scanner.nextLine();
    System.out.print("Ingrese su segundo apellido: ");
        String apellido2 = scanner.nextLine();
        
    char inicialNombre = nombre.charAt(0);
    char inicialApellido1 = apellido1.charAt(0);
    char inicialApellido2 = apellido2.charAt(0);
    
    System.out.println("Las iniciales de su nombre son: " +inicialNombre+inicialApellido1+inicialApellido2);
    }
}
