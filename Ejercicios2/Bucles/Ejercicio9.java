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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
    int contador, divisor, num;
    boolean esPrimo;
    
        
        System.out.print("Programa numeros primos");
            System.out.println("Insete la cantidad de numeros primos: ");
    int primo = scanner.nextInt();
        System.out.println("1: 2");
        contador = 1;
        num = 3;
    while (contador < primo){
        esPrimo = true;
        divisor=3;
    while ((divisor<=Math.sqrt((num))) && esPrimo) {
        if (num%divisor==0) {
          esPrimo = false;
        }
        divisor +=2;
      }
    if (esPrimo){
        contador +=1;
        System.out.println(contador + ": " + num);
      }
      num +=2;
    }
  }
}

