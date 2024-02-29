/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIU;
import java.util.Scanner;

//Escribe un programa que pida el limite inferior y superior de un intervalo. Si el
//límite inferior es mayor que el superior lo tiene que volver a pedir. A
//continuación se van introduciendo números hasta que introduzcamos el 0.
//Cuando termine el programa dará las siguientes informaciones:
//• La suma de los números que están dentro del intervalo (intervalo abierto).
//• Cuantos números están fuera del intervalo.
//• Informa si hemos introducido algún número igual a los límites del intervalo.

public class Bucles_N5 {
    public  static void main (String []args){
        Scanner teclado = new Scanner (System.in);
        System.out.println("este programa va a sumar los datos que estan dentro de los intervalos que el usuario digite");
        System.out.println("se le pediran algunos datos y al final se le mostrara la suma de los datos dentro del los intervalos, cuantos numejor estan fuera");
        System.out.println("y informar si hubo algun numero igual a de los limites del intervalo");
        int inferior, superior, num,suma=0,cont=0;
        boolean si = false;
        do {
        System.out.println("ingrese el limite inferior");
        inferior = teclado.nextInt();
        System.out.println("ingrese el limite superior");
        superior = teclado.nextInt();
        
        if (inferior>superior){
            System.out.println("recuerda que el limite superior tiene  que ser mayor que el inferior, por favor revise y vuelva a introducir los limites ");
        }
        
        } while (inferior>superior);
        
        do {
            System.out.println("digite un numero, en caso de que quieres terminar y ver los resultados digite 0");
            num = teclado.nextInt();
            if (num!=0){
                if (num>inferior && num<superior){
                    suma=suma+num;
                }else {
                    if (num<=inferior || num>=superior){
                        cont ++;
                    }
                }
                if (num==inferior || num== superior){
                    si = true;
                }
            }
            
        }while(num!=0);
        
        System.out.println("la suma de los numeros que ingresastes entre los limites "+inferior+" - "+superior+" es de: "+suma);
        System.out.println("los numeros que quedaron fuera de los intervalos fueron: "+cont);
        if (si){
        System.out.println("alguno de los numeros que ingresastes eran iguales al de los limites");
                }else {
            System.out.println("no hubieron numeros iguales al de los limites");
        }
    }
}
