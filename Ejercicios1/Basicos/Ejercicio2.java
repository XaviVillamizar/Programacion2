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
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digita la base del rectangulo: ");
        double base = teclado.nextDouble();

        System.out.println("Digita la altura del rectangulo: ");
        double altura = teclado.nextDouble();

        double area = base * altura;
        double perimetro = (2 * base) + (2 * altura);

        System.out.println("El Area Del rectangulo es: " + area);
        System.out.println("El Perimetro Del rectangulo es: " + perimetro);
    }
}
