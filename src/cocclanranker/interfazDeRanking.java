/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cocclanranker;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author oroir
 */
public class interfazDeRanking extends javax.swing.JFrame {
    int i =0;
    int enemyPos2;
    int star2;
    ArrayList<Player> players = new ArrayList<>();
    /**
     * Creates new form interfazDeRanking
     */
    public interfazDeRanking() {
        initComponents();
        setLocationRelativeTo(null);
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
        listaTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        thBox = new javax.swing.JComboBox<>();
        starsBox1 = new javax.swing.JComboBox<>();
        starsBox2 = new javax.swing.JComboBox<>();
        enemyPosText2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        enemyPosText1 = new javax.swing.JTextField();
        agregarButton = new javax.swing.JButton();
        posText = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ordenarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaTexto.setEditable(false);
        listaTexto.setColumns(20);
        listaTexto.setRows(5);
        jScrollPane1.setViewportView(listaTexto);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Ranking de jugadores");

        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });

        thBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        thBox.setToolTipText("");
        thBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thBoxActionPerformed(evt);
            }
        });

        starsBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3" }));
        starsBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starsBox1ActionPerformed(evt);
            }
        });

        starsBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1", "2", "3" }));
        starsBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                starsBox2ActionPerformed(evt);
            }
        });

        enemyPosText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enemyPosText2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Posicion\nen guerra");

        jLabel3.setText("Nombre");

        jLabel4.setText("Ayuntamiento");

        jLabel5.setText("Ataque 1");

        jLabel6.setText("Ataque 2");

        jLabel7.setText("Posicion del enemigo");

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        posText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posTextActionPerformed(evt);
            }
        });

        jLabel9.setText("Estrellas");

        ordenarButton.setText("Ordenar");
        ordenarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(posText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)))
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(thBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(88, 88, 88)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(starsBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(starsBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enemyPosText1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enemyPosText2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(agregarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(ordenarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(posText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(starsBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enemyPosText1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(starsBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(enemyPosText2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(28, 28, 28)
                .addComponent(agregarButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ordenarButton)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void starsBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starsBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_starsBox1ActionPerformed

    private void starsBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_starsBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_starsBox2ActionPerformed

    private void enemyPosText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enemyPosText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enemyPosText2ActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        try{
            if(interfazCompleta()){
                agregar();
            }
        }catch(Exception e){
           System.out.println("Faltan parametros de jugador");
        }       
    }//GEN-LAST:event_agregarButtonActionPerformed
    
    private boolean interfazCompleta(){
        if("".equals(posText.getText())){
            JOptionPane.showMessageDialog(null,"Falta introducir la posicion del jugador","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        if("".equals(nameText.getText())){
            JOptionPane.showMessageDialog(null,"Falta introducir el nombre del jugador","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        if(thBox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Falta introducir el ayuntamiento del jugador","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        if("".equals(enemyPosText1.getText())){
            JOptionPane.showMessageDialog(null,"Falta introducir una posicion del enemigo","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        if("".equals(enemyPosText2.getText())){
            enemyPos2 = 0;
        }else{
            enemyPos2 = Integer.parseInt(enemyPosText2.getText());
        }
        if(starsBox1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Falta introducir las estrellas de un ataque","Error",JOptionPane.INFORMATION_MESSAGE);
        }
        if(starsBox2.getSelectedIndex()==0){
            star2 = 0;
        }
        else{
            star2 = starsBox2.getSelectedIndex();
        }
        return !("".equals(posText.getText()) && "".equals(nameText.getText()) && thBox.getSelectedIndex()==0 && "".equals(enemyPosText1.getText()) && starsBox1.getSelectedIndex()==0);
    }
    
    private void agregar(){
        players.add(newPlayer());
        listaTexto.append(players.get(i).getPos()+"   "+players.get(i).getName()+"   "+players.get(i).getTh()+"   "+
               Arrays.toString(players.get(i).getStars())+"   "+Arrays.toString(players.get(i).getEnemyPos())+"   "+players.get(i).getIndex()+"\n");
        resetText();
        i+=1;
    }
    
    private Player newPlayer(){
       int newPos = Integer.parseInt(posText.getText());
       int newTh = Integer.parseInt((String) thBox.getSelectedItem()); ////Integer.parseInt((String) thBox.getSelectedItem());
       int[] newStars = {starsBox1.getSelectedIndex(),star2};
       int [] newEnemyPos = {Integer.parseInt(enemyPosText1.getText()),enemyPos2};
       
       Player player = new Player(newPos,(String)nameText.getText(),newTh,newStars,newEnemyPos);
        
       return player;
    }
    
    private void resetText(){
       posText.setText("");
       nameText.setText("");
       thBox.setSelectedIndex(0);
       starsBox1.setSelectedIndex(0);
       starsBox2.setSelectedIndex(0);
       enemyPosText1.setText("");
       enemyPosText2.setText("");
    }
    private void thBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thBoxActionPerformed

    private void posTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posTextActionPerformed

    private void ordenarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarButtonActionPerformed
        Collections.sort(players, Player.indexComparator);
        Collections.reverse(players);
        listaTexto.setText("");
        for(Player player : players){ 
            listaTexto.append(player.getPos()+"   "+player.getName()+"   "+player.getTh()+"   "+
               Arrays.toString(player.getStars())+"   "+Arrays.toString(player.getEnemyPos())+""+player.getIndex()+"\n");
        }
    }//GEN-LAST:event_ordenarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(interfazDeRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazDeRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazDeRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazDeRanking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new interfazDeRanking().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JTextField enemyPosText1;
    private javax.swing.JTextField enemyPosText2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea listaTexto;
    private javax.swing.JTextField nameText;
    private javax.swing.JButton ordenarButton;
    private javax.swing.JTextField posText;
    private javax.swing.JComboBox<String> starsBox1;
    private javax.swing.JComboBox<String> starsBox2;
    private javax.swing.JComboBox<String> thBox;
    // End of variables declaration//GEN-END:variables
}