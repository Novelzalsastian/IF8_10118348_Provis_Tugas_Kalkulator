/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import javax.swing.JOptionPane;

/**
 *
 * @author novel
 */
public class kalkulator_tugas extends javax.swing.JFrame {
    String angka;
    double jumlah,angka1,angka2;
    int pilih;

    /**
     * Creates new form kalkulator_tugas
     */
    public kalkulator_tugas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tampil = new javax.swing.JTextField();
        tmblreset = new javax.swing.JButton();
        tmbltambah = new javax.swing.JButton();
        tmblkurang = new javax.swing.JButton();
        tmblkali = new javax.swing.JButton();
        tmblbagi = new javax.swing.JButton();
        tmbl1 = new javax.swing.JButton();
        tmbl2 = new javax.swing.JButton();
        tmbl3 = new javax.swing.JButton();
        tmbl4 = new javax.swing.JButton();
        tmbl5 = new javax.swing.JButton();
        tmbl6 = new javax.swing.JButton();
        tmbl7 = new javax.swing.JButton();
        tmbl8 = new javax.swing.JButton();
        tmbl9 = new javax.swing.JButton();
        tmbl0 = new javax.swing.JButton();
        tmblkoma = new javax.swing.JButton();
        tmblhasil = new javax.swing.JButton();
        tmblakar = new javax.swing.JButton();
        tmblpersen = new javax.swing.JButton();
        tmbl00 = new javax.swing.JButton();
        tmblexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tampil.setEditable(false);
        tampil.setBackground(new java.awt.Color(204, 255, 255));
        tampil.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N

        tmblreset.setForeground(new java.awt.Color(0, 102, 255));
        tmblreset.setText("C");
        tmblreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblresetActionPerformed(evt);
            }
        });

        tmbltambah.setText("+");
        tmbltambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbltambahActionPerformed(evt);
            }
        });

        tmblkurang.setText("-");
        tmblkurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblkurangActionPerformed(evt);
            }
        });

        tmblkali.setText("X");
        tmblkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblkaliActionPerformed(evt);
            }
        });

        tmblbagi.setText("/");
        tmblbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblbagiActionPerformed(evt);
            }
        });

        tmbl1.setText("1");
        tmbl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl1ActionPerformed(evt);
            }
        });

        tmbl2.setText("2");
        tmbl2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl2ActionPerformed(evt);
            }
        });

        tmbl3.setText("3");
        tmbl3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl3ActionPerformed(evt);
            }
        });

        tmbl4.setText("4");
        tmbl4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl4ActionPerformed(evt);
            }
        });

        tmbl5.setText("5");
        tmbl5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl5ActionPerformed(evt);
            }
        });

        tmbl6.setText("6");
        tmbl6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl6ActionPerformed(evt);
            }
        });

        tmbl7.setText("7");
        tmbl7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl7ActionPerformed(evt);
            }
        });

        tmbl8.setText("8");
        tmbl8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl8ActionPerformed(evt);
            }
        });

        tmbl9.setText("9");
        tmbl9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl9ActionPerformed(evt);
            }
        });

        tmbl0.setText("0");
        tmbl0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl0ActionPerformed(evt);
            }
        });

        tmblkoma.setText(".");
        tmblkoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblkomaActionPerformed(evt);
            }
        });

        tmblhasil.setText("=");
        tmblhasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblhasilActionPerformed(evt);
            }
        });

        tmblakar.setText("√");
        tmblakar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblakarActionPerformed(evt);
            }
        });

        tmblpersen.setText("%");
        tmblpersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblpersenActionPerformed(evt);
            }
        });

        tmbl00.setText("00");
        tmbl00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbl00ActionPerformed(evt);
            }
        });

        tmblexit.setForeground(new java.awt.Color(51, 51, 255));
        tmblexit.setText("EXIT");
        tmblexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmblexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tmbl7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(tmbl4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tmbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tmbl0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tmbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tmbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tmbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tmbl00, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tmbl9, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(tmbl6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tmbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tmblkoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tmbltambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tmblkali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tmblakar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tmblbagi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tmblkurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tmblpersen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(tmblhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tmblexit, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tmblreset, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tampil, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tampil, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tmblreset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tmbl1)
                    .addComponent(tmbl2)
                    .addComponent(tmbl3)
                    .addComponent(tmblkurang)
                    .addComponent(tmbltambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tmbl4)
                    .addComponent(tmbl5)
                    .addComponent(tmbl6)
                    .addComponent(tmblkali)
                    .addComponent(tmblbagi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tmbl7)
                    .addComponent(tmbl8)
                    .addComponent(tmbl9)
                    .addComponent(tmblakar)
                    .addComponent(tmblpersen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tmbl0)
                    .addComponent(tmblkoma)
                    .addComponent(tmblhasil)
                    .addComponent(tmbl00))
                .addGap(18, 18, 18)
                .addComponent(tmblexit)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 470, 370));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("KALKULATOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 350, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tmbl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl1ActionPerformed
        // TODO add your handling code here:
        angka+="1";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl1ActionPerformed

    private void tmbl2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl2ActionPerformed
        // TODO add your handling code here:
        angka+="2";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl2ActionPerformed

    private void tmbl3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl3ActionPerformed
        // TODO add your handling code here:
        angka+="3";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl3ActionPerformed

    private void tmbl4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl4ActionPerformed
        // TODO add your handling code here:
        angka+="4";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl4ActionPerformed

    private void tmbl5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl5ActionPerformed
        // TODO add your handling code here:
        angka+="5";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl5ActionPerformed

    private void tmbl6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl6ActionPerformed
        // TODO add your handling code here:
        angka+="6";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl6ActionPerformed

    private void tmbl7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl7ActionPerformed
        // TODO add your handling code here:
        angka+="7";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl7ActionPerformed

    private void tmbl8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl8ActionPerformed
        // TODO add your handling code here:
        angka+="8";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl8ActionPerformed

    private void tmbl9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl9ActionPerformed
        // TODO add your handling code here:
        angka+="9";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl9ActionPerformed

    private void tmbl0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl0ActionPerformed
        // TODO add your handling code here:
        angka+="0";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl0ActionPerformed

    private void tmblexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblexitActionPerformed
        // TODO add your handling code here:
        int SelectOption = JOptionPane.showConfirmDialog(null, "Apa Anda Ingin Menutup Kalkulator ?","Tutup Kalkulator ?", JOptionPane.YES_NO_OPTION);
        if (SelectOption == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_tmblexitActionPerformed

    private void tmblkomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblkomaActionPerformed
        // TODO add your handling code here:
        tampil.setText(angka);
        angka += ".";
    }//GEN-LAST:event_tmblkomaActionPerformed

    private void tmbltambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbltambahActionPerformed
        // TODO add your handling code here:
        angka1= Double.parseDouble(angka);
        tampil.setText("+");
        angka="";
        pilih =1;
    }//GEN-LAST:event_tmbltambahActionPerformed

    private void tmblkurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblkurangActionPerformed
        // TODO add your handling code here:
        angka1= Double.parseDouble(angka);
        tampil.setText("-");
        angka="";
        pilih =2;
    }//GEN-LAST:event_tmblkurangActionPerformed

    private void tmblkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblkaliActionPerformed
        // TODO add your handling code here:
        angka1= Double.parseDouble(angka);
        tampil.setText("X");
        angka="";
        pilih =3;
    }//GEN-LAST:event_tmblkaliActionPerformed

    private void tmblbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblbagiActionPerformed
        // TODO add your handling code here:
        angka1= Double.parseDouble(angka);
        tampil.setText("/");
        angka="";
        pilih =4;
    }//GEN-LAST:event_tmblbagiActionPerformed

    private void tmblhasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblhasilActionPerformed
        // TODO add your handling code here:
        switch (pilih){
            case 1:
                angka2= Double.parseDouble(angka);
                jumlah= angka1+angka2;
                angka=Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 2:
                angka2= Double.parseDouble(angka);
                jumlah= angka1-angka2;
                angka=Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 3:
                angka2= Double.parseDouble(angka);
                jumlah= angka1*angka2;
                angka=Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 4:
                angka2= Double.parseDouble(angka);
                jumlah= angka1/angka2;
                angka=Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 5:
                jumlah=Math.sqrt(angka1);
                angka= Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 6:
                jumlah=angka1/100;
                angka=Double.toString(jumlah);
                tampil.setText(angka);
                break;
        }
    }//GEN-LAST:event_tmblhasilActionPerformed

    private void tmblresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblresetActionPerformed
        // TODO add your handling code here:
        tampil.setText("");
        angka1= 0.0;
        angka2= 0.0;
        jumlah= 0.0;
        angka= "";
    }//GEN-LAST:event_tmblresetActionPerformed

    private void tmblakarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblakarActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        tampil.setText("√");
        angka="";
        pilih=5;
    }//GEN-LAST:event_tmblakarActionPerformed

    private void tmblpersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmblpersenActionPerformed
        // TODO add your handling code here:
        angka1=Double.parseDouble(angka);
        tampil.setText("%");
        angka="";
        pilih=6;
        
    }//GEN-LAST:event_tmblpersenActionPerformed

    private void tmbl00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbl00ActionPerformed
        // TODO add your handling code here:
        angka +="00";
        tampil.setText(angka);
    }//GEN-LAST:event_tmbl00ActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator_tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator_tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator_tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator_tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator_tugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tampil;
    private javax.swing.JButton tmbl0;
    private javax.swing.JButton tmbl00;
    private javax.swing.JButton tmbl1;
    private javax.swing.JButton tmbl2;
    private javax.swing.JButton tmbl3;
    private javax.swing.JButton tmbl4;
    private javax.swing.JButton tmbl5;
    private javax.swing.JButton tmbl6;
    private javax.swing.JButton tmbl7;
    private javax.swing.JButton tmbl8;
    private javax.swing.JButton tmbl9;
    private javax.swing.JButton tmblakar;
    private javax.swing.JButton tmblbagi;
    private javax.swing.JButton tmblexit;
    private javax.swing.JButton tmblhasil;
    private javax.swing.JButton tmblkali;
    private javax.swing.JButton tmblkoma;
    private javax.swing.JButton tmblkurang;
    private javax.swing.JButton tmblpersen;
    private javax.swing.JButton tmblreset;
    private javax.swing.JButton tmbltambah;
    // End of variables declaration//GEN-END:variables
}
