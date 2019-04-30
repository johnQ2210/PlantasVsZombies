/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author juniorchunga
 */
public class ExcepcionPlanta extends Exception {
    public static String SALDO_INSUFICIENTE = "No dispone de un saldo suficiente para realizar esta acción.";
    public ExcepcionPlanta(){
        super("No se puede colocar en la última columna del tablero.");
    }
}
