/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios2.Condicionales;
import java.util.Scanner;
/**
 *
 * @author xavis
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    System.out.print("Solicitud de aceptacion.\n");
        System.out.println("Edad: ");
            byte edad = scanner.nextByte();
        System.out.println("Nota: ");
            byte nota = scanner.nextByte();
        System.out.println("Sexo (M) o (F): ");
            String sexo = scanner.next();
        
        if ((edad>=18) && (nota>=5) && (!sexo.equals("M"))){
            System.out.print("Pobile solicitud aceptada. \n");}
        if ((edad>=18) && (nota>=5) && (!sexo.equals("F"))){
            System.out.print("Solicitud aceptada. \n");
        }
        else{
            System.out.print("Solicitud no aceptada");
        }
}
}
    

