package View;

import DAO.DAOCidades;
import DAO.DAOHospedes;
import MascarasCampos.ApenasLetras;
import MascarasCampos.ApenasNumeros;
import TableModel.TableModelHospedes;
import ViewPesquisas.TelaPesquisaCidades;
import ViewPesquisas.TelaPesquisaHospedes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Cidades;
import modelo.Hospedes;

public class TelaHospede extends javax.swing.JFrame {

    private TelaHospede instancia;

    String[] veDados = new String[]{"Celular", "Residencial", "Trabalho", "Recado", "Escritorio"};

    public static List<Hospedes> hospedes;
    Hospedes hosp = new Hospedes();
    Cidades cidades = new Cidades();
    //TipoTelefone tt = new TipoTelefone();

    private DAOHospedes dHospedes = new DAOHospedes();
    private DAOCidades dCidades = new DAOCidades();
    private TableModel.TableModelHospedes tmhosp = new TableModelHospedes();
    private DefaultComboBoxModel dcbmCidades = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmHosp = new DefaultComboBoxModel();
    private DefaultTableModel dtm = new DefaultTableModel();
    private TableRowSorter sorter = new TableRowSorter();

    public TelaHospede() {
        initComponents();
        instancia = this;

        //MASCARA CAMPOS
        jTextFieldCodigo.setDocument(new ApenasNumeros());
        jTextFieldNome.setDocument(new ApenasLetras());
        //jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas

    }

    @SuppressWarnings("unchecked")
    public static void addTextAndSelectToTextFieldToRest(JTextField textField, String newDado) {
        String dadoProcurado = "";
        int nroAtual = textField.getText().length();
        dadoProcurado = newDado.substring(nroAtual, newDado.length());
        if (newDado.isEmpty() || dadoProcurado.isEmpty()) {
            return;
        }
        try {
            textField.getDocument().insertString(textField.getCaretPosition(), dadoProcurado, null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO:" + e.getMessage());
        }
        textField.select(nroAtual, textField.getText().length());
    }

    /*Recebe o text ocompleto est partir da busca entre o dado est buscar e o vetor, toda que o vetor encontre 
     uma minima conincidencia*/
    public static String getTextoApartirVetor(String dadoBuscar, String[] veDados) {
        int nroPosition = getPositionVetorBuscar(dadoBuscar, veDados);
        if (nroPosition == -1) {
            return dadoBuscar;
        }
        return veDados[nroPosition];

    }
    /*receber est posição est partir da busca entre o dado est buscar e o vetor, toda vez que  vetor encontrar alguma
     coincidencia*/

    public static int getPositionVetorBuscar(String dadoBuscar, String[] veDados) {
        try {
            for (int i = 0; i < veDados.length; i++) {
                if (dadoBuscar.equals(veDados[i].substring(0, dadoBuscar.length()))) {
                    return i;
                }

            }
        } catch (Exception e) {
        }
        return -1;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter CPF = new javax.swing.text.MaskFormatter("###.###.###-##");

            jTextFieldCPF = new javax.swing.JFormattedTextField(CPF);
        }catch(Exception e){
        }
        jLabelRG = new javax.swing.JLabel();
        jTextFieldRG = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter RG = new javax.swing.text.MaskFormatter("##.###.###-#");

            jTextFieldRG = new javax.swing.JFormattedTextField(RG);
        }catch(Exception e){
        }
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelCodCidade = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPlacaVeiculo = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter PlacaVeiculo = new javax.swing.text.MaskFormatter("UUU-####");

            jTextFieldPlacaVeiculo = new javax.swing.JFormattedTextField(PlacaVeiculo);
        }catch(Exception e){
        }
        jLabelTelefone1 = new javax.swing.JLabel();
        jTextFieldTelefone1 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter Telefone1 = new javax.swing.text.MaskFormatter("(##)####-####");

            jTextFieldTelefone1 = new javax.swing.JFormattedTextField(Telefone1);
        }catch(Exception e){
        }
        jLabelTipoTelefone1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTelefone2 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter Telefone2 = new javax.swing.text.MaskFormatter("(##)####-####");

            jTextFieldTelefone2 = new javax.swing.JFormattedTextField(Telefone2);
        }catch(Exception e){
        }
        jLabelTipoTelefone2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCidades = new javax.swing.JButton();
        jTextFieldTipoTelefone1 = new javax.swing.JTextField();
        jTextFieldTipoTelefone2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodCidade = new javax.swing.JTextField();
        jLabelNomeCidade = new javax.swing.JLabel();
        jTextFieldNomeCidade = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Hóspede");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Hóspedes"));
        jPanel1.setToolTipText("Cadastro de Hópedes");

        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setEditable(false);

        jLabelNome.setText("Nome");

        jLabelCPF.setText("CPF");

        jLabelRG.setText("RG");

        jLabelEmail.setText("E-mail");

        jLabel1.setText("Endereço");

        jLabelCodCidade.setText("Cód.Cidade");

        jLabel2.setText("Placa Veículo");

        jLabelTelefone1.setText("Telefone");

        jLabelTipoTelefone1.setText("Tipo Telefone");

        jLabel3.setText("Telefone");

        jLabelTipoTelefone2.setText("Tipo Telefone");

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

        jTextFieldTipoTelefone1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTipoTelefone1KeyReleased(evt);
            }
        });

        jTextFieldTipoTelefone2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTipoTelefone2KeyReleased(evt);
            }
        });

        jLabel4.setText("Cidades");

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
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)
                        .addGap(32, 32, 32)
                        .addComponent(jButtonAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFechar)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonLimpar)
                        .addGap(27, 27, 27)
                        .addComponent(jButtonPesquisar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelTelefone1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTelefone2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelTipoTelefone2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTipoTelefone2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelTipoTelefone1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldTipoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCodCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNomeCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldEndereco)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelCodigo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabelNome))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabelCPF)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(15, 15, 15)
                                            .addComponent(jLabelRG)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabelEmail)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonLimpar, jButtonNovo, jButtonSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRG)
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone1)
                    .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoTelefone1)
                    .addComponent(jTextFieldTipoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTipoTelefone2)
                        .addComponent(jTextFieldTipoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodCidade)
                    .addComponent(jTextFieldCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeCidade)
                    .addComponent(jTextFieldNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCidades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonPesquisar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(717, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCidadesActionPerformed
        TelaPesquisaCidades tpc = new TelaPesquisaCidades(instancia);
        tpc.setVisible(true);
        tpc.setValida(2);

        jButtonNovo.setEnabled(true);
    }//GEN-LAST:event_jButtonCidadesActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldCodigo.setText(String.valueOf(dHospedes.geraCodigo()));
        jTextFieldNome.setText("");
        jTextFieldCPF.setText("");
        jTextFieldRG.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldTelefone1.setText("");
        jTextFieldTelefone2.setText("");
        jTextFieldPlacaVeiculo.setText("");
        jTextFieldCodCidade.setText("");
        jTextFieldNomeCidade.setText("");

        //-----------------------
        jTextFieldCodigo.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonCidades.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jTextFieldNome.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            hosp = new Hospedes();
            cidades = new Cidades();
            hosp.setId_hospede(Integer.parseInt(jTextFieldCodigo.getText()));
            hosp.setCpf_hospede(jTextFieldCPF.getText());
            hosp.setEmail(jTextFieldEmail.getText());
            hosp.setEndereco_hospede(jTextFieldEndereco.getText());
            hosp.setNome_hospede(jTextFieldNome.getText());
            hosp.setRg_hospede(jTextFieldRG.getText());
            hosp.setTelefone1(jTextFieldTelefone1.getText());
            hosp.setTelefone2(jTextFieldTelefone2.getText());
            hosp.setTipo_Telefone(jTextFieldTipoTelefone1.getText());
            hosp.setTipo_Telefone(jTextFieldTipoTelefone2.getText());
            hosp.setPlaca_veiculo(jTextFieldPlacaVeiculo.getText());
            cidades.setId_cidades(Integer.parseInt(jTextFieldCodCidade.getText()));
            hosp.setCidades(cidades);
            cidades.setNome_cidades(jTextFieldNomeCidade.getText());
            hosp.setCidades(cidades);
            dHospedes.inserir(hosp);
         //   preencheTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o cadastro!" + "ERRO:" + e.getMessage());
        }
        //-----------------------------------------
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldCPF.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldRG.setText("");
        jTextFieldTelefone1.setText("");
        jTextFieldTelefone2.setText("");
        jTextFieldPlacaVeiculo.setText("");
        jTextFieldCodCidade.setText("");
        jTextFieldNomeCidade.setText("");
        jTextFieldTipoTelefone1.setText("");
        jTextFieldTipoTelefone2.setText("");
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonLimpar.setEnabled(false);
        jButtonCidades.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            hosp = new Hospedes();
            cidades = new Cidades();
            hosp.setId_hospede(Integer.parseInt(jTextFieldCodigo.getText()));
            hosp.setCpf_hospede(jTextFieldCPF.getText());
            hosp.setEmail(jTextFieldEmail.getText());
            hosp.setEndereco_hospede(jTextFieldEndereco.getText());
            hosp.setNome_hospede(jTextFieldNome.getText());
            hosp.setRg_hospede(jTextFieldRG.getText());
            hosp.setTelefone1(jTextFieldTelefone1.getText());
            hosp.setTelefone2(jTextFieldTelefone2.getText());
            hosp.setTipo_Telefone(jTextFieldTipoTelefone1.getText());
            hosp.setTipo_Telefone(jTextFieldTipoTelefone2.getText());
            hosp.setPlaca_veiculo(jTextFieldPlacaVeiculo.getText());
            cidades.setId_cidades(Integer.parseInt(jTextFieldCodCidade.getText()));
            hosp.setCidades(cidades);
            cidades.setNome_cidades(jTextFieldNomeCidade.getText());
            hosp.setCidades(cidades);
            dHospedes.atualizar(hosp);
            //preencheTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o cadastro!" + "ERRO:" + e.getMessage());
        }
        //-----------------------------------------
        jTextFieldCodigo.setText("");
        jTextFieldNome.setText("");
        jTextFieldCPF.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldRG.setText("");
        jTextFieldTelefone1.setText("");
        jTextFieldTelefone2.setText("");
        jTextFieldPlacaVeiculo.setText("");
        jTextFieldCodCidade.setText("");
        jTextFieldNomeCidade.setText("");
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonCidades.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonLimpar.setEnabled(false);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro selecionado?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.OK_OPTION);
        if (resultado == JOptionPane.YES_OPTION) {
            try {

                jTextFieldCodigo.setText("");
                jTextFieldCPF.setText("");
                jTextFieldEmail.setText("");
                jTextFieldEndereco.setText("");
                jTextFieldNome.setText("");
                jTextFieldRG.setText("");
                jTextFieldTelefone1.setText("");
                jTextFieldTelefone2.setText("");
                jTextFieldPlacaVeiculo.setText("");
                jTextFieldTipoTelefone1.setText("");
                jTextFieldTipoTelefone2.setText("");
                jTextFieldCodCidade.setText("");
                jTextFieldNomeCidade.setText("");
                dHospedes.removerSelecionado(hosp);
                JOptionPane.showMessageDialog(null, "Hospede removido com sucesso!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao remover hospede:" + e.getMessage());
            }

        }
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldCodigo.setText(null);
        jTextFieldCPF.setText(null);
        jTextFieldEmail.setText(null);
        jTextFieldEndereco.setText(null);
        jTextFieldNome.setText(null);
        jTextFieldRG.setText(null);
        jTextFieldTelefone1.setText(null);
        jTextFieldTelefone2.setText(null);
        jTextFieldPlacaVeiculo.setText(null);
        jTextFieldCodCidade.setText(null);
        jTextFieldNomeCidade.setText(null);
        jTextFieldTipoTelefone1.setText(null);
        jTextFieldTipoTelefone2.setText(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed


    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jTextFieldTipoTelefone1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTipoTelefone1KeyReleased
        if (!(evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105 || evt.getKeyCode() == evt.VK_ENTER)) {
            return;
        }

        if (jTextFieldTipoTelefone1.getText().isEmpty()) {
            return;
        }
        if (veDados.length == 0) {
            return;
        }
        addTextAndSelectToTextFieldToRest(jTextFieldTipoTelefone1, getTextoApartirVetor(jTextFieldTipoTelefone1.getText(), veDados));

    }//GEN-LAST:event_jTextFieldTipoTelefone1KeyReleased

    private void jTextFieldTipoTelefone2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTipoTelefone2KeyReleased
        if (!(evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105 || evt.getKeyCode() == evt.VK_ENTER)) {
            return;
        }

        if (jTextFieldTipoTelefone2.getText().isEmpty()) {
            return;
        }
        if (veDados.length == 0) {
            return;
        }
        addTextAndSelectToTextFieldToRest(jTextFieldTipoTelefone2, getTextoApartirVetor(jTextFieldTipoTelefone2.getText(), veDados));
    }//GEN-LAST:event_jTextFieldTipoTelefone2KeyReleased

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        TelaPesquisaHospedes tph = new TelaPesquisaHospedes(instancia);
        tph.setVisible(true);
        tph.setValida(1);
        try {
            tph.preencheTabela();
        } catch (SQLException ex) {
            Logger.getLogger(TelaHospede.class.getName()).log(Level.SEVERE, null, ex);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed
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
            java.util.logging.Logger.getLogger(TelaHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHospede().setVisible(true);
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
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCodCidade;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNomeCidade;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelTelefone1;
    private javax.swing.JLabel jLabelTipoTelefone1;
    private javax.swing.JLabel jLabelTipoTelefone2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCodCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeCidade;
    private javax.swing.JTextField jTextFieldPlacaVeiculo;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldTelefone1;
    private javax.swing.JTextField jTextFieldTelefone2;
    private javax.swing.JTextField jTextFieldTipoTelefone1;
    private javax.swing.JTextField jTextFieldTipoTelefone2;
    // End of variables declaration//GEN-END:variables

    public void recebeDados(Hospedes h) {
        List<Cidades> cid = new ArrayList<>();
        DAOCidades daocid = new DAOCidades();
        cid = daocid.getListaCidades();

        jTextFieldCodCidade.setText(String.valueOf(h.getCidades().getId_cidades()));
        for (Cidades cidades : cid) {
            if (cidades.getId_cidades() == (h.getCidades().getId_cidades())) {
                jTextFieldNomeCidade.setText(cidades.getNome_cidades());
            }
        }
        jTextFieldCodigo.setText(String.valueOf(h.getId_hospede()));
        jTextFieldNome.setText(String.valueOf(h.getNome_hospede()));
        jTextFieldCPF.setText(String.valueOf(h.getCpf_hospede()));
        jTextFieldRG.setText(String.valueOf(h.getRg_hospede()));
        jTextFieldEmail.setText(String.valueOf(h.getEmail()));
        jTextFieldEndereco.setText(String.valueOf(h.getEndereco_hospede()));
        jTextFieldPlacaVeiculo.setText(String.valueOf(h.getPlaca_veiculo()));
        jTextFieldTelefone1.setText(String.valueOf(h.getTelefone1()));
        jTextFieldTipoTelefone1.setText(String.valueOf(h.getTelefone2()));
        jTextFieldTelefone2.setText(String.valueOf(h.getTipo_Telefone()));
        jTextFieldTipoTelefone2.setText(String.valueOf(h.getTipo_Telefone()));

    }

    public void recebeDados(Cidades cid) {
        jTextFieldCodCidade.setText(String.valueOf(cid.getId_cidades()));
        jTextFieldNomeCidade.setText(cid.getNome_cidades());
    }

}
