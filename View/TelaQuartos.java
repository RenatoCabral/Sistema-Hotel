package View;

import DAO.DAOQuartos;
import DAO.DAOTiposDeQuartos;
import MascarasCampos.ApenasNumeros;
import MascarasCampos.LimitandoCamposLetras;
import TableModel.TableModelQuartos;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import modelo.Quartos;
import modelo.TiposDeQuartos;

public class TelaQuartos extends javax.swing.JFrame {
    
    Quartos quartos = new Quartos();
    TiposDeQuartos tdq = new TiposDeQuartos();
    private DAOQuartos dQuartos = new DAOQuartos();
    private DAOTiposDeQuartos dTiposQuartos = new DAOTiposDeQuartos();
    //private DefaultComboBoxModel dcbmQuartos = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmTiposQuarto = new DefaultComboBoxModel();
    private TableModel.TableModelQuartos tmQuartos = new TableModelQuartos();
    private TableRowSorter sorter = new TableRowSorter();

    public TelaQuartos() {
        initComponents();
        
        try {
            preencheTabela();
           
        } catch (Exception e) {
        }
        
        //MASCARA CAMPOS
        
        jTextFieldCodigo.setDocument(new ApenasNumeros());
        jTextFieldNumeroQuarto.setDocument(new ApenasNumeros());
        jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas
        jTextFieldNumeroQuarto.setDocument(new LimitandoCamposLetras(10));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelStatus = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNumeroQuarto = new javax.swing.JLabel();
        jLabelTiposQuartos = new javax.swing.JLabel();
        jComboBoxTiposQuartos = new javax.swing.JComboBox();
        jTextFieldNumeroQuarto = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxStatus = new javax.swing.JComboBox();
        jButtonAlterar = new javax.swing.JButton();
        jButtonAddTiposQuartos = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanelStatus.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Quartos"));

        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);

        jLabelNumeroQuarto.setText("Nº do quarto");

        jLabelTiposQuartos.setText("Tipo de quarto");

        jComboBoxTiposQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTiposQuartosActionPerformed(evt);
            }
        });

        jTextFieldNumeroQuarto.setEnabled(false);

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
        jScrollPane2.setViewportView(jTableTabela);

        jLabel1.setText("Status");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecione>", "Livre", "Ocupado" }));

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonAddTiposQuartos.setText("+");
        jButtonAddTiposQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTiposQuartosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStatusLayout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonSalvar)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExcluir)
                        .addGap(38, 38, 38)
                        .addComponent(jButtonFechar)
                        .addGap(8, 8, 8))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelStatusLayout.createSequentialGroup()
                        .addComponent(jLabelNumeroQuarto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelStatusLayout.createSequentialGroup()
                        .addComponent(jLabelCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTiposQuartos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTiposQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAddTiposQuartos)))
                .addContainerGap())
        );

        jPanelStatusLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonNovo, jButtonSalvar});

        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCodigo)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTiposQuartos))
                    .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxTiposQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAddTiposQuartos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNumeroQuarto)
                        .addComponent(jTextFieldNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelStatusLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonNovo, jButtonSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(553, 365));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldCodigo.setText(String.valueOf(dQuartos.geraCodigo()));
        jTextFieldNumeroQuarto.setText("");
        jComboBoxTiposQuartos.setSelectedIndex(-1);
        jComboBoxStatus.setSelectedIndex(0);
        //------------------------------
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jTextFieldNumeroQuarto.setEnabled(true);
        jComboBoxTiposQuartos.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
         if(jTextFieldNumeroQuarto.getText().equals("")){
           JOptionPane.showMessageDialog(null, "O campo Nº do quarto é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
           return;
       }if(jComboBoxTiposQuartos.getSelectedItem().equals("")){
           JOptionPane.showMessageDialog(null, "O Tipo de quarto é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
           return;
        }if(jComboBoxStatus.getSelectedItem().equals("")){
           JOptionPane.showMessageDialog(null, "O status é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
           return;
        }
       
        try {
            /*if(quartos.getNumero_quarto()== ){
                JOptionPane.showMessageDialog(null,"Quarto já cadastrado!");
            }*/
            Quartos quartos = new Quartos();
            quartos.setId_quarto(Integer.parseInt(jTextFieldCodigo.getText()));
            quartos.setNumero_quarto(Integer.parseInt(jTextFieldNumeroQuarto.getText()));
            quartos.setStatus(jComboBoxStatus.getToolTipText());
            quartos.setTiposquartos((TiposDeQuartos)jComboBoxTiposQuartos.getSelectedItem());
            dQuartos.insert(quartos);
            preencheTabela();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar o cadastro!"+ "ERRO:" + e.getMessage());
        }
        //---------------------------
        jTextFieldCodigo.setText("");
        jTextFieldNumeroQuarto.setText("");
        jComboBoxTiposQuartos.setSelectedItem(0);
        jComboBoxStatus.setSelectedItem(0);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonAlterar.setEnabled(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro selecionado?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.OK_OPTION );
            if(resultado == JOptionPane.YES_OPTION){
                try {
                    dQuartos.removerSelecionado(quartos);
                    preencheTabela();
                    jTextFieldCodigo.setText("");
                    jTextFieldNumeroQuarto.setText("");
                    jComboBoxStatus.setSelectedItem("");
                    jComboBoxTiposQuartos.setSelectedItem("");
                    JOptionPane.showMessageDialog(null, "Quarto removido com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover o quarto:" + e.getMessage());
                }

            }  
            //-----------------
            jButtonSalvar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            Quartos quartos = new Quartos();
            quartos.setId_quarto(Integer.parseInt(jTextFieldCodigo.getText()));
            quartos.setNumero_quarto(Integer.parseInt(jTextFieldNumeroQuarto.getText()));
            quartos.setStatus(jComboBoxStatus.getToolTipText());
            quartos.setTiposquartos((TiposDeQuartos)jComboBoxTiposQuartos.getSelectedItem());
            dQuartos.atualizar(quartos);
            preencheTabela();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao atualizar o cadastro!"+ "ERRO:" + e.getMessage());
        }
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        int linha  = jTableTabela.getSelectedRow();
        quartos = tmQuartos.getQuartos(linha);
        
         jTextFieldCodigo.setText((String.valueOf(quartos.getId_quarto())));
         jTextFieldNumeroQuarto.setText(String.valueOf(quartos.getNumero_quarto()));
         jComboBoxStatus.setSelectedItem(String.valueOf(quartos.getStatus()));
         jComboBoxTiposQuartos.setSelectedItem(String.valueOf(quartos.getTiposquartos()));
         //-------------------------------------
        jButtonAlterar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        jButtonFechar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jTextFieldNumeroQuarto.setEnabled(true);
        
    }//GEN-LAST:event_jTableTabelaMouseClicked

    private void jButtonAddTiposQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTiposQuartosActionPerformed
       TelaTiposDeQuartos ttq = new TelaTiposDeQuartos();
       ttq.setVisible(true);
      // preencherCombobox();
    }//GEN-LAST:event_jButtonAddTiposQuartosActionPerformed

    private void jComboBoxTiposQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTiposQuartosActionPerformed
        tdq = (TiposDeQuartos)jComboBoxTiposQuartos.getSelectedItem();
    }//GEN-LAST:event_jComboBoxTiposQuartosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        preencherCombobox();
    }//GEN-LAST:event_formWindowActivated

     private void preencheTabela() throws SQLException{
        List<Quartos> tipos = dQuartos.listarTodos();
        tmQuartos= new TableModelQuartos(tipos);
        jTableTabela.setModel(tmQuartos);
    } 
     
     private void preencherCombobox(){
         jComboBoxTiposQuartos.removeAll();
         dcbmTiposQuarto = new DefaultComboBoxModel(dTiposQuartos.listarTodos().toArray());
         jComboBoxTiposQuartos.setModel(dcbmTiposQuarto);
         
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
            java.util.logging.Logger.getLogger(TelaQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuartos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddTiposQuartos;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxStatus;
    private javax.swing.JComboBox jComboBoxTiposQuartos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNumeroQuarto;
    private javax.swing.JLabel jLabelTiposQuartos;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNumeroQuarto;
    // End of variables declaration//GEN-END:variables
}
