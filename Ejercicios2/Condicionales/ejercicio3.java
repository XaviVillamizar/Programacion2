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
public class ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite un Primer numero:");
        int nume = teclado.nextInt();

        System.out.println("Digite un Segundo numero:");
        int deno = teclado.nextInt();

        if (deno != 0) {
            System.out.println((double) nume / (double) deno);
        } else {
            System.out.println("""
                               Error!
                               No puede Dividir por 0, 
                               Reinicie el programa""");
        }
    }
}
