/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dekstop;

/**
 *
 * @author WINDOWS 10
 */
public class formmakanan extends javax.swing.JFrame {

   

    /**
     * Creates new form formmakanan
     */
    public formmakanan() {
        initComponents();
        btngroupdiscon.add(diskon5);
        btngroupdiscon.add(diskon10);          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroupdiscon = new javax.swing.ButtonGroup();
        txtbayar = new javax.swing.JButton();
        diskon = new javax.swing.JLabel();
        diskon5 = new javax.swing.JRadioButton();
        diskon10 = new javax.swing.JRadioButton();
        Txtbakso = new javax.swing.JTextField();
        Txtmie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cekbakso = new javax.swing.JCheckBox();
        cekmie = new javax.swing.JCheckBox();
        txtBayar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtbayar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtbayar.setText("BAYAR");
        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });

        diskon.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        diskon.setText("diskon");

        diskon5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        diskon5.setText("5%");
        diskon5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskon5ActionPerformed(evt);
            }
        });

        diskon10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        diskon10.setText("10%");

        Txtbakso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Txtbakso.setText("0");
        Txtbakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtbaksoActionPerformed(evt);
            }
        });

        Txtmie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Txtmie.setText("0");
        Txtmie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtmieActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Form Pembayaran Makanan");

        cekbakso.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cekbakso.setText("Bakso Rp.10000");

        cekmie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cekmie.setText("Mie Ayam Rp. 8000");

        txtBayar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cekmie)
                                    .addComponent(cekbakso))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txtbakso, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addComponent(Txtmie)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(diskon)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diskon10)
                                    .addComponent(diskon5)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cekbakso)
                    .addComponent(Txtbakso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Txtmie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cekmie))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(diskon5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diskon10)
                        .addGap(18, 18, 18)))
                .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtbayar)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void diskon5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diskon5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diskon5ActionPerformed

    private void TxtbaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtbaksoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtbaksoActionPerformed

    private void TxtmieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtmieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtmieActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarActionPerformed

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        // TODO add your handling code here:
        double jmlbakso = 0, jmlmie = 0;
        double hrgbakso = 0, hrgmie = 0;
        double diskon = 0, harga = 0, bayar = 0;
        
        jmlbakso = Double.parseDouble(Txtbakso.getText());
         jmlmie = Double.parseDouble(Txtmie.getText());
         
         if (cekbakso.isSelected()){
             hrgbakso = 10000;
         }
         if (cekmie.isSelected()){
             hrgmie = 8000;
         }
         
         //diskon
         if (diskon5.isSelected()) {
            diskon = 0.05;
        }
        if (diskon10.isSelected()) {
            diskon = 0.100;
    }//GEN-LAST:event_txtbayarActionPerformed

        double byrbakso = hrgbakso * jmlbakso;
        double byrmie = hrgmie * jmlmie;
        
        harga = byrbakso + byrmie;
        bayar = harga - (harga * diskon);
               
        txtBayar.setText("Rp. "+String.valueOf(bayar));
    }
    
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
            java.util.logging.Logger.getLogger(formmakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formmakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formmakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formmakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formmakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txtbakso;
    private javax.swing.JTextField Txtmie;
    private javax.swing.ButtonGroup btngroupdiscon;
    private javax.swing.JCheckBox cekbakso;
    private javax.swing.JCheckBox cekmie;
    private javax.swing.JLabel diskon;
    private javax.swing.JRadioButton diskon10;
    private javax.swing.JRadioButton diskon5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JButton txtbayar;
    // End of variables declaration//GEN-END:variables
}