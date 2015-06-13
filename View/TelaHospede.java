package View;

import DAO.DAOCidades;
import DAO.DAOHospedes;
import DAO.DAOTipoTelefone;
import MascarasCampos.ApenasLetras;
import MascarasCampos.ApenasNumeros;
import TableModel.TableModelHospedes;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Cidades;
import modelo.Hospedes;
import modelo.TipoTelefone;

public class TelaHospede extends javax.swing.JFrame{
    
    public static List<Hospedes> hospedes;
    Hospedes hosp = new Hospedes();
    Cidades cid = new Cidades();
    TipoTelefone tt = new TipoTelefone();
    
   
    private DAOHospedes dHospedes = new DAOHospedes();
    private DAOCidades dCidades = new DAOCidades();
    private DAOTipoTelefone dTipoTel = new DAOTipoTelefone();
    private TableModel.TableModelHospedes tmhosp = new TableModelHospedes();
    private DefaultComboBoxModel dcbmCidades = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmTipoTel = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmHosp = new DefaultComboBoxModel();
    private DefaultTableModel dtm = new DefaultTableModel();
    private TableRowSorter sorter = new TableRowSorter();

    public TelaHospede() {
        initComponents();
        
        try {
            preencheTabela();
            preencherComboboxCid();
            preencherComboboxTipoTel1();
            preencheComboboxTipoTel2();
        } catch (Exception e) {
        }
        
        //MASCARA CAMPOS
        jTextFieldCodigo.setDocument(new ApenasNumeros());
        jTextFieldNome.setDocument(new ApenasLetras());
        jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas
      
    }

    @SuppressWarnings("unchecked")
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
        jLabelCidade = new javax.swing.JLabel();
        jComboBoxCidades = new javax.swing.JComboBox();
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
        jLabelTipoTelefone = new javax.swing.JLabel();
        jComboBoxTipoTelefone1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTelefone2 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter Telefone2 = new javax.swing.text.MaskFormatter("(##)####-####");

            jTextFieldTelefone2 = new javax.swing.JFormattedTextField(Telefone2);
        }catch(Exception e){
        }
        jLabelTipoTelefone2 = new javax.swing.JLabel();
        jComboBoxTipoTelefone2 = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonAddCidades = new javax.swing.JButton();
        jButtonAddTipoTel1 = new javax.swing.JButton();
        jButtonAddTipoTel2 = new javax.swing.JButton();

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

        jLabelCidade.setText("Cidade");

        jComboBoxCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadesActionPerformed(evt);
            }
        });

        jLabel2.setText("Placa Veículo");

        jLabelTelefone1.setText("Telefone");

        jLabelTipoTelefone.setText("Tipo Telefone");

        jComboBoxTipoTelefone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoTelefone1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefone");

        jLabelTipoTelefone2.setText("Tipo Telefone");

        jComboBoxTipoTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoTelefone2ActionPerformed(evt);
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

        jButtonAddCidades.setText("+");
        jButtonAddCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCidadesActionPerformed(evt);
            }
        });

        jButtonAddTipoTel1.setText("+");
        jButtonAddTipoTel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTipoTel1ActionPerformed(evt);
            }
        });

        jButtonAddTipoTel2.setText("+");
        jButtonAddTipoTel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTipoTel2ActionPerformed(evt);
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
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCodigo)
                                            .addComponent(jLabelCPF))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelNome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldNome))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelRG)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelEmail)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabelCidade))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabelTelefone1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextFieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabelTipoTelefone)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jComboBoxTipoTelefone1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabelTipoTelefone2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jComboBoxTipoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(0, 0, Short.MAX_VALUE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonAddCidades))
                                            .addComponent(jButtonAddTipoTel2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonAddTipoTel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 12, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonNovo)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonSalvar)
                        .addGap(66, 66, 66)
                        .addComponent(jButtonAlterar)
                        .addGap(74, 74, 74)
                        .addComponent(jButtonExcluir)
                        .addGap(67, 67, 67)
                        .addComponent(jButtonFechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLimpar)
                        .addGap(50, 50, 50))))
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
                    .addComponent(jLabelCidade)
                    .addComponent(jComboBoxCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddCidades))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTelefone1)
                            .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipoTelefone)
                            .addComponent(jComboBoxTipoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddTipoTel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTipoTelefone2)
                            .addComponent(jComboBoxTipoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddTipoTel2))))
                .addGap(18, 18, 18)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAlterar, jButtonExcluir, jButtonFechar, jButtonLimpar, jButtonNovo, jButtonSalvar});

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

        setSize(new java.awt.Dimension(857, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCidadesActionPerformed
        TelaCadCidades tcc = new TelaCadCidades();
        tcc.setVisible(true);
        preencherComboboxCid();
    }//GEN-LAST:event_jButtonAddCidadesActionPerformed

    private void jButtonAddTipoTel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTipoTel1ActionPerformed
        TelaTipoTelefone ttt = new TelaTipoTelefone();
        ttt.setVisible(true);
        preencherComboboxTipoTel1();
    }//GEN-LAST:event_jButtonAddTipoTel1ActionPerformed

    private void jButtonAddTipoTel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTipoTel2ActionPerformed
       TelaTipoTelefone ttt = new TelaTipoTelefone();
       ttt.setVisible(true);
       preencheComboboxTipoTel2();
    }//GEN-LAST:event_jButtonAddTipoTel2ActionPerformed

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
        jComboBoxCidades.setSelectedIndex(-1);
        jComboBoxTipoTelefone1.setSelectedIndex(-1);
        jComboBoxTipoTelefone2.setSelectedIndex(-1);
        
        //-----------------------
        jTextFieldCodigo.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jComboBoxCidades.setEnabled(true);
        jComboBoxTipoTelefone1.setEnabled(true);
        jComboBoxTipoTelefone2.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jTextFieldNome.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            hosp = new Hospedes();
            hosp.setId_hospede(Integer.parseInt(jTextFieldCodigo.getText()));
            hosp.setCpf_hospede(jTextFieldCPF.getText());
            hosp.setEmail(jTextFieldEmail.getText());
            hosp.setEndereco_hospede(jTextFieldEndereco.getText());
            hosp.setNome_hospede(jTextFieldNome.getText());
            hosp.setRg_hospede(jTextFieldRG.getText());
            hosp.setTelefone1(jTextFieldTelefone1.getText());
            hosp.setTelefone2(jTextFieldTelefone2.getText());
            hosp.setPlaca_veiculo(jTextFieldPlacaVeiculo.getText());
            hosp.setCidades((Cidades)jComboBoxCidades.getSelectedItem());
            hosp.setTipoTelefone((TipoTelefone)jComboBoxTipoTelefone1.getSelectedItem());
            hosp.setTipoTelefone((TipoTelefone)jComboBoxTipoTelefone2.getSelectedItem());
            dHospedes.inserir(hosp);
            preencheTabela();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar o cadastro!"+ "ERRO:" + e.getMessage());
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
        jComboBoxCidades.setSelectedItem(0);
        jComboBoxTipoTelefone1.setSelectedItem(0);
        jComboBoxTipoTelefone2.setSelectedItem(0);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jButtonNovo.setEnabled(true);
        jButtonLimpar.setEnabled(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        try {
            hosp = new Hospedes();
            hosp.setId_hospede(Integer.parseInt(jTextFieldCodigo.getText()));
            hosp.setCpf_hospede(jTextFieldCPF.getText());
            hosp.setEmail(jTextFieldEmail.getText());
            hosp.setEndereco_hospede(jTextFieldEndereco.getText());
            hosp.setNome_hospede(jTextFieldNome.getText());
            hosp.setRg_hospede(jTextFieldRG.getText());
            hosp.setTelefone1(jTextFieldTelefone1.getText());
            hosp.setTelefone2(jTextFieldTelefone2.getText());
            hosp.setPlaca_veiculo(jTextFieldPlacaVeiculo.getText());
            hosp.setCidades((Cidades)jComboBoxCidades.getSelectedItem());
            hosp.setTipoTelefone((TipoTelefone)jComboBoxTipoTelefone1.getSelectedItem());
            hosp.setTipoTelefone((TipoTelefone)jComboBoxTipoTelefone2.getSelectedItem());
            dHospedes.atualizar(hosp);
            preencheTabela();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao alterar o cadastro!"+ "ERRO:" + e.getMessage());
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
        jComboBoxCidades.setSelectedItem(0);
        jComboBoxTipoTelefone1.setSelectedItem(0);
        jComboBoxTipoTelefone2.setSelectedItem(0);
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
                    dHospedes.removerSelecionado(hosp);
                    preencheTabela();
                    jTextFieldCodigo.setText("");
                    jTextFieldCPF.setText("");
                    jTextFieldEmail.setText("");
                    jTextFieldEndereco.setText("");
                    jTextFieldNome.setText("");
                    jTextFieldRG.setText("");
                    jTextFieldTelefone1.setText("");
                    jTextFieldTelefone2.setText("");
                    jTextFieldPlacaVeiculo.setText("");
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
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        int linha  = jTableTabela.getSelectedRow();
        hosp = tmhosp.getHospedes(linha);
        
       jTextFieldCodigo.setText((String.valueOf(hosp.getId_hospede())));
       jTextFieldCPF.setText(String.valueOf(hosp.getCpf_hospede()));
       jTextFieldEmail.setText(String.valueOf(hosp.getEmail()));
       jTextFieldEndereco.setText(String.valueOf(hosp.getEndereco_hospede()));
       jTextFieldNome.setText(String.valueOf(hosp.getNome_hospede()));
       jTextFieldRG.setText(String.valueOf(hosp.getRg_hospede()));
       jTextFieldTelefone1.setText(String.valueOf(hosp.getTelefone1()));
       jTextFieldTelefone2.setText(String.valueOf(hosp.getTelefone2()));
       jTextFieldPlacaVeiculo.setText(String.valueOf(hosp.getPlaca_veiculo()));
       
       jButtonAlterar.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jButtonExcluir.setEnabled(true);
       jButtonLimpar.setEnabled(true);
       jButtonFechar.setEnabled(true);
       jTextFieldCodigo.setEnabled(true);
       jTextFieldCPF.setEnabled(true);
       jTextFieldEmail.setEnabled(true);
       jTextFieldEndereco.setEnabled(true);
       jTextFieldNome.setEnabled(true);
       jTextFieldRG.setEnabled(true);
       jTextFieldTelefone1.setEnabled(true);
       jTextFieldTelefone2.setEnabled(true);
       jTextFieldPlacaVeiculo.setEnabled(true);
    }//GEN-LAST:event_jTableTabelaMouseClicked

    private void jComboBoxCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadesActionPerformed
        cid = (Cidades)jComboBoxCidades.getSelectedItem();
        //preencherComboboxCid();
    }//GEN-LAST:event_jComboBoxCidadesActionPerformed

    private void jComboBoxTipoTelefone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoTelefone1ActionPerformed
        tt = (TipoTelefone)jComboBoxTipoTelefone1.getSelectedItem();
        //preencherComboboxTipoTel1();
    }//GEN-LAST:event_jComboBoxTipoTelefone1ActionPerformed

    private void jComboBoxTipoTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoTelefone2ActionPerformed
       tt = (TipoTelefone) jComboBoxTipoTelefone2.getSelectedItem();
       //preencheComboboxTipoTel2();
    }//GEN-LAST:event_jComboBoxTipoTelefone2ActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

   
     private void preencheTabela() throws SQLException{
        List<Hospedes> tipos = dHospedes.listarTodos();
        tmhosp = new TableModelHospedes(tipos);
        jTableTabela.setModel(tmhosp);
    } 
     
     private void preencherComboboxCid(){
         jComboBoxCidades.removeAll();
         dcbmHosp = new DefaultComboBoxModel(dCidades.listarTodos().toArray());
         jComboBoxCidades.setModel(dcbmHosp);
     }
     
     private void preencherComboboxTipoTel1(){
         jComboBoxTipoTelefone1.removeAll();
         dcbmHosp = new DefaultComboBoxModel(dTipoTel.listarTodos().toArray());
         jComboBoxTipoTelefone1.setModel(dcbmHosp);
     }
     
     private void preencheComboboxTipoTel2(){
         jComboBoxTipoTelefone2.removeAll();
         dcbmHosp = new DefaultComboBoxModel(dTipoTel.listarTodos().toArray());
         jComboBoxTipoTelefone2.setModel(dcbmHosp);
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
    private javax.swing.JButton jButtonAddCidades;
    private javax.swing.JButton jButtonAddTipoTel1;
    private javax.swing.JButton jButtonAddTipoTel2;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCidades;
    private javax.swing.JComboBox jComboBoxTipoTelefone1;
    private javax.swing.JComboBox jComboBoxTipoTelefone2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelTelefone1;
    private javax.swing.JLabel jLabelTipoTelefone;
    private javax.swing.JLabel jLabelTipoTelefone2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPlacaVeiculo;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldTelefone1;
    private javax.swing.JTextField jTextFieldTelefone2;
    // End of variables declaration//GEN-END:variables
}
