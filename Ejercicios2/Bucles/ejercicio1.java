/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author farfa
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int intento;
        int contador = 10;

        int numAleatorio = (int) (Math.random() * 100 + 1);
        System.out.println("Adivinar un número entre el 1 y 100. ");
        System.out.println("Tienes 10 intentos.");

        do {
            System.out.println("Introduce un número: ");
            intento = teclado.nextInt();
            if (intento > numAleatorio) {
                System.out.println("El número que buscas es menor, te quedan "
                        + (contador - 1) + " intentos: ");
            } else if (intento < numAleatorio) {
                System.out.println("El número que buscas es mayor, te quedan "
                        + (contador - 1) + " intentos: ");
            } else {
                System.out.print("¡Has acertado! " + "el numero era " + numAleatorio
                        + " has usado " + (10 - (contador - 1)) + " intentos.");
            }
            contador--;
        } while (intento != numAleatorio && contador > 0);
        if (contador == 0) {
            System.out.println("Has perdido. El numero era " + numAleatorio + ".");
        }
    }

}
