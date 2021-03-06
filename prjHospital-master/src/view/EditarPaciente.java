/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.ControllerPaciente;
import model.Paciente;
/**
 *
 * @author João Victor
 */
public class EditarPaciente extends javax.swing.JFrame {
private ControllerPaciente cp = new ControllerPaciente();
    private int idPaciente;
    /**
     * Creates new form EditarFuncionario
     */
    public EditarPaciente() {
        initComponents();
        
        atualizarListaPaciente();
    }
    
    private void atualizarListaPaciente(){
        cmbPaciente.removeAllItems();
        
        for(Paciente p : cp.listarPaciente()){
        //    cmbPaciente.addItem(f);
        }
    }
    
    private void habilitarCampos(){
        txt_nm_paciente.setVisible(true);
        txt_rg_paciente.setVisible(true);
        txt_cpf_paciente.setVisible(true);
        txt_idade_paciente.setVisible(true);
        psd_senha_paciente.setVisible(true);
        cmbPaciente.setVisible(true);
        
    }
    
    private void desabilitarCampos(){
        txt_nm_paciente.setVisible(false);
        txt_rg_paciente.setVisible(false);
        txt_cpf_paciente.setVisible(false);
        txt_idade_paciente.setVisible(false);
        psd_senha_paciente.setVisible(false);
        cmbPaciente.setVisible(false);
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

        txt_rg_paciente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_idade_paciente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_nm_paciente = new javax.swing.JTextField();
        txt_cpf_paciente = new javax.swing.JTextField();
        cmbPaciente = new javax.swing.JComboBox();
        psd_senha_paciente = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btn_calcelarEdicao_paciente = new javax.swing.JButton();
        btn_excluir_paciente = new javax.swing.JButton();
        btn_salvar_paciente = new javax.swing.JButton();
        btn_editar_paciente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Idade:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Editar Paciente");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Hospital:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Senha:");

        txt_cpf_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cpf_pacienteActionPerformed(evt);
            }
        });

        cmbPaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        psd_senha_paciente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("RG:");

        btn_calcelarEdicao_paciente.setText("Cancelar");
        btn_calcelarEdicao_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcelarEdicao_pacienteActionPerformed(evt);
            }
        });

        btn_excluir_paciente.setText("Excluir");
        btn_excluir_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_pacienteActionPerformed(evt);
            }
        });

        btn_salvar_paciente.setText("Salvar");
        btn_salvar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_pacienteActionPerformed(evt);
            }
        });

        btn_editar_paciente.setText("Editar");
        btn_editar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_pacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_cpf_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txt_idade_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_rg_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(psd_senha_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(0, 2, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_nm_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btn_editar_paciente)
                        .addGap(18, 18, 18)
                        .addComponent(btn_calcelarEdicao_paciente)
                        .addGap(18, 18, 18)
                        .addComponent(btn_excluir_paciente)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salvar_paciente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nm_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cpf_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_rg_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_idade_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(psd_senha_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(cmbPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editar_paciente)
                    .addComponent(btn_calcelarEdicao_paciente)
                    .addComponent(btn_excluir_paciente)
                    .addComponent(btn_salvar_paciente))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cpf_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cpf_pacienteActionPerformed
        /* Paciente p = (paciente)cmbPaciente.getSelectedItem();
        JOpitonPane.showMessageDialog(rootPane, p.getIdPaciente()); */
    }//GEN-LAST:event_txt_cpf_pacienteActionPerformed

    private void btn_calcelarEdicao_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcelarEdicao_pacienteActionPerformed
        desabilitarCampos();
    }//GEN-LAST:event_btn_calcelarEdicao_pacienteActionPerformed

    private void btn_excluir_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_pacienteActionPerformed
        cp.deletar(idPaciente);

        atualizarListaPaciente();

        desabilitarCampos();
    }//GEN-LAST:event_btn_excluir_pacienteActionPerformed

    private void btn_salvar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_pacienteActionPerformed
        Paciente p = new Paciente(txt_nm_paciente.getText());
        p.setNome(txt_nm_paciente.getText());
        p.setRg(txt_rg_paciente.getText());
        p.setCpf(txt_cpf_paciente.getText());
        p.setIdade(txt_idade_paciente.getWidth());
        p.setSenha(psd_senha_paciente.getText());
        p.setIdHospital(cmbPaciente.getItemCount());
        p.setIdPaciente(idPaciente);

        cp.atualizar(p);

        atualizarListaPaciente();

        desabilitarCampos();
    }//GEN-LAST:event_btn_salvar_pacienteActionPerformed

    private void btn_editar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_pacienteActionPerformed
        int i = cmbPaciente.getSelectedIndex();
        /* Paciente p = (Paciente) cmbPaciente.getItemAt(i);
        txt_nm_paciente.setText(h.getNome());
        txt_rg_paciente.setText(h.getRg());
        txt_cpf_paciente.setText(h.getCpf());
        txt_idade_paciente.setWidth(h.getIdade());
        psd_senha_paciente.setText(h.getSenha());
        cmbPaciente.setItemCount(h.getIdHospital());
        
        idPaciente = h.getIdPaciente(); */

        habilitarCampos();
    }//GEN-LAST:event_btn_editar_pacienteActionPerformed

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
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_calcelarEdicao_paciente;
    private javax.swing.JButton btn_editar_hospital;
    private javax.swing.JButton btn_editar_hospital1;
    private javax.swing.JButton btn_editar_paciente;
    private javax.swing.JButton btn_excluir_paciente;
    private javax.swing.JButton btn_salvar_paciente;
    private javax.swing.JComboBox cmbPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField psd_senha_paciente;
    private javax.swing.JTextField txt_cpf_paciente;
    private javax.swing.JTextField txt_idade_paciente;
    private javax.swing.JTextField txt_nm_paciente;
    private javax.swing.JTextField txt_rg_paciente;
    // End of variables declaration//GEN-END:variables
}
