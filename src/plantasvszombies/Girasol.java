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
public class Girasol extends Planta {

    private int frecuencia;

    public Girasol() {
        super(1, 20);
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    public void generarSol(){
        int sol = 0;
        if(frecuencia % 2 == 0){
            sol += 1;
        } else{
            sol += 0;
        }
    }

    @Override
    public String toString() {
        return "Girasol" +  super.toString();
    }
    
}
