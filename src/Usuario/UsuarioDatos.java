/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import java.io.Serializable;

/**
 *
 * @author juniorchunga
 */
public class UsuarioDatos implements Serializable{
    private String nombre;
    private String dni;
    private int puntos;

    public UsuarioDatos() {
        this.nombre = nombre;
        this.dni = dni;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " ,con Dni: " + dni + " con puntos: " + puntos;
    }
      
}
