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
public class LanzaGuisantes extends Planta {

    private int frecuencia;

    public LanzaGuisantes() {
        super(3, 50);
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public void disparoGuisante(ZombieComun zombie) {
        zombie.getVida();

        int disparo = 0;
        while (frecuencia != 0) {
            disparo += 1;
        }
    }

    @Override
    public String toString() {
        return "LanzaGuisantes" + "(" + super.toString() + ")";
    }

}
