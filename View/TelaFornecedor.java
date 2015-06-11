package View;

import DAO.DAOCidades;
import DAO.DAOFornecedor;
import DAO.DAOTipoTelefone;
import MascarasCampos.LimitandoCamposLetras;
import TableModel.TableModelFornecedor;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import modelo.Cidades;
import modelo.Fornecedor;
import modelo.TipoTelefone;

public class TelaFornecedor extends javax.swing.JFrame {
    
    Fornecedor fornecedor = new Fornecedor();
    Cidades cidades = new Cidades();
    TipoTelefone tipotelefone = new TipoTelefone();
    
    private DAOCidades dCidades = new DAOCidades();
    private DAOTipoTelefone dTipoTelefone = new DAOTipoTelefone();
    private DAOFornecedor dFornecedor = new DAOFornecedor();
    private TableModel.TableModelFornecedor tmFornecedor = new TableModelFornecedor();
    private DefaultComboBoxModel dcbmFornecedor = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmCid = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmTipoTel = new DefaultComboBoxModel();
    private TableRowSorter sorter = new TableRowSorter();

    public TelaFornecedor() {
        initComponents();
        
        try {
            preencheTabela();
            //preencherComboboxCid();
            //preencherComboboxTipoTel();
        } catch (Exception e) {
        }
        
        //MASCARA PARA OS CAMPOS
        jTextFieldNomeFantasia.setDocument(new LimitandoCamposLetras(50));
        jTextFieldRazaoSocial.setDocument(new LimitandoCamposLetras(50));
        jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelCNPJ = new javax.swing.JLabel();
        jTextFieldCNPJ = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter CNPJ = new javax.swing.text.MaskFormatter("##.###.###/####-##");

            jTextFieldCNPJ = new javax.swing.JFormattedTextField(CNPJ);
        }catch(Exception e){
        }
        jLabelInscEstadual = new javax.swing.JLabel();
        jTextFieldInscEstadual = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter InscEstadual = new javax.swing.text.MaskFormatter("##.###.###-#");

            jTextFieldInscEstadual = new javax.swing.JFormattedTextField(InscEstadual);
        }catch(Exception e){
        }
        jLabelNomeFantasia = new javax.swing.JLabel();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter Telefone = new javax.swing.text.MaskFormatter("(##)####-####");

            jTextFieldTelefone = new javax.swing.JFormattedTextField(Telefone);
        }catch(Exception e){
        }
        jLabelTipoTel = new javax.swing.JLabel();
        jComboBoxTipoTel = new javax.swing.JComboBox();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelCidades = new javax.swing.JLabel();
        jComboBoxCidades = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Fornecedor"));

        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);

        jLabelCNPJ.setText("CNPJ");

        jTextFieldCNPJ.setEnabled(false);

        jLabelInscEstadual.setText("Insc.Estadual");

        jTextFieldInscEstadual.setEnabled(false);

        jLabelNomeFantasia.setText("Nome Fantasia");

        jTextFieldNomeFantasia.setEnabled(false);

        jLabelRazaoSocial.setText("Razão Social");

        jTextFieldRazaoSocial.setEnabled(false);

        jLabelTelefone.setText("Telefone");

        jTextFieldTelefone.setEnabled(false);

        jLabelTipoTel.setText("Tipo Tel");

        jComboBoxTipoTel.setEnabled(false);
        jComboBoxTipoTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoTelActionPerformed(evt);
            }
        });

        jLabelEndereco.setText("Endereço");

        jTextFieldEndereco.setEnabled(false);

        jLabelCidades.setText("Cidades");

        jComboBoxCidades.setEnabled(false);
        jComboBoxCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadesActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
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

        jTextFieldPesquisar.setEnabled(false);

        jButtonPesquisar.setText("Pesquisar");

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelCodigo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabelCNPJ)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabelInscEstadual)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNomeFantasia)
                                        .addComponent(jLabelRazaoSocial)
                                        .addComponent(jLabelTelefone)
                                        .addComponent(jLabelEndereco))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldNomeFantasia)
                                        .addComponent(jTextFieldRazaoSocial)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabelTipoTel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBoxTipoTel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabelCidades)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jComboBoxCidades, 0, 160, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jButtonPesquisar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonSalvar)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonAlterar)
                        .addGap(51, 51, 51)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jButtonFechar)
                        .addGap(74, 74, 74)
                        .addComponent(jButtonLimpar)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonLimpar, jButtonNovo, jButtonPesquisar, jButtonSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCNPJ)
                    .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelInscEstadual)
                    .addComponent(jTextFieldInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFantasia)
                    .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRazaoSocial)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoTel)
                    .addComponent(jComboBoxTipoTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidades)
                    .addComponent(jComboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonLimpar, jButtonNovo, jButtonPesquisar, jButtonSalvar});

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

        setSize(new java.awt.Dimension(838, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
         jTextFieldCodigo.setText(String.valueOf(dFornecedor.geraCodigo()));
         jTextFieldCNPJ.setText("");
         jTextFieldInscEstadual.setText("");
         jTextFieldNomeFantasia.setText("");
         jTextFieldRazaoSocial.setText("");
         jTextFieldTelefone.setText("");
         jComboBoxTipoTel.setSelectedIndex(-1);
         jTextFieldEndereco.setText("");
         jComboBoxCidades.setSelectedIndex(-1);
         jTextFieldPesquisar.setText("");
         //-----------------------------------
         jTextFieldCodigo.setEnabled(true);
         jTextFieldCNPJ.setEnabled(true);
         jTextFieldInscEstadual.setEnabled(true);
         jTextFieldNomeFantasia.setEnabled(true);
         jTextFieldRazaoSocial.setEnabled(true);
         jTextFieldEndereco.setEnabled(true);
         jTextFieldTelefone.setEnabled(true);
         jTextFieldPesquisar.setEnabled(true);
          jComboBoxCidades.setEnabled(true);
         jComboBoxTipoTel.setEnabled(true);
         jButtonAlterar.setEnabled(true);
         jButtonExcluir.setEnabled(true);
         jButtonFechar.setEnabled(true);
         jButtonLimpar.setEnabled(true);
         jButtonNovo.setEnabled(false);
         jButtonPesquisar.setEnabled(true);
         jButtonSalvar.setEnabled(true);
         jTextFieldCNPJ.requestFocus();
         
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            fornecedor = new Fornecedor();
            fornecedor.setId_fornecedor(Integer.parseInt(jTextFieldCodigo.getText()));
            fornecedor.setCnpj(jTextFieldCNPJ.getText());
            fornecedor.setInsc_estadual(jTextFieldInscEstadual.getText());
            fornecedor.setEndereco(jTextFieldEndereco.getText());
            fornecedor.setNomeFantasia(jTextFieldNomeFantasia.getText());
            fornecedor.setRazaoSocial(jTextFieldRazaoSocial.getText());
            fornecedor.setTelefone(jTextFieldTelefone.getText());
            fornecedor.setEndereco(jTextFieldEndereco.getText());
            fornecedor.setCidades((Cidades)jComboBoxCidades.getSelectedItem());
            fornecedor.setTipotelefone((TipoTelefone)jComboBoxTipoTel.getSelectedItem());
            dFornecedor.inserir(fornecedor);
            preencheTabela();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar o cadastro!"+ "ERRO:" + e.getMessage());
        }
        //-------------------------------------------------------------------
        jTextFieldCodigo.setText("");
        jTextFieldCNPJ.setText("");
        jTextFieldInscEstadual.setText("");
        jTextFieldNomeFantasia.setText("");
        jTextFieldRazaoSocial.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldEndereco.setText("");
        jComboBoxCidades.setSelectedItem(0);
        jComboBoxTipoTel.setSelectedItem(0);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonLimpar.setEnabled(false);
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
       try {
            fornecedor = new Fornecedor();
            fornecedor.setId_fornecedor(Integer.parseInt(jTextFieldCodigo.getText()));
            fornecedor.setCnpj(jTextFieldCNPJ.getText());
            fornecedor.setInsc_estadual(jTextFieldInscEstadual.getText());
            fornecedor.setEndereco(jTextFieldEndereco.getText());
            fornecedor.setNomeFantasia(jTextFieldNomeFantasia.getText());
            fornecedor.setRazaoSocial(jTextFieldRazaoSocial.getText());
            fornecedor.setTelefone(jTextFieldTelefone.getText());
            fornecedor.setEndereco(jTextFieldEndereco.getText());
            fornecedor.setCidades((Cidades)jComboBoxCidades.getSelectedItem());
            fornecedor.setTipotelefone((TipoTelefone)jComboBoxTipoTel.getSelectedItem());
            dFornecedor.atualizar(fornecedor);
            preencheTabela();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao atualizar o cadastro!"+ "ERRO:" + e.getMessage());
        }
       //-------------------------------------------------------------------
        jTextFieldCodigo.setText("");
        jTextFieldCNPJ.setText("");
        jTextFieldInscEstadual.setText("");
        jTextFieldNomeFantasia.setText("");
        jTextFieldRazaoSocial.setText("");
        jTextFieldTelefone.setText("");
        jTextFieldEndereco.setText("");
        jComboBoxCidades.setSelectedItem(0);
        jComboBoxTipoTel.setSelectedItem(0);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonLimpar.setEnabled(false);
       
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro selecionado?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.OK_OPTION );
            if(resultado == JOptionPane.YES_OPTION){
                try {
                    dFornecedor.removerSelecionado(fornecedor);
                    preencheTabela();
                    jTextFieldCodigo.setText("");
                    jTextFieldCNPJ.setText("");
                    jTextFieldInscEstadual.setText("");
                    jTextFieldNomeFantasia.setText("");
                    jTextFieldRazaoSocial.setText("");
                    jTextFieldTelefone.setText("");
                    jTextFieldEndereco.setText("");
                    JOptionPane.showMessageDialog(null, "Fornecedor removido com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover fornecedor:" + e.getMessage());
                }

            }  
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldCodigo.setText(null);
        jTextFieldCNPJ.setText(null);
        jTextFieldInscEstadual.setText(null);
        jTextFieldNomeFantasia.setText(null);
        jTextFieldRazaoSocial.setText(null);
        jTextFieldTelefone.setText(null);
        jTextFieldEndereco.setText(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
         int linha  = jTableTabela.getSelectedRow();
         fornecedor = tmFornecedor.getFornecedor(linha);
         
          jTextFieldCodigo.setText((String.valueOf(fornecedor.getId_fornecedor())));
          jTextFieldEndereco.setText(String.valueOf(fornecedor.getEndereco()));
          jTextFieldTelefone.setText(String.valueOf(fornecedor.getTelefone()));
          jTextFieldCNPJ.setText(String.valueOf(fornecedor.getCnpj()));
          jTextFieldInscEstadual.setText(String.valueOf(fornecedor.getInsc_estadual()));
          jTextFieldNomeFantasia.setText(String.valueOf(fornecedor.getNomeFantasia()));
          jTextFieldRazaoSocial.setText(String.valueOf(fornecedor.getRazaoSocial()));
          //--------------------------------------------------------
          jButtonAlterar.setEnabled(true);
          jButtonNovo.setEnabled(false);
          jButtonExcluir.setEnabled(true);
          jButtonLimpar.setEnabled(true);
          jButtonFechar.setEnabled(true);
          jTextFieldCodigo.setEnabled(true);
          jTextFieldCNPJ.setEnabled(true);
          jTextFieldInscEstadual.setEnabled(true);
          jTextFieldNomeFantasia.setEnabled(true);
          jTextFieldRazaoSocial.setEnabled(true);
          jTextFieldEndereco.setEnabled(true);
          jTextFieldTelefone.setEnabled(true);
          jTextFieldPesquisar.setEnabled(true);
          //jComboBoxCidades.setEnabled(true);
          //jComboBoxTipoTel.setEnabled(true);    
    }//GEN-LAST:event_jTableTabelaMouseClicked

    private void jComboBoxTipoTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoTelActionPerformed
         tipotelefone = (TipoTelefone)jComboBoxTipoTel.getSelectedItem();
    }//GEN-LAST:event_jComboBoxTipoTelActionPerformed

    private void jComboBoxCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadesActionPerformed
         cidades = (Cidades)jComboBoxCidades.getSelectedItem();
    }//GEN-LAST:event_jComboBoxCidadesActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       preencherComboboxCid();
       preencherComboboxTipoTel();
    }//GEN-LAST:event_formWindowActivated

     private void preencheTabela() throws SQLException{
        List<Fornecedor> tipos = dFornecedor.listarTodos();
        tmFornecedor = new TableModelFornecedor(tipos);
        jTableTabela.setModel(tmFornecedor);
    } 
     
     private void preencherComboboxCid(){
         jComboBoxCidades.removeAll();
         dcbmFornecedor = new DefaultComboBoxModel(dCidades.listarTodos().toArray());
         jComboBoxCidades.setModel(dcbmFornecedor);
     }
     
     private void preencherComboboxTipoTel(){
         jComboBoxTipoTel.removeAll();
         dcbmFornecedor = new DefaultComboBoxModel(dTipoTelefone.listarTodos().toArray());
         jComboBoxTipoTel.setModel(dcbmFornecedor);
     }
   
    public static void main(String args[]) {
       

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFornecedor().setVisible(true);
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
    private javax.swing.JComboBox jComboBoxCidades;
    private javax.swing.JComboBox jComboBoxTipoTel;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCidades;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelInscEstadual;
    private javax.swing.JLabel jLabelNomeFantasia;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTipoTel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldInscEstadual;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
