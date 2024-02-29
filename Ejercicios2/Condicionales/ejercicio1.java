/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author farfa
 */
public class ejercicio1 {
    //Ejercicio condicional

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        int n1 = teclado.nextInt();

        System.out.println("Digite el segundo numero: ");
        int n2 = teclado.nextInt();

        if (n1 > n2) {
            System.out.println("El numero " + n1 + " es mayor que el numero " + n2);
        } else if (n1 < n2) {
            System.out.println("El numero " + n2 + " es mayor que el numero " + n1);

        } else {
            System.out.println("Ambos numeros son iguales");
        }
    }
}
