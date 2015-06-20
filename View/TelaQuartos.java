package View;

import DAO.DAOQuartos;
import DAO.DAOTiposDeQuartos;
import MascarasCampos.ApenasNumeros;
import MascarasCampos.LimitandoCamposLetras;
import TableModel.TableModelQuartos;
import ViewPesquisas.TelaPesquisaQuartos;
import ViewPesquisas.TelaPesquisaTiposDeQuartos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Quartos;
import modelo.TiposDeQuartos;

public class TelaQuartos extends javax.swing.JFrame {
    
     private TelaQuartos instancia;
     
    
     
     String[] veDados = new String[]{"Livre", "Ocupado"};
    
    Quartos quartos = new Quartos();
    TiposDeQuartos tdq = new TiposDeQuartos();
    private DAOQuartos dQuartos = new DAOQuartos();
    private DAOTiposDeQuartos dTiposQuartos = new DAOTiposDeQuartos();
    private DefaultComboBoxModel dcbmTiposQuarto = new DefaultComboBoxModel();
    private TableModel.TableModelQuartos tmQuartos = new TableModelQuartos();
    //private TableRowSorter sorter = new TableRowSorter();

    public TelaQuartos() {
        initComponents();
        instancia = this;
        
        try {
            //preencheTabela();
           
        } catch (Exception e) {
        }
        
        //MASCARA CAMPOS
        
        jTextFieldCodigo.setDocument(new ApenasNumeros());
        jTextFieldNumeroQuarto.setDocument(new ApenasNumeros());
        //jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas
        jTextFieldNumeroQuarto.setDocument(new LimitandoCamposLetras(10));
    }

    @SuppressWarnings("unchecked")
    
    public static void addTextAndSelectToTextFieldToRest(JTextField textField, String newDado){
        String dadoProcurado= "";
        int nroAtual = textField.getText().length();
        dadoProcurado = newDado.substring(nroAtual, newDado.length());
        if(newDado.isEmpty() || dadoProcurado.isEmpty())
            return;
        try {
            textField.getDocument().insertString(textField.getCaretPosition(), dadoProcurado, null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO:" + e.getMessage());
        }
        textField.select(nroAtual, textField.getText().length());
    }
    
    /*Recebe o text ocompleto est partir da busca entre o dado est buscar e o vetor, toda que o vetor encontre 
    uma minima conincidencia*/   
    
    public static String getTextoApartirVetor(String dadoBuscar, String []veDados){
        int nroPosition = getPositionVetorBuscar(dadoBuscar, veDados);
        if(nroPosition == -1){
            return dadoBuscar;
        }
        return veDados[nroPosition];
    
    }
    
    /*receber est posição est partir da busca entre o dado est buscar e o vetor, toda vez que  vetor encontrar alguma
    coincidencia*/
    public static int getPositionVetorBuscar(String dadoBuscar, String []veDados ){
        try {
            for (int i = 0; i < veDados.length; i++) {
                if(dadoBuscar.equals(veDados[i].substring(0, dadoBuscar.length())))
                    return i;
                
            }
        } catch (Exception e) {
        }
        return -1;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanelStatus = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNumeroQuarto = new javax.swing.JLabel();
        jTextFieldNumeroQuarto = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAlterar = new javax.swing.JButton();
        jButtonTiposDeQuartos = new javax.swing.JButton();
        jTextFieldStatus = new javax.swing.JTextField();
        jLabelCodTipoQuarto = new javax.swing.JLabel();
        jTextFieldCodTipoQuarto = new javax.swing.JTextField();
        jLabelDescTipoQuarto = new javax.swing.JLabel();
        jTextFieldDescTipoQuarto = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

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

        jLabel1.setText("Status");

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonTiposDeQuartos.setText("Tipos De Quartos");
        jButtonTiposDeQuartos.setEnabled(false);
        jButtonTiposDeQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTiposDeQuartosActionPerformed(evt);
            }
        });

        jTextFieldStatus.setEnabled(false);
        jTextFieldStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldStatusKeyReleased(evt);
            }
        });

        jLabelCodTipoQuarto.setText("Cód.Tipo De Quarto");

        jTextFieldCodTipoQuarto.setEnabled(false);

        jLabelDescTipoQuarto.setText("Descrição Tipo De Quarto");

        jTextFieldDescTipoQuarto.setEnabled(false);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setEnabled(false);
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipos de Quartos");

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelStatusLayout.createSequentialGroup()
                        .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelStatusLayout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNumeroQuarto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanelStatusLayout.createSequentialGroup()
                                .addComponent(jLabelCodTipoQuarto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDescTipoQuarto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDescTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonTiposDeQuartos))
                            .addGroup(jPanelStatusLayout.createSequentialGroup()
                                .addComponent(jButtonNovo)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalvar)
                                .addGap(34, 34, 34)
                                .addComponent(jButtonAlterar)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonExcluir)
                                .addGap(35, 35, 35)
                                .addComponent(jButtonFechar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar))
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanelStatusLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonNovo, jButtonPesquisar, jButtonSalvar});

        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeroQuarto)
                    .addComponent(jTextFieldNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodTipoQuarto)
                    .addComponent(jTextFieldCodTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDescTipoQuarto)
                    .addComponent(jTextFieldDescTipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTiposDeQuartos))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonPesquisar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanelStatusLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonNovo, jButtonPesquisar, jButtonSalvar});

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(720, 290));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldCodigo.setText(String.valueOf(dQuartos.geraCodigo()));
        jTextFieldNumeroQuarto.setText("");
        jTextFieldStatus.setText("");
        jTextFieldCodTipoQuarto.setText("");
        jTextFieldDescTipoQuarto.setText("");
        
        //------------------------------
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonTiposDeQuartos.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jTextFieldNumeroQuarto.setEnabled(true);
        jTextFieldStatus.setEnabled(true);
        jTextFieldCodTipoQuarto.setEnabled(true);
        jTextFieldDescTipoQuarto.setEnabled(true);
        jTextFieldNumeroQuarto.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
         if(jTextFieldNumeroQuarto.getText().equals("")){
           JOptionPane.showMessageDialog(null, "O campo Nº do quarto é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
           return;
       }if(jTextFieldCodTipoQuarto.getText().equals("")){
           JOptionPane.showMessageDialog(null, "O Código do tipo de quarto é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
           return;
        }if(jTextFieldStatus.getText().equals("")){
           JOptionPane.showMessageDialog(null, "O status é obrigatório!", "Aviso", JOptionPane.WARNING_MESSAGE);
           return;
        }if(jTextFieldDescTipoQuarto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "A descrição do tipo de quarto é obrigatória!", "Aviso", JOptionPane.WARNING_MESSAGE);
           return; 
        }
       
        try {
            Quartos quartos = new Quartos();
            TiposDeQuartos tdquartos = new TiposDeQuartos();
            quartos.setId_quarto(Integer.parseInt(jTextFieldCodigo.getText()));
            quartos.setNumero_quarto(Integer.parseInt(jTextFieldNumeroQuarto.getText()));
            quartos.setStatus(jTextFieldStatus.getText());
            tdquartos.setId_TiposQuartos(Integer.parseInt(jTextFieldCodTipoQuarto.getText()));
            quartos.setTiposquartos(tdquartos);
            tdquartos.setDescrição(jTextFieldDescTipoQuarto.getText());
            quartos.setTiposquartos(tdquartos); 
            dQuartos.insert(quartos);
            //preencheTabela();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar o cadastro!"+ "ERRO:" + e.getMessage());
        }
        //---------------------------
        jTextFieldCodigo.setText("");
        jTextFieldNumeroQuarto.setText("");
        jTextFieldStatus.setText("");
        jTextFieldCodTipoQuarto.setText("");
        jTextFieldDescTipoQuarto.setText("");
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro selecionado?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.OK_OPTION );
            if(resultado == JOptionPane.YES_OPTION){
                try {
                    dQuartos.removerSelecionado(quartos);
                    //preencheTabela();
                    jTextFieldCodigo.setText("");
                    jTextFieldNumeroQuarto.setText("");
                    jTextFieldStatus.setText("");
                    jTextFieldCodTipoQuarto.setText("");
                    jTextFieldDescTipoQuarto.setText("");
                    JOptionPane.showMessageDialog(null, "Quarto removido com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover o quarto:" + e.getMessage());
                }

            }  
            //-----------------
            jButtonSalvar.setEnabled(false);
            jButtonAlterar.setEnabled(false);
            jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            Quartos quartos = new Quartos();
            TiposDeQuartos tdquartos = new TiposDeQuartos();
            quartos.setId_quarto(Integer.parseInt(jTextFieldCodigo.getText()));
            quartos.setNumero_quarto(Integer.parseInt(jTextFieldNumeroQuarto.getText()));
            quartos.setStatus(jTextFieldStatus.getText());
            tdquartos.setId_TiposQuartos(Integer.parseInt(jTextFieldCodTipoQuarto.getText()));
            quartos.setTiposquartos(tdquartos);
            tdquartos.setDescrição(jTextFieldDescTipoQuarto.getText());
            quartos.setTiposquartos(tdquartos); 
            dQuartos.atualizar(quartos);
            //preencheTabela();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao atualizar o cadastro!"+ "ERRO:" + e.getMessage());
        }
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonTiposDeQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTiposDeQuartosActionPerformed
       TelaPesquisaTiposDeQuartos tptdq = new TelaPesquisaTiposDeQuartos(instancia);
       tptdq.setVisible(true);
       tptdq.setValida(0);
       
        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonTiposDeQuartosActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //preencherCombobox();
    }//GEN-LAST:event_formWindowActivated

    private void jTextFieldStatusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStatusKeyReleased
       if(!(evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode()<= 105 ||evt.getKeyCode() == evt.VK_ENTER))
            return;
        
        if(jTextFieldStatus.getText().isEmpty())
            return;
        if(veDados.length == 0)
            return;
        addTextAndSelectToTextFieldToRest(jTextFieldStatus, getTextoApartirVetor(jTextFieldStatus.getText(), veDados));
    }//GEN-LAST:event_jTextFieldStatusKeyReleased

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        TelaPesquisaQuartos tpq = new TelaPesquisaQuartos(instancia);
        tpq.setVisible(true);
        tpq.setValida(1);
         try {
             tpq.preencheTabela();
         } catch (SQLException ex) {
             Logger.getLogger(TelaQuartos.class.getName()).log(Level.SEVERE, null, ex);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed
    }
     /*private void preencheTabela() throws SQLException{
        List<Quartos> tipos = dQuartos.listarTodos();
        tmQuartos= new TableModelQuartos(tipos);
        jTableTabela.setModel(tmQuartos);
    } 
     */
    /* private void preencherCombobox(){
         jComboBoxTiposQuartos.removeAll();
         dcbmTiposQuarto = new DefaultComboBoxModel(dTiposQuartos.listarTodos().toArray());
         jComboBoxTiposQuartos.setModel(dcbmTiposQuarto);
         
     }
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
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonTiposDeQuartos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodTipoQuarto;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescTipoQuarto;
    private javax.swing.JLabel jLabelNumeroQuarto;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldCodTipoQuarto;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDescTipoQuarto;
    private javax.swing.JTextField jTextFieldNumeroQuarto;
    private javax.swing.JTextField jTextFieldStatus;
    // End of variables declaration//GEN-END:variables


    public void recebeDados(Quartos q){
        List<TiposDeQuartos> tq = new ArrayList<>();
        DAOTiposDeQuartos dtq = new DAOTiposDeQuartos();
        tq = dtq.getListaTiposDeQuartos();
        
        jTextFieldCodTipoQuarto.setText(String.valueOf(q.getTiposquartos().getId_TiposQuartos()));
        for(TiposDeQuartos tiposdequartos: tq){
            if(tiposdequartos.getId_TiposQuartos() == (q.getTiposquartos().getId_TiposQuartos())){
                jTextFieldDescTipoQuarto.setText(tiposdequartos.getDescrição());
            }
        }
        
        jTextFieldCodigo.setText(String.valueOf(q.getId_quarto()));
        jTextFieldNumeroQuarto.setText(String.valueOf(q.getNumero_quarto()));
        jTextFieldStatus.setText(String.valueOf(q.getStatus()));
      
    }
    
    public void recebeDados(TiposDeQuartos tdquartos){
        jTextFieldCodTipoQuarto.setText(String.valueOf(tdquartos.getId_TiposQuartos()));
        jTextFieldDescTipoQuarto.setText(tdquartos.getDescrição());
    
    }



}
