/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import java.util.HashMap;

/**
 *
 * @author juniorchunga
 */
public class AlmacenajeUsuarios {
    HashMap lista = new HashMap();
    private UsuarioDatos usuario;

    public AlmacenajeUsuarios() {
        this.usuario = usuario;
    }
    
    public void añadirUsuario(UsuarioDatos u){
        if(lista.containsValue(u)){
            
        }else {
            lista.put(usuario.getDni(), u);
        }
    }
    public boolean comprobarUsuario (String dni){
        if(lista.containsKey(dni)){
            return false;
        } else return true;
    }
}
