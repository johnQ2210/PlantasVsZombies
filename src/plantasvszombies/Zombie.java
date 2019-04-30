/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombies;

/**
 *
 * @author juniorchunga
 */
public abstract class Zombie {

    private int vida;
    private int daño;

    //constructor
    public Zombie(int vida, int daño) {
        this.vida = vida;
        this.daño = daño;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    public abstract void ataqueZombie (int daño);

    @Override
    public String toString() {
        return "(" + vida + ")";
    }

    
}
