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
public class Zombie extends Personaje{

    private int daño;
    private int frecuencia;

    //constructor
    public Zombie(int vida, int daño, int frecuencia) {
        super(vida);
        this.daño = daño;
        this.frecuencia = frecuencia;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "(" + super.toString() + ")";
    }
}
