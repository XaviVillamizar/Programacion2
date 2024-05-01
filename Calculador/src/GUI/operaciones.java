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

    private String valor1;
    private String valor2;
    private String operacion;

    public operaciones(String valor1, String valor2, String operacion) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacion = operacion;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor1() {
        return valor1;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getValor2() {
        return valor2;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getOperacion() {
        return operacion;
    }

    public String calcular() {
        String salida = "";
        
        if (operacion.equals("/")) {
            salida = String.valueOf(Double.parseDouble(valor1) / Double.parseDouble(valor2));
            
        } else if (operacion.equals("*")) {
            salida = String.valueOf(Double.parseDouble(valor1) * Double.parseDouble(valor2));
            
        } else if (operacion.equals("-")) {
            salida = String.valueOf(Double.parseDouble(valor1) - Double.parseDouble(valor2));
            
        } else if (operacion.equals("+")) {
            salida = String.valueOf(Double.parseDouble(valor1) + Double.parseDouble(valor2));
            
        } else if (operacion.equals("%")) {
            salida = String.valueOf(Double.parseDouble(valor1) % Double.parseDouble(valor2));
        }
        return salida;
    }
}


