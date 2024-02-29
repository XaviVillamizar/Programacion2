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
public class Ejerciio10_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner kb = new Scanner(System.in);
        
        System.err.println("Digite los kilogramos de uva entregada");
        int ke = kb.nextInt();
        System.out.println("Precio por kilo inicial");
        double pk = kb.nextDouble();
        System.out.println("Valor de la uva (A o B)");
        String valor= kb.nextLine();
        System.out.println("Tipo de la uva (1 o 2)");
        int tipo = kb.nextInt();
        
      if (!((valor.toUpperCase().equals("A") || valor.toUpperCase().equals("B")) &&
        (tipo == 1 || tipo == 2))) {
      System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
    } else {
      if (valor.toUpperCase().equals("A") && tipo == 1) {
        System.out.println("La ganancia final es de: " + ((ke * pk)+(ke*0.20)));
      } else if (valor.toUpperCase().equals("A") && tipo == 2) {
        System.out.println("La ganancia final es de: " + ((ke*pk)+(ke*0.30)));
      } else if (valor.toUpperCase().equals("B") && tipo == 1) {
        System.out.println("La ganancia final es de: " + ((ke* pk)-(ke*0.30)));
      } else if (valor.toUpperCase().equals("B") && tipo == 2) {
        System.out.println("La ganancia final es de: " + ((ke*pk)-(ke*0.50)));
      }
    }
  }
}
/****/