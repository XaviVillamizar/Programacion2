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
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el primer numero: ");
        int n1 = teclado.nextInt();

        System.out.println("Digite el segundo numero: ");
        int n2 = teclado.nextInt();

        int suma = n1 + n2;
        int Resta = n1 - n2;
        int multi = n1 * n2;
        int divi = n1 / n2;

        System.out.println("suma: " + suma + "  resta: " + Resta + "  multiplicacion: " + multi + "  division: " + divi);

    }
}
