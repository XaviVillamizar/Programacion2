/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;
import java.util.Scanner;

//Escribe un programa que pida 20 números enteros. Estos números se deben
//introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas
//parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La
//suma total debe aparecer en la esquina inferior derecha.

public class Array_N3 {
    public static void main (String[]args){
Scanner teclado = new Scanner (System.in);
        int matriz [][] = new int [4][5];
        int sumaf []=new int [4];
        int sumac[]= new int [5];
        int total=0;
        
        System.out.println("ingresa 20 numeros que seran repartido en una matriz de 4 filas y 5 columnas");
        for (int f=0; f<4; f++){
            for (int c=0; c<5; c++){
                System.out.println("en la fila "+f+" columna "+c);
                matriz[f][c] = teclado.nextInt();

            }
        }
        System.out.println("*************************"); 
        System.out.println("");
        for(int f=0; f<4; f++){
            for(int c=0; c<5; c++){
                System.out.print(matriz[f][c]+"\t");
                sumaf[f]+=matriz[f][c];
                sumac[c]+=matriz[f][c];
            }
            total+=sumaf[f];
            System.out.println(" | "+sumaf[f]);
            
        }
        for(int i=0; i<5; i++){
            System.out.print("--------");
        }
         System.out.println("");
         for (int f=0; f<1; f++){
        for(int i=0; i<5; i++){
            System.out.print(sumac[i]+"\t");
        }
        System.out.println(" | "+total);
         }
    }
    
}
