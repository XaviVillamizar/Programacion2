/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author farfa
 */
public class ejercicio4 {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite una letra: ");
        char letra = (char) System.in.read();

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra digitada es mayúscula");
        } else {
            System.out.println("La letra digitada no es mayúscula");
        }
    }
}
