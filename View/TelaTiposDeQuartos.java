package View;

import DAO.DAOTiposDeQuartos;
import MascarasCampos.ApenasLetras;
import MascarasCampos.ApenasNumeros;
import TableModel.TableModelTiposDeQuartos;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import modelo.TiposDeQuartos;

public class TelaTiposDeQuartos extends javax.swing.JFrame {
    
    TiposDeQuartos tdq = new TiposDeQuartos();
    
    private DAOTiposDeQuartos dtdq = new DAOTiposDeQuartos();
    private TableModel.TableModelTiposDeQuartos tbmtdq = new TableModelTiposDeQuartos();
    private TableRowSorter sorter = new TableRowSorter();

    public TelaTiposDeQuartos() {
        initComponents();
        
        try {
            preencheTabela();
        } catch (Exception e) {
        }
        
        //MASCARA CAMPOS
        jTextFieldCodigo.setDocument(new ApenasNumeros());
        jTextFieldDescricao.setDocument(new ApenasLetras());
        jTextFieldValor.setDocument(new ApenasNumeros());
        jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldDescricao = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldValor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Tipos de Quartos"));

        jLabelCodigo.setText("Código");

        jLabelDescricao.setText("Descrição");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);

        jTextFieldDescricao.setEnabled(false);

        jLabelValor.setText("Valor");

        jTextFieldValor.setEnabled(false);

        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabela);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.setEnabled(false);
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelValor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldValor)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovo)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonSalvar)
                                .addGap(36, 36, 36)
                                .addComponent(jButtonAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExcluir)
                                .addGap(54, 54, 54)
                                .addComponent(jButtonFechar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonNovo, jButtonSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFechar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonNovo, jButtonSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(581, 323));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       jTextFieldCodigo.setText(String.valueOf(dtdq.geraCodigo()));
       jTextFieldDescricao.setText("");
       jTextFieldValor.setText("");
       jTextFieldDescricao.setEnabled(true);
       jTextFieldValor.setEnabled(true);
       jButtonAlterar.setEnabled(true);
       jButtonExcluir.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jButtonFechar.setEnabled(true);
       jTextFieldDescricao.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       if(jTextFieldDescricao.getText().equals("")){
           JOptionPane.showMessageDialog(null, "O campo descrição é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
           return;
       }
        if(jTextFieldValor.getText().equals("")){
           JOptionPane.showMessageDialog(null, "O campo valor é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
           return;
       }
        try {

            tdq = new TiposDeQuartos();
            tdq.setId_TiposQuartos(Integer.parseInt(jTextFieldCodigo.getText()));
            tdq.setDescrição(jTextFieldDescricao.getText());
            tdq.setValor(Double.parseDouble(jTextFieldValor.getText()));
            dtdq.insert(tdq);
            preencheTabela();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        //---------------------------------------
        jTextFieldCodigo.setText("");
        jTextFieldDescricao.setText("");
        jTextFieldValor.setText("");
        jTextFieldCodigo.setEnabled(false);
        jTextFieldDescricao.setEnabled(false);
        jTextFieldValor.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            tdq = new TiposDeQuartos();
            tdq.setId_TiposQuartos(Integer.parseInt(jTextFieldCodigo.getText()));
            tdq.setDescrição(jTextFieldDescricao.getText());
            tdq.setValor(Double.parseDouble(jTextFieldValor.getText()));
            dtdq.atualizar(tdq);
            preencheTabela();
            JOptionPane.showMessageDialog(null, "Tipo de Quarto atualizado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Tipo de Quarto:" + "ERRO:" + e.getMessage());
        }
        //-----------------------------------------------------
         jButtonSalvar.setEnabled(false);
         jButtonExcluir.setEnabled(false);
         jButtonNovo.setEnabled(true);
         jButtonFechar.setEnabled(true);
         jTextFieldCodigo.setEnabled(false);
         jTextFieldDescricao.setEnabled(false);
         jTextFieldValor.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro selecionado?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.OK_OPTION );
            if(resultado == JOptionPane.YES_OPTION){
                try {
                    dtdq.removerSelecionado(tdq);
                    preencheTabela();
                    jTextFieldCodigo.setText("");
                    jTextFieldDescricao.setText("");
                    jTextFieldValor.setText("");
                    JOptionPane.showMessageDialog(null, "Tipo de Quarto removido com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover Tipo de Quarto!"+ "ERRO:" + e.getMessage());
                }

            }  
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        int linha = jTableTabela.getSelectedRow();
       tdq = tbmtdq.getTiposDeQuartos(linha);
       
       jTextFieldCodigo.setText((String.valueOf(tdq.getId_TiposQuartos())));
       jTextFieldDescricao.setText(String.valueOf(tdq.getDescrição()));
       jTextFieldValor.setText(String.valueOf(tdq.getValor()));
       jButtonExcluir.setEnabled(true);
       jButtonAlterar.setEnabled(true);
       jTextFieldDescricao.setEnabled(true);
       jTextFieldValor.setEnabled(true);
    }//GEN-LAST:event_jTableTabelaMouseClicked

   private void preencheTabela() throws SQLException{
        List<TiposDeQuartos> tipos = dtdq.listarTodos();
        tbmtdq = new TableModelTiposDeQuartos(tipos);
        jTableTabela.setModel(tbmtdq);
    }
    
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
            java.util.logging.Logger.getLogger(TelaTiposDeQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTiposDeQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTiposDeQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTiposDeQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTiposDeQuartos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
