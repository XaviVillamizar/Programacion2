/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;
import java.util.Scanner;

//Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’
//en caso contrario, el programa termina cuando se introduce un espacio.

public class Bucles_N3 {
    public static void main (String []args){
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("este programa va leer los caracteres que ingreses y te dira si son vocales o no");
        System.out.println("ingrese los caracteres a analizar, este programa terminara si introduces un espacio");
        String texto = teclado.nextLine();
        boolean vocal = true;
        
        while (!texto.equals(" ")){
            int longitud = texto.length();
            for (int i=0; i<longitud; i++){
                char caracter = texto.toUpperCase().charAt(i);
                if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                    vocal = true;
                }else {
                    vocal = false;
                    break;
                }
            }
            if (vocal){
                System.out.println("los caracter son vocales");
            }else {
                System.out.println("los caracter no son vocales");
            }
            System.out.println("ingrese nuevos caracteres para analizar, de lo contrario si quieres cerrar el programa introduzca un espacio");
            texto = teclado.nextLine();
        }
        
    }
    
}
