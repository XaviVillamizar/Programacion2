/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;
import java.util.Scanner;
/**
 *
 * @author LabSispc01
 */
public class Dinero {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Cantidad de monedas de 2 euros que tienes: ");
    int dosEu = scanner.nextInt();
    System.out.print("Cantidad de monedas de 1 euro que tienes: ");
    int unEu = scanner.nextInt();
    System.out.print("Cantidad de monedas de 50 centimos que tienes: ");
    int cincuCent = scanner.nextInt();
    System.out.print("Cantidad de monedas de 20 centimos que tienes: ");
    int veintCent = scanner.nextInt();
    System.out.print("Cantidad de monedas de 10 centimos que tienes: ");
    int diezCent = scanner.nextInt();
    
    double totalEu = dosEu * 2 + unEu + cincuCent * 0.5 * veintCent * 0.2 + diezCent * 0.1;
    
    int euro = (int) totalEu;
    int cent = (int) ((totalEu - euro)*100);
    
    System.out.print("Dinero total, euros: "+euro+" y centimos: "+cent);
    
    
    }
}
