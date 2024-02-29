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
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contador;
        int mayor = 0;
        int igual = 0;
        int menor = 0;

        System.out.print("Digita la cantidad de número a realizar: ");
        contador = teclado.nextInt();
        do {
            if (contador <= 0) {
                System.out.println("El número debe ser positivo. Por favor, digita un nuevo valor.");
                contador = teclado.nextInt();
            }
        } while (contador <= 0);
        for (int i = contador; i > 0; i--) {
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();
            contador = contador - 1;
            if (numero > 0) {
                mayor++;
            } else if (numero < 0) {
                menor++;
            } else {
                igual++;
            }
        }
        System.out.println("Los números digitados son:");
        System.out.println("Hay " + mayor + " que son mayor que 0.");
        System.out.println("Hay " + menor + " que son menor que 0.");
        System.out.println("Hay " + igual + " que son igual a 0.");
    }
}
