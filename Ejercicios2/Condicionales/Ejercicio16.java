/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;
import java.util.Scanner;


//Una compañía de transporte internacional tiene servicio en algunos países de
//América del Norte, América Central, América del Sur, Europa y Asia. El costo por
//servicio de transporte se basa en el peso del paquete y la zona a la que va
//dirigida. Parte de su política implica que los paquetes con un peso superior a
//5kg no son transportados, por cuestiones de logística y seguridad.
//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o,
//en su caso, el rechazo de la entrega.
//ZONA UBICACIÓN       COSTO/KILOGRAMO
//1 América del Norte             24,00 euros
//2 América Central                20, 00 euros
//3 América del Sur                21,00 euros
//4 Europa                             10,00 euros
//5 Asia                                  18,00 euros


public class Condi_N16 {
    public static void main (String []args){
         Scanner teclado = new Scanner (System.in);
        System.out.println("este es un programa de envio de paquetes");
        System.out.println("por favor ingresa la opcion al lugar donde quiere enviar el paquete");
        System.out.println("opcion 1: America del Norte ");
        System.out.println("opcion 2: America Central");
        System.out.println("opcion 3: America del Sur");
        System.out.println("opcion 4: Europa");
        System.out.println("opcion 5: Asia");
        int num = teclado.nextInt();
          if (num <1 || num>5){
              System.out.println("la opcion que elegiste no existe");
              System.exit(0);
         }
         System.out.println("por favor ingrese el peso del paquete");
         float peso = teclado.nextFloat();
             if (peso <0 || peso>5){
                  System.out.println("lo siento pero su paquete no se puede enviar por exceso de peso o ingesaste mal el peso del paquete");
                     System.exit(0);
             }   
             if (num == 1){
                  System.out.println("el costo total de la entrega es de: "+ peso*24+" euros");
             }else {
                 if (num == 2){
                     System.out.println("el costo total de la entrega es de: "+ peso*20+" euros");
                 }else {
                     if (num== 3){
                         System.out.println("el costo total de la entrega es de: "+ peso*21+" euros");
                     }else {
                         if (num == 4){
                             System.out.println("el costo total de la entrega es de: "+ peso*10+" euros");
                         }else {
                             if (num == 5){
                                 
                                 System.out.println("el costo total de la entrega es de: "+ (peso*18+" euros"));
                             }
                         }
                     }
                 }
             }
                
             
        
          }
    
}
