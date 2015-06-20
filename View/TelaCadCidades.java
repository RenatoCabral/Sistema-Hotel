
package View;

import DAO.DAOCidades;
import MascarasCampos.LimitandoCamposLetras;
import TableModel.TableModelCidades;
import ViewPesquisas.TelaPesquisaCidades;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Cidades;


public class TelaCadCidades extends javax.swing.JFrame {
    
    private TelaCadCidades instancia;
    
    String[] veDados = new String[]{"Alagoas - AL", "Amapá - AP", "Amazonas - AM", "Bahia - BA", "Ceará - CE", "Distrito Federal - DF", "Espírito Santo - ES", "Goiás - GO", "Maranhão - MA", "Mato Grosso - MT", "Mato Grosso do Sul - MS", "Minas Gerais - MG", "Pará - PA", "Paraíba - PB", "Paraná - PR", "Pernambuco - PE", "Piauí - PI", "Rio de Janeiro - RJ", "Rio Grande do Norte - RN", "Rio Grande do Sul - RS", "Rondônia - RO", "Roraima - RR", "Santa Catarina - SC", "São Paulo - SP", "Sergipe - SE", "Tocantins - TO"};
    
    Cidades cid =  new Cidades();
    private DAOCidades dCidades = new DAOCidades();
    private TableModel.TableModelCidades tmc = new TableModelCidades();
    
     /*public static TelaCadCidades getInstancia(){
         if(instancia == null){
             instancia = new TelaCadCidades();        
         }
         return instancia;
     }*/
    
    public TelaCadCidades() {
        initComponents();
        instancia = this;
        //MASCARAS PARA OS CAMPOS
        jTextFieldNomes.setDocument(new LimitandoCamposLetras(50));
        
        try {
           // preencheTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNomes = new javax.swing.JTextField();
        jLabelEstados = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldEstados = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cidades");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Cidades"));
        jPanel1.setToolTipText("Cadastro de Cidades");

        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setToolTipText("Código");

        jLabel1.setText("Nome");

        jLabelEstados.setText("Estados");

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
        jTableTabela.setToolTipText("Cidades");
        jTableTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabela);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jTextFieldEstados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldEstadosKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigo)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEstados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldNomes, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButtonPesquisar))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonNovo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonSalvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonAlterar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonFechar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonLimpar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
                        .addComponent(jSeparator1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonLimpar, jButtonNovo, jButtonPesquisar, jButtonSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstados)
                    .addComponent(jTextFieldEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonLimpar))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonLimpar, jButtonNovo, jButtonPesquisar, jButtonSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(622, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       jTextFieldCodigo.setText(String.valueOf(dCidades.geraCodigo()));
       jTextFieldNomes.setText("");
       jTextFieldCodigo.setEnabled(true);
       jTextFieldNomes.setEnabled(true);
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
            cid = new Cidades();
            cid.setId_cidades(Integer.parseInt(jTextFieldCodigo.getText()));
            cid.setNome_cidades(jTextFieldNomes.getText());
            cid.setEstados(jTextFieldEstados.getText());
            dCidades.insert(cid);
           // preencheTabela();
             //JOptionPane.showMessageDialog(null, "Cidade salva com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar a cidade!" + "ERRO:"+ e.getMessage());
        }
        jTextFieldCodigo.setText("");
        jTextFieldNomes.setText("");
        jTextFieldEstados.setText("");
        jTextFieldCodigo.setEnabled(false);
        jTextFieldNomes.setEnabled(false);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jTextFieldNomes.setEnabled(false);
        jButtonNovo.setEnabled(true);

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       try {
            cid = new Cidades();
            cid.setId_cidades(Integer.parseInt(jTextFieldCodigo.getText()));
            cid.setNome_cidades(jTextFieldNomes.getText());
            cid.setEstados(jTextFieldNomes.getText());
            dCidades.atualizar(cid);
            //preencheTabela();
            dCidades.atualizar(cid);
             JOptionPane.showMessageDialog(null, "A Cidade foi atualizada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a cidade!" + "ERRO:"+ e.getMessage());
        }
        jButtonSalvar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonLimpar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jTextFieldNomes.setEnabled(true);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldNomes.setEnabled(false);
       
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro selecionado?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.OK_OPTION );
            if(resultado == JOptionPane.YES_OPTION){
                try {
                    dCidades.removerSelecionado(cid);
                   // preencheTabela();
                    jTextFieldCodigo.setText("");
                    jTextFieldNomes.setText("");
                    jTextFieldNomes.setText("");
                    JOptionPane.showMessageDialog(null, "Cidade removida com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover a Cidade:" + "ERRO:" + e.getMessage());
                }

            } 
            jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
       jTextFieldNomes.setText(null);
       jTextFieldCodigo.setText(null);
       jTextFieldNomes.setText(null);
       jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        int linha = jTableTabela.getSelectedRow();
        cid = tmc.getCidades(linha);
       
       jTextFieldCodigo.setText((String.valueOf(cid.getId_cidades())));
       jTextFieldNomes.setText(String.valueOf(cid.getNome_cidades()));
       jTextFieldNomes.setText(String.valueOf(cid.getEstados()));
       jButtonAlterar.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jButtonExcluir.setEnabled(true);
       jTextFieldCodigo.setEnabled(true);
       jTextFieldNomes.setEnabled(true);
    }//GEN-LAST:event_jTableTabelaMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
       TelaPesquisaCidades tpc = new TelaPesquisaCidades(instancia);
       tpc.setVisible(true);
       tpc.setValida(1);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldEstadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEstadosKeyReleased
         if(!(evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode()<= 105 ||evt.getKeyCode() == evt.VK_ENTER))
            return;
        
        if(jTextFieldEstados.getText().isEmpty())
            return;
        if(veDados.length == 0)
            return;
        addTextAndSelectToTextFieldToRest(jTextFieldEstados, getTextoApartirVetor(jTextFieldEstados.getText(), veDados));
        
    }//GEN-LAST:event_jTextFieldEstadosKeyReleased

   /* private void preencheTabela() throws SQLException{
        List<Cidades> tipos = dCidades.listarTodos();
        tmc = new TableModelCidades(tipos);
        jTableTabela.setModel(tmc);
    }*/
    

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
            java.util.logging.Logger.getLogger(TelaCadCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new TelaCadCidades().setVisible(true);
            }
        });
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEstados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEstados;
    private javax.swing.JTextField jTextFieldNomes;
    // End of variables declaration//GEN-END:variables
    
    public void recebeDados(Cidades cid){
        
        jTextFieldCodigo.setText(String.valueOf(cid.getId_cidades()));
        jTextFieldNomes.setText(String.valueOf(cid.getNome_cidades()));
        jTextFieldEstados.setText(String.valueOf(cid.getEstados()));
    }
}
