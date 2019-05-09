/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombies;

import java.util.*;
import java.lang.*;

/**
 *
 * @author juniorchunga
 */
public class Juegoclase {

    private ArrayList<LanzaGuisantes> l;
    private ArrayList<ZombieComun> z;
    private int sol;
    private String nivel;
    private int turno;
    private int Zombies;
    private int Zombiescreados = 0;
    private int zombiesMuertos = 0;
    private Celda[][] celdaTablero;
    private int Girasoles;
    private int[] salidaZombie;
    private int turnoZombie;
    private int filas;
    private int columnas;

    private boolean colocarGirasol;
    private boolean colocarLanzaGuisante;

    public Juegoclase(int filas, int columnas, String nivel) {
        this.filas = filas;
        this.columnas = columnas;
        this.sol = 50;
        this.nivel = nivel;
        this.turno = 0;
        this.colocarGirasol = true;
        this.colocarLanzaGuisante = true;
        this.Zombies = this.nivel_zombies();
        this.z = new ArrayList<ZombieComun>();
        this.l = new ArrayList<LanzaGuisantes>();
        this.Girasoles = 0;
        this.turnoZombie = this.turnoZombie;
        this.aparecerZombies();
        this.celdaTablero = new Celda[this.filas][this.columnas];
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                this.celdaTablero[i][j] = new Celda();
            }
        }
    }

    public int getZombiescreados() {
        return Zombiescreados;
    }

    public void setZombiescreados(int Zombiescreados) {
        this.Zombiescreados = Zombiescreados;
    }

    public int getGirasoles() {
        return Girasoles;
    }

    public void setGirasoles(int Girasoles) {
        this.Girasoles = Girasoles;
    }

    public int[] getSalidaZombie() {
        return salidaZombie;
    }

    public void setSalidaZombie(int[] salidaZombie) {
        this.salidaZombie = salidaZombie;
    }

    public int getTurnoZombie() {
        return turnoZombie;
    }

    public void setTurnoZombie(int turnoZombie) {
        this.turnoZombie = turnoZombie;
    }
    
    /**
     * Dependiendo del nivel, el zombie empieza en un turno x o en y
     * @return 
     */
    public int turnosZombie() {
        int turno = 0;
        switch (this.nivel) {
            case "Baja":
                turno = 10;
                break;
            case "Media":
                turno = 7;
                break;
            case "Alta":
                turno = 5;
                break;
            case "Imposibles":
                turno = 5;
                break;
        }
        return turno;
    }

    public int nivel_zombies() {
        int zombies = 0;
        switch (nivel) {
            case "Baja":
                zombies = 5;
                break;
            case "Media":
                zombies = 15;
                break;
            case "Alta":
                zombies = 25;
                break;
            case "Imposibles":
                zombies = 50;
                break;
        }
        return zombies;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno += turno;
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
        return this.sol += sol;
    }

    public ArrayList<LanzaGuisantes> getL() {
        return l;
    }

    public void setL(ArrayList<LanzaGuisantes> l) {
        this.l = l;
    }

    public ArrayList<ZombieComun> getZ() {
        return z;
    }

    public void setZ(ArrayList<ZombieComun> z) {
        this.z = z;
    }

    public int getZombies() {
        return Zombies;
    }

    public void setZombies(int Zombies) {
        this.Zombies = Zombies;
    }

    public int getZombiesMuertos() {
        return zombiesMuertos;
    }

    public void setZombiesMuertos(int zombiesMuertos) {
        this.zombiesMuertos += zombiesMuertos;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    /**
     * Colocamos un girasol en la fila y columna que recibimos
     * @param fila
     * @param columna 
     */
    public void colocarGirasol(int fila, int columna) {
        //Si tenemos suficientes soles, el booleano colocarGirasol es true y no es en la última columna
        if (this.sol >= 20 && this.colocarGirasol && columna != this.columnas - 1) {
            //Si la celda no está ocupada, creamos un giraol
            if (!this.celdaTablero[fila][columna].isOcupado()) {
                Girasol g = new Girasol();
                this.celdaTablero[fila][columna].setOcupado(true);
                this.celdaTablero[fila][columna].setPersonaje(g);
                this.sol -= 20;
                this.Girasoles += 1;
                this.colocarGirasol = false;
                aparecerZombies();
            }
        }
    }
    
    /**
     * Colocamos el Lanzaguisantes en la fila y columna donde nos indica
     * @param fila
     * @param columna 
     */
    public void colocarLanzaGuisantes(int fila, int columna) {
        //Si tenemos suficientes soles para colocar esta planta, si se puede colocar la planta y si no está en la última columna
        if (this.sol >= 50 && this.colocarLanzaGuisante && columna != this.columnas - 1) {
            //Si la celda no está ocupada, creamos un lanzaguisantes
            if (!this.celdaTablero[fila][columna].isOcupado()) {
                LanzaGuisantes lanzaguisante = new LanzaGuisantes(fila);
                this.celdaTablero[fila][columna].setOcupado(true);
                this.celdaTablero[fila][columna].setPersonaje(lanzaguisante);
                this.sol -= 50;
                this.l.add(lanzaguisante);
                this.colocarLanzaGuisante = false;
            }
        }
    }

    /**
     * Método para cuando un lanzaguisantes se encuentre en la misma fila que un zombie, y dispare
     */
    public void disparoLanzaGuisante() {
        //Buscamos un lanzaguisantes en el array de este
        for (LanzaGuisantes lanzaguisante : this.l) {
            int fila = lanzaguisante.getFila();
            boolean x = false;
            int maximo = this.columnas - 1;
            int columna = 0;
            //Cuando sea el booleano para true para revisar la columna y no sea ésta el máximo
            while (!x && columna < maximo) {
                //Buscamos si es algún zombie
                if (this.celdaTablero[fila][columna].isOcupado() & this.celdaTablero[fila][columna].getPersonaje() instanceof Zombie) {
                    //Si la vida del Zombie es mayor que 0, le restamos 1 a la vida
                    if (this.celdaTablero[fila][columna].getPersonaje().getVida() > 0) {
                        this.celdaTablero[fila][columna].getPersonaje().setVida(-1);
                    } else {
                        //Si el zombie tiene 0 vidas, lo eliminamos de la celda
                        this.z.remove(this.celdaTablero[fila][columna].getPersonaje());
                        this.zombiesMuertos += 1;
                        this.celdaTablero[fila][columna].setOcupado(false);
                        this.celdaTablero[fila][columna].setPersonaje(null);
                    }

                    x = true;
                }
                columna++;
            }
        }
    }

    /**
     * Creamos los zombies en cualquier fila del tablero, pero en la última columna
     */
    public void crearZombie() {
        int fila = (int) (Math.random() * (this.filas));
        int i = 0;
        while (i < this.filas) {
            //Si la celda está no está ocupada, creamos un zombie
            if (!this.celdaTablero[fila][this.columnas - 1].isOcupado()) {          
                boolean moverse = false;
                if (this.turno % 2 == 0) {
                    moverse = true;
                }
                ZombieComun zombie = new ZombieComun(moverse, fila, this.columnas - 1);
                this.celdaTablero[fila][this.columnas - 1].setOcupado(true);
                this.celdaTablero[fila][this.columnas - 1].setPersonaje(zombie);
                this.z.add(zombie);
                i = this.filas + 99;
            }
            i++;
        }
    }

    public boolean isColocarGirasol() {
        return colocarGirasol;
    }

    public void setColocarGirasol(boolean colocarGirasol) {
        this.colocarGirasol = colocarGirasol;
    }

    public boolean isColocarLanzaGuisante() {
        return colocarLanzaGuisante;
    }

    public void setColocarLanzaGuisante(boolean colocarLanzaGuisante) {
        this.colocarLanzaGuisante = colocarLanzaGuisante;
    }

    public Celda[][] getCeldaTablero() {
        return celdaTablero;
    }

    public void setCeldaTablero(Celda[][] celdaTablero) {
        this.celdaTablero = celdaTablero;
    }

    /**
     * Se hace un aleatorio de turno para que salga un zombie
     */
    public void aparecerZombies() {
        this.salidaZombie = new int[this.Zombies];
        for (int i = 0; i < this.Zombies; i++) {
            int random = (int) (Math.random() * (30 - this.turnoZombie) + this.turnoZombie);
            this.salidaZombie[i] = random;
        }
    }

    /**
     * Si el turno que está actual, es un turno en el quen el zombie sale, aparece un zombie en el tablero
     * @param salidaZombie
     * @param turno
     * @return 
     */
    public boolean salida_tablero_Zombies(int[] salidaZombie, int turno) {
        boolean saleZombie = false;
        for (int i : salidaZombie) {
            if (i == turno) {
                saleZombie = true;
            }
        }
        return saleZombie;
    }

    /**
     * Contador de zombies creados
     * @return 
     */
    public int zombiesCreados() {
        int zombies = 0;
        for (int i : this.salidaZombie) {
            if (this.turno == i) {
                zombies += 1;
            }
        }
        return zombies;
    }

    /**
     * Método para que se mueva el zombie por el tablero
     */
    public void movimientoZombie() {
        
        if (this.z.size() >= 1) {
            //Recorremos el array zombies con el objeto Zombie
            for (ZombieComun zombie : this.z) {
                int fila = zombie.getFila();
                int column = zombie.getColumn();
                //Si el zombie puede moverse y el turno es es divisible entre dos
                if (zombie.isMoverse() == (this.turno % 2 == 0)) {
                    //Si la celda de la columna de delante del zombie está libre, avanza 
                    if (!this.celdaTablero[fila][column - 1].isOcupado()) {
                        this.celdaTablero[fila][column - 1].setOcupado(true);
                        this.celdaTablero[fila][column - 1].setPersonaje(zombie);
                        this.celdaTablero[fila][column - 1].setOcupado(false);
                        zombie.setColumn(column - 1);
                    } else if (this.celdaTablero[fila][column - 1].getPersonaje() instanceof Personaje) {
                        //Si la celda está ocupada por un personaje y no es un zombie,prepara el ataque el zombie a este.
                        zombie.ataqueZombie(this.celdaTablero[fila][column - 1].getPersonaje());
                    }
                } else if (this.celdaTablero[fila][column - 1].isOcupado() & this.celdaTablero[fila][column - 1].getPersonaje() instanceof Planta) {
                    //Si la celda de la columna de delante NO está libre, y es una planta, procede a atacar
                    zombie.ataqueZombie(this.celdaTablero[fila][column - 1].getPersonaje());
                    //Si la planta al atacar tiene menos de 0 vida, se elimina del tablero
                    if (this.celdaTablero[fila][column - 1].getPersonaje().getVida() <= 0) {
                        if (this.celdaTablero[fila][column - 1].getPersonaje() instanceof LanzaGuisantes) {
                            this.l.remove(this.celdaTablero[fila][column - 1].getPersonaje());
                        }
                    }
                    this.celdaTablero[fila][column - 1].setOcupado(false);
                }
            }
        }
    }
}
