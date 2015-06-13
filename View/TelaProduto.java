package View;

import DAO.DAOFornecedor;
import DAO.DAOProdutos;
import MascarasCampos.LimitandoCamposLetras;
import MascarasCampos.LimitandoCamposNumeros;
import TableModel.TableModelProduto;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import modelo.Fornecedor;
import modelo.Produtos;

public class TelaProduto extends javax.swing.JFrame {
    
    Produtos produtos = new Produtos();
    Fornecedor fornecedor = new Fornecedor();
    
    private DAOProdutos dProdutos = new DAOProdutos();
    private DAOFornecedor dFornecedor = new DAOFornecedor();
    private TableModel.TableModelProduto tmProdutos = new TableModelProduto();
    private DefaultComboBoxModel dcbmFornecedor = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmProdutos = new DefaultComboBoxModel();
    private TableRowSorter sorter = new TableRowSorter();

    public TelaProduto() {
        initComponents();
        
        try {
            preencheTabela();
        } catch (Exception e) {
        }
        
        //MASCARA CAMPOS
        jTextFieldCodigo.setDocument(new LimitandoCamposNumeros(10) );
        jTextFieldCodigoProd.setDocument(new LimitandoCamposNumeros(10));
        jTextFieldNomeProduto.setDocument(new LimitandoCamposLetras(60));
        jTextFieldValorCompra.setDocument(new LimitandoCamposNumeros(10));
        jTextFieldValorVenda.setDocument(new LimitandoCamposNumeros(10));
        jTextFieldQuantidade.setDocument(new LimitandoCamposNumeros(100000));
        jTextFieldEstoque.setDocument(new LimitandoCamposNumeros(10000));
        jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelCodigoProd = new javax.swing.JLabel();
        jTextFieldCodigoProd = new javax.swing.JTextField();
        jLabelNomeProduto = new javax.swing.JLabel();
        jTextFieldNomeProduto = new javax.swing.JTextField();
        jLabelValorCompra = new javax.swing.JLabel();
        jTextFieldValorCompra = new javax.swing.JTextField();
        jLabelValorVenda = new javax.swing.JLabel();
        jTextFieldValorVenda = new javax.swing.JTextField();
        jLabelQuantidade = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jLabelFornecedor = new javax.swing.JLabel();
        jComboBoxFornecedor = new javax.swing.JComboBox();
        jButtonAddFornecedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jButtonLimpar = new javax.swing.JButton();
        jLabelEstoque = new javax.swing.JLabel();
        jTextFieldEstoque = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Produtos"));

        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);

        jLabelCodigoProd.setText("Código Prod");

        jTextFieldCodigoProd.setEnabled(false);

        jLabelNomeProduto.setText("Nome Produto");

        jTextFieldNomeProduto.setEnabled(false);

        jLabelValorCompra.setText("Valor de Compra");

        jTextFieldValorCompra.setEnabled(false);

        jLabelValorVenda.setText("Valor de Venda");

        jTextFieldValorVenda.setEnabled(false);

        jLabelQuantidade.setText("Quantidade");

        jTextFieldQuantidade.setEnabled(false);

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

        jLabelFornecedor.setText("Fornecedor");

        jComboBoxFornecedor.setEnabled(false);
        jComboBoxFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFornecedorActionPerformed(evt);
            }
        });

        jButtonAddFornecedor.setText("+");
        jButtonAddFornecedor.setEnabled(false);
        jButtonAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFornecedorActionPerformed(evt);
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

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLabelEstoque.setText("Estoque");

        jTextFieldEstoque.setEditable(false);
        jTextFieldEstoque.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonSalvar)
                        .addGap(59, 59, 59)
                        .addComponent(jButtonAlterar)
                        .addGap(50, 50, 50)
                        .addComponent(jButtonExcluir)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLimpar)
                        .addGap(11, 11, 11))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelValorCompra)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCodigoProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelNomeProduto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelValorVenda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelQuantidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAddFornecedor)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jLabelCodigoProd)
                    .addComponent(jTextFieldCodigoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeProduto)
                    .addComponent(jTextFieldNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorCompra)
                    .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValorVenda)
                    .addComponent(jTextFieldValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFornecedor)
                    .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddFornecedor)
                    .addComponent(jLabelEstoque)
                    .addComponent(jTextFieldEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonNovo, jButtonSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(742, 423));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFornecedorActionPerformed
        TelaFornecedor tf = new TelaFornecedor();
        tf.setVisible(true);
    }//GEN-LAST:event_jButtonAddFornecedorActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       jTextFieldCodigo.setText(String.valueOf(dProdutos.geraCodigo()));
       jTextFieldCodigoProd.setText("");
       jTextFieldNomeProduto.setText("");
       jTextFieldQuantidade.setText("");
       jTextFieldValorCompra.setText("");
       jTextFieldValorVenda.setText("");
       jTextFieldCodigoProd.requestFocus();
       //------------------------------------
       jButtonAlterar.setEnabled(true);
       jButtonExcluir.setEnabled(true);
       jButtonLimpar.setEnabled(true);
       jButtonSalvar.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jButtonFechar.setEnabled(true);
       jTextFieldCodigo.setEnabled(true);
       jTextFieldCodigoProd.setEnabled(true);
       jTextFieldNomeProduto.setEnabled(true);
       jTextFieldQuantidade.setEnabled(true);
       jTextFieldValorCompra.setEnabled(true);
       jTextFieldValorVenda.setEnabled(true);
       jComboBoxFornecedor.setEnabled(true);
       jButtonAddFornecedor.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            produtos = new Produtos();
            produtos.setId_produto(Integer.parseInt(jTextFieldCodigo.getText()));
            produtos.setCod_produto(Integer.parseInt(jTextFieldCodigoProd.getText()));
            produtos.setNome_produto(jTextFieldNomeProduto.getText());
            produtos.setQuantidade(Integer.parseInt(jTextFieldQuantidade.getText()));
            produtos.setValor_compra(Double.parseDouble(jTextFieldValorCompra.getText()));
            produtos.setValor_venda(Double.parseDouble(jTextFieldValorVenda.getText()));
            produtos.setFornecedor((Fornecedor)jComboBoxFornecedor.getSelectedItem());
            dProdutos.inserir(produtos);
            preencheTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o cadastro!"+ "ERRO:" + e.getMessage());
        }
        //----------------------------------------------
         jTextFieldCodigo.setText("");
         jTextFieldCodigoProd.setText("");
         jTextFieldNomeProduto.setText("");
         jTextFieldQuantidade.setText("");
         jTextFieldValorCompra.setText("");
         jTextFieldValorVenda.setText("");
         jComboBoxFornecedor.setSelectedItem(0);
         jButtonAlterar.setEnabled(true);
         jButtonExcluir.setEnabled(true);
         jButtonSalvar.setEnabled(false);
         jButtonFechar.setEnabled(true);
         jButtonNovo.setEnabled(true);
         jButtonLimpar.setEnabled(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            produtos = new Produtos();
            produtos.setId_produto(Integer.parseInt(jTextFieldCodigo.getText()));
            produtos.setCod_produto(Integer.parseInt(jTextFieldCodigoProd.getText()));
            produtos.setNome_produto(jTextFieldNomeProduto.getText());
            produtos.setQuantidade(Integer.parseInt(jTextFieldQuantidade.getText()));
            produtos.setValor_compra(Double.parseDouble(jTextFieldValorCompra.getText()));
            produtos.setValor_venda(Double.parseDouble(jTextFieldValorVenda.getText()));
            produtos.setFornecedor((Fornecedor)jComboBoxFornecedor.getSelectedItem());
            dProdutos.atualizar(produtos);
            preencheTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o cadastro!"+ "ERRO:" + e.getMessage());
        }
        //------------------------------------
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonLimpar.setEnabled(false);
        jTextFieldCodigo.setText("");
        jTextFieldCodigoProd.setText("");
        jTextFieldNomeProduto.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldValorCompra.setText("");
        jTextFieldValorVenda.setText("");
        jComboBoxFornecedor.setSelectedItem(0);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro selecionado?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.OK_OPTION );
            if(resultado == JOptionPane.YES_OPTION){
                try {
                    dProdutos.removerSelecionado(produtos);
                    preencheTabela();
                     jTextFieldCodigo.setText("");
                     jTextFieldCodigoProd.setText("");
                     jTextFieldNomeProduto.setText("");
                     jTextFieldQuantidade.setText("");
                     jTextFieldValorCompra.setText("");
                     jTextFieldValorVenda.setText("");
                    JOptionPane.showMessageDialog(null, "Produto removido com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover produto:" + e.getMessage());
                }
                //----------------------------------------------
                jButtonSalvar.setEnabled(false);
                jButtonFechar.setEnabled(true);
                jButtonNovo.setEnabled(true);
                jButtonExcluir.setEnabled(true);
                jButtonLimpar.setEnabled(false);
                jButtonAlterar.setEnabled(false);

            }  
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
       jTextFieldCodigoProd.setText(null);
       jTextFieldNomeProduto.setText(null);
       jTextFieldQuantidade.setText(null);
       jTextFieldValorCompra.setText(null);
       jTextFieldValorVenda.setText(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        int linha  = jTableTabela.getSelectedRow();
        produtos = tmProdutos.getProdutos(linha);
        
        jTextFieldCodigo.setText((String.valueOf(produtos.getId_produto())));
        jTextFieldCodigoProd.setText(String.valueOf(produtos.getCod_produto()));
        jTextFieldNomeProduto.setText(String.valueOf(produtos.getNome_produto()));
        jTextFieldQuantidade.setText(String.valueOf(produtos.getQuantidade()));
        jTextFieldValorCompra.setText(String.valueOf(produtos.getValor_compra()));
        jTextFieldValorVenda.setText(String.valueOf(produtos.getValor_venda()));
        //-----------------------------------------
        jButtonAlterar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonFechar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jTextFieldCodigoProd.setEnabled(true);
        jTextFieldNomeProduto.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        jTextFieldValorCompra.setEnabled(true);
        jTextFieldValorVenda.setEnabled(true);
    }//GEN-LAST:event_jTableTabelaMouseClicked

    private void jComboBoxFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFornecedorActionPerformed
        fornecedor = (Fornecedor)jComboBoxFornecedor.getSelectedItem();
    }//GEN-LAST:event_jComboBoxFornecedorActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        preencheComboboxFornecedor();
    }//GEN-LAST:event_formWindowActivated

     private void preencheTabela() throws SQLException{
        List<Produtos> tipos = dProdutos.listarTodos();
        tmProdutos = new TableModelProduto(tipos);
        jTableTabela.setModel(tmProdutos);
    } 
     
     private void preencheComboboxFornecedor(){
         jComboBoxFornecedor.removeAll();
         dcbmFornecedor = new DefaultComboBoxModel(dFornecedor.listarTodos().toArray());
         jComboBoxFornecedor.setModel(dcbmFornecedor);
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
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddFornecedor;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxFornecedor;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCodigoProd;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelFornecedor;
    private javax.swing.JLabel jLabelNomeProduto;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelValorCompra;
    private javax.swing.JLabel jLabelValorVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCodigoProd;
    private javax.swing.JTextField jTextFieldEstoque;
    private javax.swing.JTextField jTextFieldNomeProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorCompra;
    private javax.swing.JTextField jTextFieldValorVenda;
    // End of variables declaration//GEN-END:variables
}
