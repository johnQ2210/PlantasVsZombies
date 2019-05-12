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
public class Celda {

    private boolean ocupado;
    private Personaje personaje;

    public Celda() {
        this.ocupado = ocupado;

    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    /**
     * Se imprime en la celda.
     *
     * @return
     */
    
    @Override
    public String toString() {
        String celda = " ";
        if (this.ocupado) {
            if (this.personaje instanceof ZombieComun) {
                celda = String.format("Zombie", this.personaje.getVida() + 1);
            } else if (this.personaje instanceof LanzaGuisantes) {
                celda = String.format("LanzaGuisante", this.personaje.getVida() + 1);
            } else if (this.personaje instanceof Girasol) {
                celda = String.format("Girasol", this.personaje.getVida() + 1);
            }
        }
        return celda;
    }
}
