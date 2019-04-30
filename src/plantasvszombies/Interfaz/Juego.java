/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantasvszombies.Interfaz;

import java.util.Random;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import plantasvszombies.Girasol;
import plantasvszombies.ZombieComun;
import plantasvszombies.LanzaGuisantes;
import plantasvszombies.Juegoclase;

/**
 *
 * @author juniorchunga
 */
public class Juego extends javax.swing.JFrame {

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        setLocationRelativeTo(null);            //Centramos la ventana
        setResizable(false);                    //Hacemos que no se máximice
        setTitle("Plantas vs Zombies");         //Añadimos un título a la ventana

        Inicio ini1 = new Inicio();                 //Creamos el objeto de la vista principal
        int columna = Integer.parseInt(Inicio.t);   //Guardamos como entero el nº de columna que pide el usuario
        int filas = Integer.parseInt(Inicio.x);     //Guardamos como entero el nº de fila que pide el usuario
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();  //Creamos un jTable vacio
        model.setColumnCount(columna);              //Añadimos las columnas que hemos guardado en la variable "columna"
        model.setRowCount(filas);                   //Añadimos las filas que hemos guardado en la variable "filas"

        jTable1.setCellSelectionEnabled(true);      //Seleccionar únicamente la celda, no la fila entera
        jTable1.setSurrendersFocusOnKeystroke(true);//Sea editable la celda con sólo poner una entrada

        //ArrayList<Integer> column = new ArrayList<>();
        ZombieComun zombie = new ZombieComun();                     //Prueba de cómo insertar un objeto en filas aleatorias
        for (int i = 0; i < filas; i++) {
            int fila_ale = filaAleatoria(filas);
            model.setValueAt(zombie.toString(), fila_ale, columna-1);
        }

        /**
         * Se tiene que revisar el programa de arriba.
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Nueva Partida");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nº Soles:");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("Ayuda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Siguiente Turno");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Turno:");

        jTextField2.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Se realiza una ventana de comprobación para que el usuario confirme la acción
        int n = JOptionPane.showConfirmDialog(this, "¿Seguro que quiere salir?", "Cerrar juego", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            if (evt.getSource() == jButton2) {
                System.exit(0);             //Al pinchar salir, no volvemos a la vista Inicio, sino que 
                //acaba el programa.
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Se realiza una ventana de comprobación para que el usuario confirme la acción
        int n = JOptionPane.showConfirmDialog(this, "¿Seguro que quiere volver?", "Salir del juego", JOptionPane.YES_NO_OPTION);
        if (n == JOptionPane.YES_OPTION) {
            Inicio ini1 = new Inicio();     //Creamos el objeto Inicio, que pertenece a la otra vista
            ini1.setVisible(true);          //Lo hacemos visible
            dispose();                      //Desaparece la vista origen en la que estábamos
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Para comenzar, seleccione cualquier celda para añadir la planta que desea."
                + "\nEl número de soles que posee es muy importante, ya que sin ellos, no puede seleccionar ninguna planta."
                + "\nEl girasol posee 1 punto de vida, cuesta 20 soles y genera 10 soles cada 2 turnos."
                + "\nEl lanzaguisantes posee 3 puntos de vida, cuesta 50 soles y lanza guisantes en cada turno."
                + "\nLos zombies aparecen aleatoriamente en la úñtima columna, poseen 5 puntos de vida y quitan 1 punto en cada ataque"
                + "\nTiene que elimiar todos los zombies que aparezcan para poder ganar, antes de que los zombies crucen todo el tablero."
                + "\nSi los zombies llegan, pierdes. Si los matas a todos, ganas."
                + "\n¡A Jugar!", "Ayuda del Juego", JOptionPane.INFORMATION_MESSAGE);
        //En vez de usar un nuevo jFrame para que aparezca las instrucciones, declaramos un JOption de información para ello.
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Juego j = new Juego();
        j.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        Juegoclase juego = new Juegoclase(50);
        String soles = String.valueOf(juego.setSol(50));
        jTextField1.setText(soles);
    }//GEN-LAST:event_jTextField1ActionPerformed

    public int filaAleatoria(int x) {        //Método para filas aleatorias
        Random rand = new Random();
        int z = rand.nextInt(x);
        return z;
    }

    //public void crearObjeto(int fila, int columna){
    //    jTable1.getCellEditor( fila, columna);   
    //}
    //Crear objeto Lanzaguisante o girasol
    public void crearObjeto(int fila, int columna) {
        String x = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), jTable1.getSelectedColumn()));
        if ((x == "Z") || (x == "z")) {
            Girasol girasol = new Girasol();
        } else if ((x == "L") || (x == "l")) {
            LanzaGuisantes lanzaGuisante = new LanzaGuisantes();
        }
    }
    /**public void añadirAleatoriamenteZombie(int fila){
        int i = 0;
        while(i < (Integer.parseInt(Inicio.x))){
            if(Celda no está ocupada){
                    Zombie z = new Zombie();
        }
    }
    * */

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
