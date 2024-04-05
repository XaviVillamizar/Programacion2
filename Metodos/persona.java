/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Metodos;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author LabSispc01
 */
public class persona {
    private LocalDate fechaNac;
    
public persona (LocalDate fechaNac) {
    this.fechaNac = fechaNac;
}

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }


    @Override
    public String toString() {
        return "perona{" + "fechaNacimiento=" + fechaNac +'}';
    }
    
    public Period getEdad(){
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNac, fechaActual);
    }
}

