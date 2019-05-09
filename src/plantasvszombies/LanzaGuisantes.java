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
public class LanzaGuisantes extends Planta implements Plantasinterface{

    private int alcance;
    private int fila;
    
    public LanzaGuisantes(int fila) {
        super(3, 50, 1, 1);
        this.alcance = 1;
        this.fila = fila;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }
    public void accion(ZombieComun zombie){
        zombie.setVida(-1);
    }

}
