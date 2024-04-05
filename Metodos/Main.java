/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Metodos;

import java.time.LocalDate;

/**
 *
 * @author LabSispc01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    System.out.println("Persona: Metodo que permita conocer la cantidad de años, meses y dia de vida.");
    persona personaEdad = new persona(LocalDate.of(2005, 6, 8));
        System.out.println("La edad de la 'persona' es: "+personaEdad.getEdad()+"\n");
        
    System.out.println("Cuadrado: Metodos que permitan conocer el Area y el Perimetro.");
    cuadrado cuadradoAP = new cuadrado(95);
        System.out.println("El area del cuadrado es: "+cuadradoAP.getArea());
        System.out.println("El perimetro del cuadrado es: "+cuadradoAP.getPerimetro()+"\n");
        
    System.out.println("Circulo: Metodos que permitan conocer el Area y el Perimetro.");
    circulo circuloAP = new circulo(6);
        System.out.println("El area del circulo es: "+circuloAP.getArea());
        System.out.println("El perimetro del circulo es: "+circuloAP.getPerimetro()+"\n");
        
    System.out.println("Triangulo: Metodos que permitan conocer el Area, el Perimetro e hipotenusa.");
    triangulo trianguloAPH = new triangulo(6, 2, 3, 8);
        System.out.println("El area del triangulo es: "+trianguloAPH.getArea());
        System.out.println("El perimetro del triangulo es: "+trianguloAPH.getPerimetro());
        System.out.println("La hipotenusa del triangulo es: "+trianguloAPH.getHipotenusa()+"\n");
                
    }  
}
