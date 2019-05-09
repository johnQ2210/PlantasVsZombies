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
    int fila;
    int column;
    public ZombieComun(boolean moverse, int fila, int column) {
        super(5, 1, 1);
        this.moverse = moverse;
        this.fila = fila;
        this.column = column;
    }

    public boolean isMoverse() {
        return moverse;
    }

    public void setMoverse(boolean moverse) {
        this.moverse = moverse;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    public void mover(){
        
    }

    public void ataqueZombie(Personaje personaje){
        personaje.setVida(-1);
    }

    @Override
    public String toString() {
        return "Zombie" + super.toString();
    }
    
    
}
