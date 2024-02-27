/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios2.Bucles;

import java.util.Scanner;

/**
 *
 * @author xavis
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Introduce el numero de niveles que tendra la piramide: ");
    int numeroNiveles = scanner.nextInt();
    
    int numeroPosiciones = numeroNiveles * 2 -1;
    int posInicial = numeroNiveles;
    int posFinal = numeroNiveles;
    
    
    for (int i = 0; i < numeroNiveles; i++) {
      int contador = 1;
      String resultado = "";
      
      for (int j=0; j <= numeroPosiciones; j++) {
        if ((j < posInicial) || (j > posFinal)) {
          resultado += " ";
        } else {
          if (j < numeroNiveles) {
            resultado += contador;
            contador++;
          } else {
            resultado += contador;
            contador--;
          }
        }    
      }
      System.out.println(resultado);
      posFinal++;
      posInicial--;
    }
  }
}
