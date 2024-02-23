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
public class ejercicio16 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.print("Ingrese la distancia (km) entre los 2 vehiculos: ");
            double distancia = scanner.nextDouble();
            
        System.out.print("Velocidad (km/h) del vehiculo 1: ");
            double velocidad1 = scanner.nextDouble();
            
        System.out.print("Velocidad (km/h) del vehiculo 2: ");
            double velocidad2 = scanner.nextDouble();
            
        double tiempoHoras = distancia / (velocidad1 + velocidad2);
        double tiempoMinutos = tiempoHoras * 60;
        
        System.out.print("El vehiculo alcanzara al otro en, "+tiempoMinutos+" minutos. ");
            
        
            
        
}
}
