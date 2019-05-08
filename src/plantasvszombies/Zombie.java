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
public abstract class Zombie extends Personaje{

    private boolean movimiento;
    private int daño;
    private int frecuencia;

    //constructor
    public Zombie(int vida, int daño, int frecuencia) {
        super(vida);
        this.movimiento = movimiento;
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

    public boolean isMovimiento() {
        return movimiento;
    }

    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }
    public void moverZombie(){
        
    }

    public void ataqueZombie(Personaje personaje){
        personaje.setVida(-1);
    }

    @Override
    public String toString() {
        return "(" + super.toString() + ")";
    }
}
