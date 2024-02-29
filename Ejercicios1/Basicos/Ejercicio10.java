/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;
import java.util.Scanner;

//Un alumno desea saber cual será su calificación final en la
//materia de Algoritmos. Dicha calificación se compone de los
//siguientes porcentajes:
//55% del promedio de sus tres calificaciones parciales.
//30% de la calificación del examen final.
//15% de la calificación de un trabajo final.

public class N_10 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("programa para calcular su calificacion final");
        System.out.println("ingrese la nota del parcial N1");
        float par1 = teclado.nextFloat();
        System.out.println("ingrese la nota del parcial N2");
        float par2= teclado.nextFloat();
        System.out.println("ingrese la nota del parcial N3");
        float par3= teclado.nextFloat();
        System.out.println("ingrse la nota del examen final");
        float exam= teclado.nextFloat();
        System.out.println("ingrese la nota del trabajo final");
        float trabfin= teclado.nextFloat();
        
        float promed=(par1+par2+par3)/3;
        double calificacion= (promed*0.55)+(exam*0.3)+(trabfin*0.15);
        
        System.out.println("su calificacion final es de: "+calificacion);
        
        
        
    }
    
}
