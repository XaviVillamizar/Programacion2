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
public class Ejercicio7_bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        double tP=0;
        System.out.println("Digite la primera cuota a pagar");
        double ct = kb.nextDouble();
        System.out.println("Digite la cantidad de meses a financiar");
        int ms=kb.nextInt();
        
        for(int i=1; i<=ms; i++){
        System.out.println("Cuota "+i+"= "+ct);
        tP+=ct;
        ct*=2;
        }
        System.out.println("Tatal a pagar por el producto :" +(int)tP);
    }
    
}/****/
