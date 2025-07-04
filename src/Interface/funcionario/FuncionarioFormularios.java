/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface.funcionario;

import DAO.ConexaoFormulario;
import Modelo.ContatoFormulario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jonat
 */
public class FuncionarioFormularios extends javax.swing.JFrame {

    /**
     * Creates new form sementesFormularios
     */
    public FuncionarioFormularios() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(236, 236, 220));

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
        tblFormularios = new javax.swing.JTable();
        Editar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tblApagar = new javax.swing.JButton();
        home = new javax.swing.JButton();
        visualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 769));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblFormularios.setAutoCreateRowSorter(true);
        tblFormularios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Data", "Nome", "Idade", "Área de Interesse", "Descrição", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFormularios);

        Editar.setBackground(new java.awt.Color(218, 213, 200));
        Editar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editar.png"))); // NOI18N
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(110, 101, 85));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nossas sementes");
        jLabel1.setVerifyInputWhenFocusTarget(false);

        tblApagar.setBackground(new java.awt.Color(218, 213, 200));
        tblApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        tblApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblApagarActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(218, 213, 200));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/home.png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        visualizar.setBackground(new java.awt.Color(218, 213, 200));
        visualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/visualizar.png"))); // NOI18N
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sementes.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tblApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Editar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(visualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tblApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(visualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ConexaoFormulario formularioDao = new ConexaoFormulario(); 
      DefaultTableModel model = (DefaultTableModel) tblFormularios.getModel();
        model.setRowCount(0);

    for (ContatoFormulario formulario : formularioDao.listaFormularios()) {
    model.addRow(new Object[]{
        formulario.getId(),
        formulario.getData(),
        formulario.getNome(),
        formulario.getIdade(),
        formulario.getAreaInteresse(),
        formulario.getDescricao(),
        formulario.getStatus()
    });
    }
    }//GEN-LAST:event_formWindowOpened

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        if(tblFormularios.getSelectedRowCount () == 1){
        int row = tblFormularios.getSelectedRow();
        int id = Integer.parseInt(tblFormularios.getValueAt(row, 0).toString());
        new editarFormulario(id).setVisible(true);
        this.dispose();
        }
        
        else {
        JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
    }//GEN-LAST:event_EditarActionPerformed

    private void tblApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblApagarActionPerformed
        if(tblFormularios.getSelectedRowCount () == 1){
            int row = tblFormularios.getSelectedRow();
            int id = Integer.parseInt(tblFormularios.getValueAt(row, 0).toString());
            int resposta = JOptionPane.showConfirmDialog(null, "Desejar deletar essa semente?");
            if (resposta == JOptionPane.YES_OPTION){
                ConexaoFormulario contatoFormulario =  new ConexaoFormulario();
                contatoFormulario.deletarFormularioPorId(id);
                atualizarTabela();
            }
        }

        else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
    }//GEN-LAST:event_tblApagarActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        this.dispose();
        new TelaSelecao().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
         if(tblFormularios.getSelectedRowCount () == 1){
        int row = tblFormularios.getSelectedRow();
        int id = Integer.parseInt(tblFormularios.getValueAt(row, 0).toString());
        new VisualizarFormulario(id).setVisible(true);
        }
        
        else {
        JOptionPane.showMessageDialog(null, "Selecione uma linha");
        }
    }//GEN-LAST:event_visualizarActionPerformed

    
      public void atualizarTabela() {
    ConexaoFormulario contatoFormulario = new ConexaoFormulario();
    DefaultTableModel model = (DefaultTableModel) tblFormularios.getModel();

    // Limpa a tabela antes de atualizar
    model.setRowCount(0);

    // Recarrega os dados atualizados
    for (ContatoFormulario formulario : contatoFormulario.listaFormularios()) {
        model.addRow(new Object[]{
            formulario.getId(),
            formulario.getData(),
            formulario.getNome(),
            formulario.getIdade(),
            formulario.getAreaInteresse(),
            formulario.getDescricao(),
            formulario.getStatus()
        });
    }
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
            java.util.logging.Logger.getLogger(FuncionarioFormularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioFormularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioFormularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioFormularios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioFormularios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tblApagar;
    private javax.swing.JTable tblFormularios;
    private javax.swing.JButton visualizar;
    // End of variables declaration//GEN-END:variables
}
