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
public class Planta {

    private int vida;
    private int coste;

    //Constructor
    public Planta(int vida, int coste) {
        this.vida = vida;
        this.coste = coste;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "("+  vida + ")" ;
    }
    
    
    

}
