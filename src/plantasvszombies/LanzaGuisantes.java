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
public class LanzaGuisantes extends Planta {

    public LanzaGuisantes() {
        super(3, 50, 1, 1);
    }

    @Override
    public String toString() {
        return "LanzaGuisantes" + "(" + super.toString() + ")";
    }

}
