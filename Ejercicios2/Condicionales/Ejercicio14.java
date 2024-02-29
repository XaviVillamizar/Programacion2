/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;

import java.util.Scanner;

//Realiza un programa que pida el día de la semana (del 1 al 7) y
//escriba el día correspondiente. Si introducimos otro número nos
//da un error.

public class Condi_N14 {
    public static void main (String[]args){
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("este programa te dira el dia de la semana");
        System.out.println("digita un numero entre el 1 y 7");
        int num = teclado.nextInt();
        
        if (num<1 || num>7){
            System.out.println("el numero que ingresaste no cumple la condición");
        } else{
            if (num == 1 ){
                System.out.println("el dia de la semana es LUNES");
            }else {
                if (num == 2){
                    System.out.println("el dia de la semana es MARTES");
                }else {
                    if (num == 3){
                        System.out.println("el dia de la semana es MIERCOLES");
                    }else {
                        if (num == 4){
                            System.out.println("el dia de la semana es JUEVES");
                        }else {
                            if (num == 5){
                                System.out.println("el dia de la semana es VIERNES");
                            }else {
                                if (num == 6){
                                    System.out.println("el dia de la semana es SABADO");
                                }else {
                                    if (num == 7) {
                                        System.out.println("el dia de la semana es DOMINGO");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
}
