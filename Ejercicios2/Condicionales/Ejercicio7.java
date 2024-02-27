/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios2.Condicionales;

import java.util.Scanner;

/**
 *
 * @author xavis
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Este programa calcula como son dos circunferencias entre sí, " + "conociendo sus centros y radios:");
        System.out.print("Introduce el valor \"x\" de la primera circunferencia: ");
    int x1 = scanner.nextInt();
        System.out.print("Introduce el valor \"y\" de la primera circunferencia: ");
    int y1 = scanner.nextInt();
        System.out.print("Introduce el radio de la primera circunferencia: ");
    int r1 = scanner.nextInt();
        System.out.print("Introduce el valor \"x\" de la segunda circunferencia: ");
    int x2 = scanner.nextInt();
        System.out.print("Introduce el valor \"y\" de la segunda circunferencia: ");
    int y2 = scanner.nextInt();
        System.out.print("Introduce el radio de la segunda circunferencia: ");
    int r2 = scanner.nextInt();
    

    double distancia = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    if (distancia == 0) {
        System.out.println("Concéntricas.");
    } 
    else if (distancia > (r1+r2)) {
        System.out.println("Exteriores.");
    } 
    else if ((distancia > 0) && distancia < Math.abs(r1-r2)) {
        System.out.println("Interiores.");
    }   
    else if (distancia == (r1+r2)) {
        System.out.println("Tangentes exteriores.");
    } 
    else if (distancia == Math.abs(r1-r2)) {
        System.out.println("Tangentes interiores.");
    } 
    else if (distancia < (r1+r2) && distancia > Math.abs(r1-r2)) {
        System.out.println("Secantes.");
    }
}
}


