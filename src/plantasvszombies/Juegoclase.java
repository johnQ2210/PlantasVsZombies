/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombies;

import java.util.ArrayList;

/**
 *
 * @author juniorchunga
 */
public class Juegoclase {

    private ArrayList<LanzaGuisantes> l;
    private ArrayList<Girasol> g;
    private ArrayList<ZombieComun> z;
    private int sol;
    private String nivel;
    private int turno;


    public Juegoclase(int sol) {
        this.sol = sol;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getSol() {
        return sol;
    }

    public int setSol(int sol) {
        return this.sol = 50;
    }

    public ArrayList<LanzaGuisantes> getL() {
        return l;
    }

    public void setL(ArrayList<LanzaGuisantes> l) {
        this.l = l;
    }

    public ArrayList<Girasol> getG() {
        return g;
    }

    public void setG(ArrayList<Girasol> g) {
        this.g = g;
    }

    public ArrayList<ZombieComun> getZ() {
        return z;
    }

    public void setZ(ArrayList<ZombieComun> z) {
        this.z = z;
    }

    public void añadirGirasol(Girasol girasol) {
        if (sol >= girasol.getCoste()) {
            g.add(girasol);
        }
    }

    public void eliminarGirasol(Girasol girasol) {
        int n = girasol.getVida();
        if (g.contains(girasol)) {
            if (n == 0) {
                g.remove(girasol);
            }
        }
    }

    public void añadirLanzaGuisante(LanzaGuisantes lanzaGuisante) {
        if (sol >= lanzaGuisante.getCoste()) {
            l.add(lanzaGuisante);
        }
    }

    public void eliminarLanzaGuisante(LanzaGuisantes lanzaGuisante) {
        int n = lanzaGuisante.getVida();
        if (l.contains(lanzaGuisante)) {
            if (n == 0) {
                l.remove(lanzaGuisante);
            }
        }
    }

    public void añadirZombie(ZombieComun zombie) {
        z.add(zombie);
    }

    public void eliminarZombie(ZombieComun zombie) {
        int n = zombie.getVida();
        if (z.contains(zombie)) {
            if (n == 0) {
                z.remove(zombie);
            }
        }
    }

    public void eleccionNivel(String nivel) {
        int numeroZombies = 0;
        switch (nivel) {
            case "Baja":
                numeroZombies = 5;
                if(turno == 10){
                    inicioAparicion();
                    
                }
                //cantidadZombies(numeroZombies);
                
                
                break;
            case "Media":
                numeroZombies = 15;
                if (turno == 7){
                    inicioAparicion();
                }
                //cantidadZombies(numeroZombies);
                break;
            case "Alta":
                numeroZombies = 25;
                if(turno == 5){
                    inicioAparicion();
                }
                //cantidadZombies(numeroZombies);
                break;
            case "Imposible":
                numeroZombies = 50;
                if(turno == 5){
                    inicioAparicion();
                }
                //cantidadZombies(numeroZombies);
                
                break;
        }
    }
    
    public boolean cantidadZombies(int nZombies){
        if(z.size() == nZombies ){
            return true;
        } else{
            return false;
        }
    }
    public boolean inicioAparicion(){
        return true;
    }

}
