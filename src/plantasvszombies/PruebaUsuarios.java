/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombies;

import Usuario.*;
import java.io.IOException;

/**
 *
 * @author juniorchunga
 */
public class PruebaUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        UsuarioDatos  us = new UsuarioDatos();
        
        us.setDni("51478121G");
        us.setNombre("Junior");
        AlmacenajeUsuarios almacen = new AlmacenajeUsuarios();
        
        if(almacen.comprobarUsuario(us)){
          System.out.println("Está registrado.");
        } else {
            System.out.println("No lo está");
        }
        
        almacen.guardarUsuario(us);
        
        if(almacen.comprobarUsuario(us)){
          System.out.println("Está registrado.");
        } else {
            System.out.println("No lo está");
        }
        
        AlmacenajeUsuarios.generaFicha(us);
    }
    
}
