/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.ControllerHospital;
import model.Hospital;

/**
 *
 * @author João Victor
 */
public class EditarHospital extends javax.swing.JFrame {
    private ControllerHospital ch = new ControllerHospital();
    private int idHospital;

    /**
     * Creates new form EditarHospital
     */
    public EditarHospital() {
        initComponents();
        
        atualizarListaHospital();
    }
    
    private void atualizarListaHospital(){
        cmbHospital.removeAllItems();
        
        for(Hospital h : ch.listarHospital()){
        //    cmbHospital.addItem(h);
        }
    }
    
    private void habilitarCampos(){
        txt_nm_hospital.setVisible(true);
        txt_endereco_hospital.setVisible(true);
    }
    
    private void desabilitarCampos(){
        txt_nm_hospital.setVisible(false);
        txt_endereco_hospital.setVisible(false);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        desabilitarCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nm_hospital = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_endereco_hospital = new javax.swing.JTextField();
        btn_editar_hospital = new javax.swing.JButton();
        cmbHospital = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btn_calcelarEdicao_hospital1 = new javax.swing.JButton();
        btn_excluir_hospital1 = new javax.swing.JButton();
        btn_salvar_hospital2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Editar Hospital");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        txt_nm_hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nm_hospitalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Endereço:");

        btn_editar_hospital.setText("Editar");
        btn_editar_hospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_hospitalActionPerformed(evt);
            }
        });

        cmbHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHospitalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Hospital:");

        btn_calcelarEdicao_hospital1.setText("Cancelar");
        btn_calcelarEdicao_hospital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcelarEdicao_hospital1ActionPerformed(evt);
            }
        });

        btn_excluir_hospital1.setText("Excluir");
        btn_excluir_hospital1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_hospital1ActionPerformed(evt);
            }
        });

        btn_salvar_hospital2.setText("Salvar");
        btn_salvar_hospital2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_hospital2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(txt_nm_hospital, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(txt_endereco_hospital, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                .addComponent(cmbHospital, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_editar_hospital)
                                .addGap(18, 18, 18)
                                .addComponent(btn_calcelarEdicao_hospital1)
                                .addGap(18, 18, 18)
                                .addComponent(btn_excluir_hospital1)
                                .addGap(18, 18, 18)
                                .addComponent(btn_salvar_hospital2)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nm_hospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_endereco_hospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar_hospital)
                    .addComponent(btn_calcelarEdicao_hospital1)
                    .addComponent(btn_excluir_hospital1)
                    .addComponent(btn_salvar_hospital2))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nm_hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nm_hospitalActionPerformed
        //
    }//GEN-LAST:event_txt_nm_hospitalActionPerformed

    private void btn_editar_hospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_hospitalActionPerformed
        int i = cmbHospital.getSelectedIndex();
       /* Hospital h = (Hospital) cmbHospital.getItemAt(i);
        txt_nm_hospital.setText(h.getNome());
        txt_endereco_hospital.setText(h.getEndereco());
        idHospital = h.getIdHospital(); */
        
        habilitarCampos();
    }//GEN-LAST:event_btn_editar_hospitalActionPerformed

    private void btn_calcelarEdicao_hospital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcelarEdicao_hospital1ActionPerformed
        desabilitarCampos();
    }//GEN-LAST:event_btn_calcelarEdicao_hospital1ActionPerformed

    private void btn_excluir_hospital1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_hospital1ActionPerformed
        ch.deletar(idHospital);
        
        atualizarListaHospital();
        
        desabilitarCampos();
    }//GEN-LAST:event_btn_excluir_hospital1ActionPerformed

    private void btn_salvar_hospital2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_hospital2ActionPerformed
        Hospital h = new Hospital(txt_nm_hospital.getText());
        h.setEndereco(txt_endereco_hospital.getText());
        h.setIdHospital(idHospital);
        
        ch.atualizar(h);
        
        atualizarListaHospital();
        
        desabilitarCampos();
    }//GEN-LAST:event_btn_salvar_hospital2ActionPerformed

    private void cmbHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHospitalActionPerformed

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
            java.util.logging.Logger.getLogger(EditarHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarHospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcelarEdicao_hospital1;
    private javax.swing.JButton btn_editar_hospital;
    private javax.swing.JButton btn_excluir_hospital1;
    private javax.swing.JButton btn_salvar_hospital2;
    private javax.swing.JComboBox<String> cmbHospital;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_endereco_hospital;
    private javax.swing.JTextField txt_nm_hospital;
    // End of variables declaration//GEN-END:variables
}