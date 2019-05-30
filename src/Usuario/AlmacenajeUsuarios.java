/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 *
 * @author juniorchunga
 */
public class AlmacenajeUsuarios {
    HashMap<Object, Object> lista = new HashMap<Object, Object>();
    private String codigoDni;
    private String nombreUsuario;

    public AlmacenajeUsuarios() {
        this.codigoDni = codigoDni;
        this.nombreUsuario = nombreUsuario;
    }

    public HashMap<Object, Object> getLista() {
        return lista;
    }

    public void setLista(HashMap<Object, Object> lista) {
        this.lista = lista;
    }

    public String getCodigoDni() {
        return codigoDni;
    }

    public void setCodigoDni(String codigoDni) {
        this.codigoDni = codigoDni;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    //Guardar el usuario dentro del HashMap
    public void guardarUsuario(UsuarioDatos us){
        if(lista.containsKey(us.getDni())){
            System.out.println("El usuario ya está registrado. No se puede volver a registrar.");
        } else {
            lista.put(us.getDni(), us);
        }
    }
    
    public void borrarUsuario(UsuarioDatos us){
        if(lista.containsKey(us.getDni())){
            lista.remove(us);
        } else{
            System.out.println("No existe éste usuario.");
        }
    }
    //Devolvemos un booleano, si el usuario está o no dentro del HashMap
    public boolean comprobarUsuario(String dni){
        if(lista.containsKey(dni)){
            return true;
        } else {
            return false;
        }
    }
    
    //Para generar el fichero
    public static void generaFicha(UsuarioDatos u) throws IOException{
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("Ranking jugadores.txt")));
        salida.println("-----------------------Ranking jugadores------------------------");
        salida.println("\n");
        salida.println(u.toString());
        salida.println("\n");
        salida.println("----------------------------------------------------------------");
        salida.close();
        
    }
}
