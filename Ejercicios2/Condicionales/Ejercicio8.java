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
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rectangulo = false;
        
    System.out.println("Programa clasificacion de un triangulo:");
    System.out.print("Introduce el valor del lado A: ");
        int ladoA = scanner.nextInt();
    System.out.print("Introduce el valor del lado B: ");
        int ladoB = scanner.nextInt();
    System.out.print("Introduce el valor del lado C: ");
        int ladoC = scanner.nextInt();
        
    if (ladoA > ladoB && ladoA > ladoC) {
      if ((Math.pow(ladoA,2)) == (Math.pow(ladoB,2)) + (Math.pow(ladoC,2))) {
        rectangulo = true;
      } 
    } else if (ladoB > ladoA && ladoB > ladoC) {
      if ((Math.pow(ladoB,2)) == (Math.pow(ladoA,2)) + (Math.pow(ladoC,2))) {
        rectangulo = true;
      } 
    } else if (ladoC > ladoA && ladoC > ladoB) {
      if ((Math.pow(ladoC,2)) == (Math.pow(ladoA,2)) + (Math.pow(ladoB,2))) {
         rectangulo = true;
      } 
    }
    if ((ladoA == ladoB && ladoA != ladoC) || (ladoA == ladoC && ladoA != ladoB)
        || (ladoB == ladoC && ladoB != ladoA)) {
      if (rectangulo) {
        System.out.println("Es un triangulo rectangulo e isosceles.");
      } else {
        System.out.println("Es un triangulo isósceles.");
      }
    }else if (ladoA == ladoB && ladoB == ladoC) {
    if (rectangulo) {
        System.out.println("Es un triangulo rectangulo y equilatero.");
      } 
    else {
        System.out.println("Es un triangulo equilátero.");
      }
    }
    else {
        if (rectangulo) {
            System.out.println("Es un triangulo rectangulo y escaleno.");
      } 
    else {
        System.out.println("Es un triangulo escaleno.");
      }
    } 
}
}

