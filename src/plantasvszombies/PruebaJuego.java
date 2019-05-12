/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombies;

import java.io.*;

/**
 *
 * @author juniorchunga
 */
public class PruebaJuego {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int fila, columna;
        String dificultad;

        System.out.println("Nº filas: ");
        fila = Integer.parseInt(entrada.readLine());
        System.out.println("Nº columna: ");
        columna = Integer.parseInt(entrada.readLine());
        System.out.println("Dificultad: ");
        dificultad = entrada.readLine();

        Juegoclase juego = new Juegoclase(fila, columna, dificultad);

        boolean play = true;
        while (play) {
            boolean salidaZombie = juego.salida_tablero_Zombies(juego.getSalidaZombie(), juego.getTurno());
            int n_Zombies = juego.zombiesCreados();
            for (int i = 0; i < n_Zombies; i++) {
                if (salidaZombie) {
                    juego.crearZombie();
                }
            }
            
            
            boolean turn = true;
            while (turn) {

                int fil, column;
                String letra;

                System.out.println("fila quiere: ");
                fil = Integer.parseInt(entrada.readLine());
                System.out.println("columna quiere: ");
                column = Integer.parseInt(entrada.readLine());
                System.out.println("planta?");
                letra = entrada.readLine();

                try {
                    switch (letra) {
                        case "g":
                            juego.colocarGirasol(fil, column);
                            juego.setTurno(1);
                            break;
                        case "l":
                            juego.colocarLanzaGuisantes(fil, column);
                            juego.setTurno(1);
                            break;
                        default:
                            System.out.println("error");
                            juego.setTurno(1);
                            turn = false;
                            break;
                    }

                    }catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println(e);
                            }
                }
                juego.setSol(juego.getGirasoles() * 10);
                juego.disparoLanzaGuisante();
                juego.movimientoZombie();
                juego.setColocarLanzaGuisante(true);
                juego.setColocarGirasol(true);

                if (juego.getZombies() == juego.getZombiesMuertos()) {
                    play = false;
                    System.out.println("planta");
                }
                if (juego.getZ().size() == 0 && juego.getTurno() > 30) {
                    play = false;
                    System.out.println("planta");
                }
                for (ZombieComun z : juego.getZ()) {
                    play = false;
                    if (z.getColumn() == 0) {
                        System.out.println("Zombies");
                    }
                }
            }

            System.out.println(juego.getGirasoles());
            System.out.println(juego.getL().size());
            System.out.println(juego.getSol() + " turno " +  juego.getTurno());
        }

    }
