/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio12_condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        double prec, imp;
        
        System.out.println("Tiempo de la llamada en minutos");
        int tm=kb.nextInt();
        System.out.println("Dia en el que se realizo la llamada");
        String dia = kb.nextLine();
        
         if (tm > 10){
        prec = 3;
    } else if (tm > 8){
        prec = 2.5;
    } else if (tm > 5){
        prec = 1.80;
    } else {
        prec = 1;
    }   
       
     if (!dia.toLowerCase().equals("domingo")){
       System.out.println("En que momento del dia se hizo la llmada");
       String hor=kb.nextLine();
       imp = switch (hor.toLowerCase()) {
                case "mañana" -> prec*0.15;
                case "tarde" -> prec*0.10;
                default -> 0;
            };
     } else{
       imp=prec*0.03;
     }
     
     
     if (imp==0){
     System.out.println("Los datos son incorrectos, por favor reinicie el programa y digite los datos correctamente");
     } else{
       System.out.println("El precio de la llamada es de: " +(prec+imp)+" el precio base es de: "+prec+" y el impuesto de: "+imp);
     }
     }
}    //
    
   

