/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author LabSispc01
 */
public class cuadrado {
    private double lado;
    
    public cuadrado(){
        
    }

    public cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

@Override
public String toString() {
    return "cuadrado{" + "lado=" + lado + '}';
    }

public double getArea(){
    double area;
        area= this.lado*this.lado;
        
    return area;
    }
    
    public double getPerimetro(){
        double perimetro;
            perimetro=this.lado*4;
        
    return perimetro;
}  
}
