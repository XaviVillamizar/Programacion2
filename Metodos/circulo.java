/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author LabSispc01
 */
public class circulo {
    private double radio;

    public circulo(){
      
    }
    
    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
@Override
public String toString() {
    return "circulo{" + "radio=" +radio +'}';
    }

public double getArea(){
    double area;
        area=(this.radio*this.radio)*3.14159;
        
    return area;
}

public double getPerimetro(){
    double perimetro;
        perimetro=2*3.14159*this.radio;
        
    return perimetro;
    }
}
