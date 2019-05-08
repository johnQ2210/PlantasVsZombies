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

    public void colocarGirasol(int fila, int columna) {

        if (this.sol >= 20 && this.colocarGirasol && columna != this.columnas - 1) {
            if (!this.celdaTablero[fila][columna].isOcupado()) {
                Girasol g = new Girasol();
                this.celdaTablero[fila][columna].setOcupado(true);
                this.celdaTablero[fila][columna].setPersonaje(g);
                this.sol -= 20;
                this.Girasoles += 1;
                this.colocarGirasol = false;
                aparecerZombies();
                this.generarTabla();
            }
        }
    }
    
    public void colocarLanzaGuisantes(int fila, int columna) {
        if (this.sol >= 50 && this.colocarLanzaGuisante && columna != this.columnas - 1) {
            if (!this.celdaTablero[fila][columna].isOcupado()) {
                LanzaGuisantes lanzaguisante = new LanzaGuisantes(fila);
                this.celdaTablero[fila][columna].setOcupado(true);
                this.celdaTablero[fila][columna].setPersonaje(lanzaguisante);
                this.sol -= 50;
                this.l.add(lanzaguisante);
                this.colocarLanzaGuisante = false;
                this.generarTabla();
            }
        }
    }

    
    public void disparoLanzaGuisante() {
        for (LanzaGuisantes lanzaguisante : this.l) {
            int fila = lanzaguisante.getFila();
            boolean x = false;
            int maximo = this.columnas - 1;
            int columna = 0;
            while (!x && columna < maximo) {
                if (this.celdaTablero[fila][columna].isOcupado() & this.celdaTablero[fila][columna].getPersonaje() instanceof Zombie) {
                    if (this.celdaTablero[fila][columna].getPersonaje().getVida() > 0) {
                        this.celdaTablero[fila][columna].getPersonaje().setVida(-1);
                    } else {
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

    public void crearZombie() {
        int fila = (int) (Math.random() * (this.filas));
        int i = 0;
        while (i < this.filas) {
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

    public void aparecerZombies() {
        this.salidaZombie = new int[this.Zombies];
        for (int i = 0; i < this.Zombies; i++) {
            int random = (int) (Math.random() * (30 - this.turnoZombie) + this.turnoZombie);
            this.salidaZombie[i] = random;
        }
    }

    public boolean salida_tablero_Zombies(int[] salidaZombie, int turno) {
        boolean saleZombie = false;
        for (int i : salidaZombie) {
            if (i == turno) {
                saleZombie = true;
            }
        }
        return saleZombie;
    }

    public int zombiesCreados() {
        int zombies = 0;
        for (int i : this.salidaZombie) {
            if (this.turno == i) {
                zombies += 1;
            }
        }
        return zombies;
    }

    public void movimientoZombie() {
        if (this.z.size() >= 1) {
            for (ZombieComun z : this.z) {
                int fila = z.getFila();
                int column = z.getColumn();
                if (z.isMoverse() == (this.turno % 2 == 0)) {
                    if (!this.celdaTablero[fila][column - 1].isOcupado()) {
                        this.celdaTablero[fila][column - 1].setOcupado(true);
                        this.celdaTablero[fila][column - 1].setPersonaje(z);
                        this.celdaTablero[fila][column - 1].setOcupado(false);
                        z.setColumn(column - 1);
                    } else if (this.celdaTablero[fila][column - 1].getPersonaje() instanceof Personaje) {
                        z.ataqueZombie(this.celdaTablero[fila][column - 1].getPersonaje());
                    }
                } else if (this.celdaTablero[fila][column - 1].isOcupado() & this.celdaTablero[fila][column - 1].getPersonaje() instanceof Planta) {
                    z.ataqueZombie(this.celdaTablero[fila][column - 1].getPersonaje());
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

    public void generarTabla() {
        for (int i = 0; i <= this.filas; i++) {
            for (int j = 0; j <= columnas; j++) {
                this.celdaTablero[i][j].toString();
            }
        }
    }
}
