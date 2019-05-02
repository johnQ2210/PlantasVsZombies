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

    boolean moverse;
    public ZombieComun() {
        super(5, 1, 1);
        this.moverse = moverse;
    }

    public boolean isMoverse() {
        return moverse;
    }

    public void setMoverse(boolean moverse) {
        this.moverse = moverse;
    }
    
    public void avanceCamino(){
        int contador = 0;
        if(super.getFrecuencia()%2 == 0){
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
