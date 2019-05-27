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
    HashMap<String, String> lista = new HashMap<String, String>();
    private String codigoDni;
    private String nombreUsuario;

    public AlmacenajeUsuarios(String codigoDni) {
        this.codigoDni = codigoDni;
        this.nombreUsuario = nombreUsuario;
    }

    public HashMap<String, String> getLista() {
        return lista;
    }

    public void setLista(HashMap<String, String> lista) {
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

    public void guardarUsuario(String codigo, String usuario){
        if(lista.containsKey(codigo)){
            System.out.println("El usuario ya está registrado. No se puede volver a registrar.");
        } else {
            lista.put(codigo, usuario);
        }
    }
    
    public void borrarUsuario(String codigo, String usuario){
        if(lista.containsKey(codigo)){
            lista.remove(codigo);
        } else{
            System.out.println("No existe éste usuario.");
        }
    }
    public boolean comprobarUsuario(String codigo){
        if(lista.containsKey(codigo)){
            return true;
        } else {
            return false;
        }
    }
    
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
