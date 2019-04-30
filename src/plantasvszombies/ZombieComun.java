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
public class ZombieComun extends Zombie {
    private int frecuencia;

    public ZombieComun() {
        super(5, 1);
    }
    
    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }
    
    public void avanceCamino(){
        int contador = 0;
        if(frecuencia%2 == 0){
            contador += 1; 
        } else {
            contador += 0;
        }
    }
    public void ataqueZombie (int daño){
        
    }

    @Override
    public String toString() {
        return "Zombie" + super.toString();
    }
    
    
}
