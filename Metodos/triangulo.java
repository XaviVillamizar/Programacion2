/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author LabSispc01
 */
public class triangulo {
    private double lado1, lado2, base, altura;

    public triangulo(double lado1, double lado2, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    triangulo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setAltura(double base) {
        this.base = base;
    }
    
    public void setLado3(double altura) {
        this.altura = altura;
    }

@Override
public String toString() {
    return "triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", base=" + base + ", altura=" + altura + '}';
    }



public double getArea(){
    double area;
        area=(base*altura)/2;
    return area;
}

public double getHipotenusa(){
    double hipo;
        hipo = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
    return hipo;
}

public double getPerimetro(){
    double perimetro;
        perimetro=(lado1+lado2+base);
    return perimetro;
    
}


    
   
}



