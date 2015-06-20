package View;

import DAO.DAOCidades;
import DAO.DAOFornecedor;
import MascarasCampos.LimitandoCamposLetras;
import TableModel.TableModelFornecedor;
import ViewPesquisas.TelaPesquisaCidades;
import ViewPesquisas.TelaPesquisaFornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Cidades;
import modelo.Fornecedor;


public class TelaFornecedor extends javax.swing.JFrame {
    
    private TelaFornecedor instancia;
    
    String[] veDados = new String[]{"Celular", "Residencial", "Trabalho", "Recado", "Escritorio"};
    
    public static List<Fornecedor> fornecedores;
    Fornecedor fornecedor = new Fornecedor();
    Cidades cidades = new Cidades();
    
    private DAOFornecedor daoFornecedor = new DAOFornecedor();
    private DAOCidades daoCidades = new DAOCidades();
    private TableModel.TableModelFornecedor tmfornecedor = new TableModelFornecedor();
    private DefaultComboBoxModel dcbmfornecedor = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmcidades = new DefaultComboBoxModel();
    private DefaultTableModel dtmfornecedor = new DefaultTableModel();
    private TableRowSorter sorter = new TableRowSorter();

    public TelaFornecedor() {
        initComponents();
        instancia = this;
        
        try {
            //preencheTabela();
        } catch (Exception e) {
        }
        //MASCARA CAMPOS
       jTextFieldNomeFantasia.setDocument(new LimitandoCamposLetras(70));
       jTextFieldRazaoSocial.setDocument(new LimitandoCamposLetras(70));
       jTextFieldEndereco.setDocument(new LimitandoCamposLetras(60));
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

        jLabel4 = new javax.swing.JLabel();
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
        jLabelTelefone = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter Telefone = new javax.swing.text.MaskFormatter("(##)####-####");

            jTextFieldTelefone = new javax.swing.JFormattedTextField(Telefone);
        }catch(Exception e){
        }
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jLabelTipoTelefone = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCidades = new javax.swing.JButton();
        jTextFieldTipoTelefone = new javax.swing.JTextField();
        jTextFieldNomeCidade = new javax.swing.JTextField();
        jTextFieldCodCidade = new javax.swing.JTextField();
        jLabelCodCidade = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNomeCidade = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButtonPesquisar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

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

        jLabel2.setText("Endereço");

        jTextFieldEndereco.setEnabled(false);
        jTextFieldEndereco.setFocusCycleRoot(true);

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

        jButtonCidades.setText("Cidades");
        jButtonCidades.setEnabled(false);
        jButtonCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCidadesActionPerformed(evt);
            }
        });

        jTextFieldTipoTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTipoTelefoneKeyReleased(evt);
            }
        });

        jLabelCodCidade.setText("Cód.Cidade");

        jLabel3.setText("Cidades");

        jLabelNomeCidade.setText("Nome Cidade");

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setEnabled(false);
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
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
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCNPJ)
                                .addGap(6, 6, 6)
                                .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelInscEstadual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCodCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNomeCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCidades)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeFantasia)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabelTelefone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelTipoTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jTextFieldNomeFantasia)
                                    .addComponent(jTextFieldRazaoSocial)
                                    .addComponent(jTextFieldEndereco)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonNovo)
                                    .addGap(32, 32, 32)
                                    .addComponent(jButtonSalvar)
                                    .addGap(29, 29, 29)
                                    .addComponent(jButtonAlterar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonExcluir)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonFechar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonLimpar)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonPesquisar))))
                        .addGap(31, 31, 31))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonLimpar, jButtonNovo, jButtonSalvar});

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoTelefone)
                    .addComponent(jTextFieldTipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeCidade)
                    .addComponent(jTextFieldNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCidades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonPesquisar))
                .addGap(76, 76, 76))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonLimpar, jButtonNovo, jButtonSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(716, 443));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldCodigo.setText(String.valueOf(daoFornecedor.geraCodigo()));
         jTextFieldCNPJ.setText("");
         jTextFieldInscEstadual.setText("");
         jTextFieldNomeFantasia.setText("");
         jTextFieldRazaoSocial.setText("");
         jTextFieldTelefone.setText("");
         jTextFieldEndereco.setText("");
         jTextFieldTipoTelefone.setText("");
         jTextFieldCodCidade.setText("");
         jTextFieldNomeCidade.setText("");
        // jComboBoxCidades.setSelectedIndex(-1);
         //-----------------------------------
         jTextFieldCodigo.setEnabled(true);
         jTextFieldCNPJ.setEnabled(true);
         jTextFieldInscEstadual.setEnabled(true);
         jTextFieldNomeFantasia.setEnabled(true);
         jTextFieldRazaoSocial.setEnabled(true);
         jTextFieldEndereco.setEnabled(true);
         jTextFieldTelefone.setEnabled(true);
         jTextFieldTipoTelefone.setEnabled(true);
         jTextFieldCodCidade.setEnabled(true);
         jTextFieldNomeCidade.setEnabled(true);
         //jComboBoxCidades.setEnabled(true);
         jButtonAlterar.setEnabled(true);
         jButtonExcluir.setEnabled(true);
         jButtonFechar.setEnabled(true);
         jButtonLimpar.setEnabled(true);
         jButtonNovo.setEnabled(false);
         jButtonSalvar.setEnabled(true);
         jButtonCidades.setEnabled(true);
         jButtonPesquisar.setEnabled(true);
         jTextFieldCNPJ.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            fornecedor = new Fornecedor();
            cidades = new Cidades();
            fornecedor.setId_fornecedor(Integer.parseInt(jTextFieldCodigo.getText()));
            fornecedor.setCnpj(jTextFieldCNPJ.getText());
            fornecedor.setInsc_estadual(jTextFieldInscEstadual.getText());
            fornecedor.setEndereco(jTextFieldEndereco.getText());
            fornecedor.setNomeFantasia(jTextFieldNomeFantasia.getText());
            fornecedor.setRazaoSocial(jTextFieldRazaoSocial.getText());
            fornecedor.setTelefone(jTextFieldTelefone.getText());
            fornecedor.setEndereco(jTextFieldEndereco.getText());
            fornecedor.setTipo_telefone(jTextFieldTipoTelefone.getText());
            cidades.setId_cidades(Integer.parseInt(jTextFieldCodCidade.getText()));
            fornecedor.setCidades(cidades);
            cidades.setNome_cidades(jTextFieldNomeCidade.getText());
            fornecedor.setCidades(cidades);
            //fornecedor.setCidades((Cidades)jComboBoxCidades.getSelectedItem());
            daoFornecedor.inserir(fornecedor);
           // preencheTabela();
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
        jTextFieldTipoTelefone.setText("");
        jTextFieldCodCidade.setText("");
        jTextFieldNomeCidade.setText("");
        //jComboBoxCidades.setSelectedItem(0);
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
            fornecedor.setTipo_telefone(jTextFieldTipoTelefone.getText());
            //fornecedor.setCidades((Cidades)jComboBoxCidades.getSelectedItem());
            daoFornecedor.atualizar(fornecedor);
            //preencheTabela();
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
        jTextFieldTipoTelefone.setText("");
        //jComboBoxCidades.setSelectedItem(0);
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
                    //preencheTabela();
                    jTextFieldCodigo.setText("");
                    jTextFieldCNPJ.setText("");
                    jTextFieldInscEstadual.setText("");
                    jTextFieldNomeFantasia.setText("");
                    jTextFieldRazaoSocial.setText("");
                    jTextFieldTelefone.setText("");
                    jTextFieldEndereco.setText("");
                    jTextFieldTipoTelefone.setText("");
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
        jTextFieldTipoTelefone.setText(null);
        //--------------------------------
        jButtonNovo.setEnabled(true);
        jButtonFechar.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonAlterar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCidadesActionPerformed
       TelaPesquisaCidades tpc = new TelaPesquisaCidades(instancia);
       tpc.setVisible(true);
       tpc.setValida(0);
       
    }//GEN-LAST:event_jButtonCidadesActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //preencherComboboxCidades();
        //preencherComboboxTipoTelefone();
    }//GEN-LAST:event_formWindowActivated
    
    private void jTextFieldTipoTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTipoTelefoneKeyReleased
       if(!(evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode()<= 105 ||evt.getKeyCode() == evt.VK_ENTER))
            return;
        
        if(jTextFieldTipoTelefone.getText().isEmpty())
            return;
        if(veDados.length == 0)
            return;
        addTextAndSelectToTextFieldToRest(jTextFieldTipoTelefone, getTextoApartirVetor(jTextFieldTipoTelefone.getText(), veDados));
    }//GEN-LAST:event_jTextFieldTipoTelefoneKeyReleased

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        TelaPesquisaFornecedor tpf = new TelaPesquisaFornecedor(instancia);
        tpf.setVisible(true);
        tpf.setValida(1);
        try {
            tpf.preencheTabela();
        } catch (Exception e) {
        }
        
        
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    
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
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCidades;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCodCidade;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelInscEstadual;
    private javax.swing.JLabel jLabelNomeCidade;
    private javax.swing.JLabel jLabelNomeFantasia;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTipoTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCodCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldInscEstadual;
    private javax.swing.JTextField jTextFieldNomeCidade;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JTextField jTextFieldTipoTelefone;
    // End of variables declaration//GEN-END:variables

    public void recebeDados(Fornecedor f){
        List<Cidades> cid = new ArrayList<>();
        DAOCidades daocid = new DAOCidades();
        cid = daocid.getListaCidades();
        
        jTextFieldCodCidade.setText(String.valueOf(f.getCidades().getId_cidades()));
        for(Cidades cidades : cid){
            if(cidades.getId_cidades() == (f.getCidades().getId_cidades())){
                jTextFieldNomeCidade.setText(cidades.getNome_cidades());
            }
        
        }
        jTextFieldCodigo.setText(String.valueOf(f.getId_fornecedor()));
        jTextFieldCNPJ.setText(String.valueOf(f.getCnpj()));
        jTextFieldInscEstadual.setText(String.valueOf(f.getInsc_estadual()));
        jTextFieldNomeFantasia.setText(String.valueOf(f.getNomeFantasia()));
        jTextFieldRazaoSocial.setText(String.valueOf(f.getRazaoSocial()));
        jTextFieldEndereco.setText(String.valueOf(f.getEndereco()));
        jTextFieldTelefone.setText(String.valueOf(f.getTelefone()));
        jTextFieldTipoTelefone.setText(String.valueOf(f.getTipo_telefone()));
    
    }
    
    public void recebeDados(Cidades cid){
        jTextFieldCodCidade.setText(String.valueOf(cid.getId_cidades()));
        jTextFieldNomeCidade.setText(cid.getNome_cidades());
    }

















}
