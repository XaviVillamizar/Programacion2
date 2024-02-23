/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.util.Scanner;

/**
 *
 * @author LabSispc01
 */
public class Ciclista {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la hora de salida de ciudad A: ");
            int HH = scanner.nextInt();
        System.out.println("Ingrese los minutos de salida de ciudad A: ");    
            int MM = scanner.nextInt();
        System.out.println("Ingrese los segundos de salida de ciudad A: ");
            int SS = scanner.nextInt();
        
        System.out.println("Ingrese el tiempo (en segundos) de viaje hasta ciudad B: ");
            int t = scanner.nextInt();
            
        int tiempoSalida = HH * 3600 + MM * 60 + SS;
        int tiempoLlegada = tiempoSalida + t;
        int horasLlegada = tiempoLlegada / 3600;
        int minutosLlegada = (tiempoLlegada % 3600) / 60;
        int segundoLlegada = tiempoLlegada % 360;
        
        System.out.println("Horas de llegada: " +horasLlegada+ " Minutos de llegada: " +minutosLlegada+ " Segundos de llegada: "+segundoLlegada);
    }
}
