/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombies;

import java.util.ArrayList;

/**
 *
 * @author juniorchunga
 */
public class Personaje {
    private int vida;

    public Personaje(int vida){
        this.vida = vida;
    }
    
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida += vida;
    }
    
}
