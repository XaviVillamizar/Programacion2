/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author xavis
 */
public class operaciones {

public static String calcular(String valor1, String valor2, String operacion) {
    String salida = "";
    
    if (operacion.equals("/")){
    salida = String.valueOf(Double.parseDouble(valor1) / Double.parseDouble(valor2));
    }
    if(operacion.equals("*")){
        salida = String.valueOf(Double.parseDouble(valor1)*Double.parseDouble(valor2));
    }
    if(operacion.equals("-")){
        salida = String.valueOf(Double.parseDouble(valor1)-Double.parseDouble(valor2));
    }
    if(operacion.equals("+")){
        salida = String.valueOf(Double.parseDouble(valor1)+Double.parseDouble(valor2));
    }
    if(operacion.equals("%")){
        salida = String.valueOf(Double.parseDouble(valor1)%Double.parseDouble(valor2));
    }
    return salida;
}
}

