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
public class Ejercicio11_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de alumnos que iran al viaje");
        int cantA = kb.nextInt();
        
         if (cantA >= 100) {
      System.out.println("El apgo del viaje es de " + cantA*65 + " "
          + "euros, cada alumno paga 65 euros");
    } else if (cantA <100 && cantA >= 50) {
      System.out.println("El apgo del viaje es de" + cantA*70 + " "
          + "euros, cada alumno paga 70 euros");
    } else if (cantA < 50 && cantA >= 30) {
      System.out.println("El apgo del viaje es de " + cantA*95 + " "
          + "euros, cada alumno paga 95 euros");
    } else {
      System.out.println("El coste del autobús es de 4000 euros y cada alumno "
          + "debe pagar " + (4000/cantA) + " euros.");
    }
    
}/****/
}
