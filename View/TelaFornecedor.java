package View;

import DAO.DAOCidades;
import DAO.DAOFornecedor;
import DAO.DAOTipoTelefone;
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
    
    private DAOFornecedor daoFornecedor = new DAOFornecedor();
    private DAOCidades daoCidades = new DAOCidades();
    private DAOTipoTelefone daoTipoTelefone = new DAOTipoTelefone();
    private TableModel.TableModelFornecedor tmfornecedor = new TableModelFornecedor();
    private DefaultComboBoxModel dcbmfornecedor = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmcidades = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmtipotelefone = new DefaultComboBoxModel();
    private TableRowSorter sorter = new TableRowSorter();

    public TelaFornecedor() {
        initComponents();
        
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
        jLabelCNPJ = new javax.swing.JLabel();
        jTextFieldCNPJ = new javax.swing.JTextField();
        jLabelInscEstadual = new javax.swing.JLabel();
        jTextFieldInscEstadual = new javax.swing.JTextField();
        jLabelNomeFantasia = new javax.swing.JLabel();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jLabelTipoTelefone = new javax.swing.JLabel();
        jComboBoxTipoTelefone = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelCidades = new javax.swing.JLabel();
        jComboBoxCidades = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jButtonAddCidades = new javax.swing.JButton();
        jButtonAddTipoTelefone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Fornecedor"));
        jPanel1.setFocusCycleRoot(true);

        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.setFocusCycleRoot(true);

        jLabelCNPJ.setText("CNPJ");

        jTextFieldCNPJ.setEnabled(false);
        jTextFieldCNPJ.setFocusCycleRoot(true);

        jLabelInscEstadual.setText("Insc.Estadual");

        jTextFieldInscEstadual.setEnabled(false);
        jTextFieldInscEstadual.setFocusCycleRoot(true);

        jLabelNomeFantasia.setText("Nome Fantasia");

        jTextFieldNomeFantasia.setEnabled(false);
        jTextFieldNomeFantasia.setFocusCycleRoot(true);

        jLabelTelefone.setText("Telefone");

        jTextFieldTelefone.setEnabled(false);
        jTextFieldTelefone.setFocusCycleRoot(true);

        jLabel1.setText("Razão Social");

        jTextFieldRazaoSocial.setEnabled(false);
        jTextFieldRazaoSocial.setFocusCycleRoot(true);

        jLabelTipoTelefone.setText("Tipo Telefone");

        jComboBoxTipoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoTelefoneActionPerformed(evt);
            }
        });

        jLabel2.setText("Endereço");

        jTextFieldEndereco.setEnabled(false);
        jTextFieldEndereco.setFocusCycleRoot(true);

        jLabelCidades.setText("Cidades");

        jComboBoxCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadesActionPerformed(evt);
            }
        });

        jTextFieldPesquisar.setEnabled(false);
        jTextFieldPesquisar.setFocusCycleRoot(true);

        jButtonPesquisar.setText("Pesquisar");

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

        jButtonAddCidades.setText("+");
        jButtonAddCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCidadesActionPerformed(evt);
            }
        });

        jButtonAddTipoTelefone.setText("+");
        jButtonAddTipoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTipoTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCNPJ)
                                .addGap(6, 6, 6)
                                .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelInscEstadual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeFantasia)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabelTelefone)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                                        .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelTipoTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxTipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonAddTipoTelefone))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelCidades)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonAddCidades))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButtonPesquisar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonAlterar)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonExcluir)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonFechar)
                        .addGap(48, 48, 48)
                        .addComponent(jButtonLimpar)
                        .addGap(40, 40, 40)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFantasia)
                    .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefone)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelTipoTelefone)))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddTipoTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidades)
                    .addComponent(jComboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddCidades))
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLimpar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonFechar)
                        .addComponent(jButtonExcluir)
                        .addComponent(jButtonAlterar)
                        .addComponent(jButtonSalvar)
                        .addComponent(jButtonNovo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
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

        setSize(new java.awt.Dimension(852, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldCodigo.setText(String.valueOf(daoFornecedor.geraCodigo()));
         jTextFieldCNPJ.setText("");
         jTextFieldInscEstadual.setText("");
         jTextFieldNomeFantasia.setText("");
         jTextFieldRazaoSocial.setText("");
         jTextFieldTelefone.setText("");
         jComboBoxTipoTelefone.setSelectedIndex(-1);
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
         jComboBoxTipoTelefone.setEnabled(true);
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
            fornecedor.setTipotelefone((TipoTelefone)jComboBoxTipoTelefone.getSelectedItem());
            daoFornecedor.inserir(fornecedor);
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
        jComboBoxTipoTelefone.setSelectedItem(0);
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
            fornecedor.setTipotelefone((TipoTelefone)jComboBoxTipoTelefone.getSelectedItem());
            daoFornecedor.atualizar(fornecedor);
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
        jComboBoxTipoTelefone.setSelectedItem(0);
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
                    daoFornecedor.removerSelecionado(fornecedor);
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
                jButtonNovo.setEnabled(true);
                jButtonLimpar.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonFechar.setEnabled(true);

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
        //--------------------------------
        jButtonNovo.setEnabled(true);
        jButtonFechar.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonAddTipoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTipoTelefoneActionPerformed
       TelaTipoTelefone telatipotelefone = new TelaTipoTelefone();
       telatipotelefone.setVisible(true);
    }//GEN-LAST:event_jButtonAddTipoTelefoneActionPerformed

    private void jButtonAddCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCidadesActionPerformed
       TelaCadCidades telacadcidades = new TelaCadCidades();
       telacadcidades.setVisible(true);
    }//GEN-LAST:event_jButtonAddCidadesActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        int linha  = jTableTabela.getSelectedRow();
        fornecedor = tmfornecedor.getFornecedor(linha);
        
         jTextFieldCodigo.setText((String.valueOf(fornecedor.getId_fornecedor())));
         jTextFieldEndereco.setText(String.valueOf(fornecedor.getEndereco()));
         jTextFieldTelefone.setText(String.valueOf(fornecedor.getTelefone()));
         jTextFieldCNPJ.setText(String.valueOf(fornecedor.getCnpj()));
         jTextFieldInscEstadual.setText(String.valueOf(fornecedor.getInsc_estadual()));
         jTextFieldNomeFantasia.setText(String.valueOf(fornecedor.getNomeFantasia()));
         jTextFieldRazaoSocial.setText(String.valueOf(fornecedor.getRazaoSocial()));
         //-----------------------------------------------------------------------------
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
    }//GEN-LAST:event_jTableTabelaMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        preencherComboboxCidades();
        preencherComboboxTipoTelefone();
    }//GEN-LAST:event_formWindowActivated

    private void jComboBoxTipoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoTelefoneActionPerformed
       tipotelefone = (TipoTelefone)jComboBoxTipoTelefone.getSelectedItem();
    }//GEN-LAST:event_jComboBoxTipoTelefoneActionPerformed

    private void jComboBoxCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadesActionPerformed
      cidades = (Cidades)jComboBoxCidades.getSelectedItem();
    }//GEN-LAST:event_jComboBoxCidadesActionPerformed

    private void preencheTabela() throws SQLException{
        List<Fornecedor> tipos = daoFornecedor.listarTodos();
        tmfornecedor = new TableModelFornecedor(tipos);
        jTableTabela.setModel(tmfornecedor);
    } 
    
    private void preencherComboboxCidades(){
         jComboBoxCidades.removeAll();
         dcbmcidades = new DefaultComboBoxModel(daoCidades.listarTodos().toArray());
         jComboBoxCidades.setModel(dcbmcidades);
    }
    
    private void preencherComboboxTipoTelefone(){
        jComboBoxTipoTelefone.removeAll();
        dcbmtipotelefone = new DefaultComboBoxModel(daoTipoTelefone.listarTodos().toArray());
        jComboBoxTipoTelefone.setModel(dcbmtipotelefone);
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
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCidades;
    private javax.swing.JButton jButtonAddTipoTelefone;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCidades;
    private javax.swing.JComboBox jComboBoxTipoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCidades;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelInscEstadual;
    private javax.swing.JLabel jLabelNomeFantasia;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTipoTelefone;
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
