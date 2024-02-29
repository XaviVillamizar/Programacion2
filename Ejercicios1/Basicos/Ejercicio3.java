/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basicos;

import java.util.Scanner;

/**
 *
 * @author LabSispc03
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el valor del cateto A: ");
        int cateto_A = teclado.nextInt();

        System.out.println("Digite el valor del cateto B: ");
        int cateto_B = teclado.nextInt();

        double hipotenusa = Math.sqrt(Math.pow(cateto_A, 2) + Math.pow(cateto_B, 2));

        System.out.println("La hipotenusa es: " + hipotenusa);

    }
}
