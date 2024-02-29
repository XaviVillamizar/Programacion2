/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author farfa
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[10];

        System.out.println("Digita 10 números, Por favor.");

        for (int i = 0; i < 10; i++) {
            num[i] = teclado.nextInt();
        }
        System.out.println("El orden inverso es: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
