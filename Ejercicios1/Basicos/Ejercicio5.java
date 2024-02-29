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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("la temperatura es en fahrenheit es: ");

        float fahrent = teclado.nextFloat();
        float celsius = (fahrent - 32) * 5 / 9;
        System.out.println("La temperatura en celsius es: " + celsius);

    }
}
