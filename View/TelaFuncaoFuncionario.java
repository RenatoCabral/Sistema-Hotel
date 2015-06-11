package View;

import DAO.DAOFuncaoFuncionario;
import TableModel.TableModelFuncaoFuncionario;
import MascarasCampos.ApenasLetras;
import MascarasCampos.ApenasNumeros;
import MascarasCampos.LimitandoCamposLetras;
import modelo.FuncaoFuncionario;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;


public class TelaFuncaoFuncionario extends javax.swing.JFrame {
    
    FuncaoFuncionario ff = new FuncaoFuncionario();
    
    private DAO.DAOFuncaoFuncionario dff = new DAOFuncaoFuncionario();
    private TableModel.TableModelFuncaoFuncionario tmff = new TableModelFuncaoFuncionario();

   
    public TelaFuncaoFuncionario() {
        initComponents();
        
        //MASCARA PARA OS CAMPOS
        
        jTextFieldCodigo.setDocument(new ApenasNumeros());
        jTextFieldDescricao.setDocument(new ApenasLetras());
        jTextFieldDescricao.setDocument(new LimitandoCamposLetras(25));
        
        try {
            preencheTabela();
        } catch (Exception e) {
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Função");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Função"));
        jPanel1.setToolTipText("Cadastro de Função");

        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);

        jLabelDescricao.setText("Descrição");

        jTextFieldDescricao.setEnabled(false);

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
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimpar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescricao)
                    .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonLimpar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(557, 309));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       jTextFieldCodigo.setText(String.valueOf(dff.geraCodigo()));
       jTextFieldDescricao.setText("");
       jTextFieldCodigo.setEnabled(true);
       jTextFieldDescricao.setEnabled(true);
       jButtonAlterar.setEnabled(true);
       jButtonExcluir.setEnabled(true);
       jButtonLimpar.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jButtonFechar.setEnabled(true);
       jTextFieldCodigo.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            ff = new FuncaoFuncionario();
            ff.setId_funcao(Integer.parseInt(jTextFieldCodigo.getText()));
            ff.setNome_Funcao(jTextFieldDescricao.getText());
            dff.insert(ff);
            preencheTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO:" + e.getMessage());
        }
        
        jTextFieldCodigo.setText("");
        jTextFieldDescricao.setText("");
        jTextFieldCodigo.setEnabled(false);
        jTextFieldDescricao.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            ff = new FuncaoFuncionario();
            ff.setNome_Funcao(jTextFieldDescricao.getText());
            ff.setId_funcao(Integer.parseInt(jTextFieldCodigo.getText()));
            dff.atualizar(ff);
            preencheTabela();
             JOptionPane.showMessageDialog(null, "Função atualizado!");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Função não atualizado!" + "ERRO:" + e.getMessage());
        }
        
        jButtonSalvar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldDescricao.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro selecionado?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.OK_OPTION );
            if(resultado == JOptionPane.YES_OPTION){
                try {
                    dff.removerSelecionado(ff);
                    preencheTabela();
                    jTextFieldCodigo.setText("");
                    jTextFieldDescricao.setText("");
                    JOptionPane.showMessageDialog(null, "Estado removido com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover funcaofuncionario:" + e.getMessage());
                }

            }  
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
       jTextFieldDescricao.setText(null);
       jTextFieldCodigo.setText(null);
       jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
       int linha = jTableTabela.getSelectedRow();
       ff = tmff.getFuncaoFuncionario(linha);
       
       jTextFieldCodigo.setText((String.valueOf(ff.getId_funcao())));
       jTextFieldDescricao.setText(String.valueOf(ff.getNome_Funcao()));
       jButtonAlterar.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jButtonExcluir.setEnabled(true);
       jTextFieldCodigo.setEnabled(true);
       jTextFieldDescricao.setEnabled(true);
    }//GEN-LAST:event_jTableTabelaMouseClicked

     private void preencheTabela() throws SQLException{
        List<FuncaoFuncionario> tipos = dff.listarTodos();
        tmff = new TableModelFuncaoFuncionario(tipos);
        jTableTabela.setModel(tmff);
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
            java.util.logging.Logger.getLogger(TelaFuncaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncaoFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescricao;
    // End of variables declaration//GEN-END:variables
}
