package View;

import DAO.DAOCidades;
import DAO.DAOFuncaoFuncionario;
import DAO.DAOFuncionario;
import DAO.DAOTipoTelefone;
import MascarasCampos.ApenasLetras;
import MascarasCampos.ApenasNumeros;
import MascarasCampos.LimitandoCamposLetras;
import TableModel.TableModelFuncionario;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import modelo.Cidades;
import modelo.FuncaoFuncionario;
import modelo.Funcionarios;
import modelo.TipoTelefone;

public class TelaFuncionario extends javax.swing.JFrame {
    
    Funcionarios func = new Funcionarios();
    Cidades cid = new Cidades();
    FuncaoFuncionario ff = new FuncaoFuncionario();
    TipoTelefone tt = new TipoTelefone();
    
    public static List<Funcionarios> Funcionarios;
    private DAOFuncionario dfunc = new DAOFuncionario();
    private DAOCidades dCidade = new DAOCidades();
    private DAOFuncaoFuncionario dff = new DAOFuncaoFuncionario();
    private DAOTipoTelefone dtt = new DAOTipoTelefone();
    private TableModel.TableModelFuncionario tmfunc = new TableModelFuncionario();
    private DefaultComboBoxModel dcmCidades = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmff = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmtt = new DefaultComboBoxModel();
    private TableRowSorter sorter = new TableRowSorter();

    public TelaFuncionario() {
        initComponents();
        
        try {
           
            /*preencherComboboxFuncao();
            preencherComboboxTipoTel1();
            preencherComboboxTipoTel2();*/
            preencheTabela();
        } catch (Exception e) {
        }
        
        //MASCARA PARA OS CAMPOS
        jTextFieldNomeFunc.setDocument(new ApenasLetras());
        jTextFieldCodigo.setDocument(new ApenasNumeros());
        jTextFieldEndereco.setDocument(new LimitandoCamposLetras(20));
        jTextFieldEndereco.setDocument(new LimitandoCamposLetras(20));
        jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNomeFunc = new javax.swing.JLabel();
        jTextFieldNomeFunc = new javax.swing.JTextField();
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
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jComboBoxCidade = new javax.swing.JComboBox();
        jLabelTelefone1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jButtonLimpar = new javax.swing.JButton();
        jButtonAddCidade = new javax.swing.JButton();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefone1 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter Telefone = new javax.swing.text.MaskFormatter("(##)####-####");

            jTextFieldTelefone1 = new javax.swing.JFormattedTextField(Telefone);
        }catch(Exception e){
        }
        jLabelTelefone2 = new javax.swing.JLabel();
        jTextFieldTelefone2 = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter Telefone = new javax.swing.text.MaskFormatter("(##)####-####");

            jTextFieldTelefone2 = new javax.swing.JFormattedTextField(Telefone);
        }catch(Exception e){
        }
        jLabel5TipoTelefone = new javax.swing.JLabel();
        jLabelTipoTel2 = new javax.swing.JLabel();
        jComboBoxTipoTelefone2 = new javax.swing.JComboBox();
        jComboBoxTipoTelefone = new javax.swing.JComboBox();
        jButtonAddTel1 = new javax.swing.JButton();
        jButtonAddTel2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxFuncao = new javax.swing.JComboBox();
        jButtonAddFuncao = new javax.swing.JButton();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionarios");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Funcionarios"));
        jPanel1.setToolTipText("Cadastro de Funcionarios");

        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setEditable(false);

        jLabelNomeFunc.setText("Nome");

        jLabelCPF.setText("CPF");

        jLabelRG.setText("RG");

        jLabelEmail.setText("E-mail");

        jLabelEndereco.setText("Endereço");

        jLabelCidade.setText("Cidade");

        jComboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadeActionPerformed(evt);
            }
        });

        jLabelTelefone1.setText("Telefone ");

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
        jScrollPane3.setViewportView(jTableTabela);

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonAddCidade.setText("+");
        jButtonAddCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCidadeActionPerformed(evt);
            }
        });

        jLabelTelefone2.setText("Telefone");

        jLabel5TipoTelefone.setText("Tipo Tel");

        jLabelTipoTel2.setText("Tipo Tel");

        jComboBoxTipoTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoTelefone2ActionPerformed(evt);
            }
        });

        jComboBoxTipoTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxTipoTelefoneMouseClicked(evt);
            }
        });
        jComboBoxTipoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoTelefoneActionPerformed(evt);
            }
        });

        jButtonAddTel1.setText("+");
        jButtonAddTel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTel1ActionPerformed(evt);
            }
        });

        jButtonAddTel2.setText("+");
        jButtonAddTel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddTel2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Função");

        jComboBoxFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFuncaoActionPerformed(evt);
            }
        });

        jButtonAddFuncao.setText("+");
        jButtonAddFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFuncaoActionPerformed(evt);
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
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigo)
                            .addComponent(jLabelCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNomeFunc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelRG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addGap(61, 61, 61)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addGap(77, 77, 77)
                                .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addGap(65, 65, 65)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addGap(66, 66, 66)
                                .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addGap(77, 77, 77)
                                .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabelTelefone1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabelTelefone2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(366, 366, 366)
                                                .addComponent(jLabelEmail))
                                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(140, 140, 140))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextFieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabelTipoTel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jComboBoxTipoTelefone2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel5TipoTelefone)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jComboBoxTipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jLabelCidade))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButtonAddTel2)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jButtonAddTel1)
                                                    .addGap(26, 26, 26)
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jComboBoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButtonAddFuncao)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonAddCidade))))))
                            .addComponent(jSeparator1))
                        .addGap(42, 42, 42))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonAddCidade, jButtonAddFuncao, jButtonAddTel1, jButtonAddTel2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxFuncao, jComboBoxTipoTelefone, jComboBoxTipoTelefone2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNomeFunc)
                    .addComponent(jTextFieldNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRG)
                    .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddCidade))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone1)
                    .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5TipoTelefone)
                    .addComponent(jComboBoxTipoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddTel1)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddFuncao))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone2)
                    .addComponent(jTextFieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTipoTel2)
                    .addComponent(jComboBoxTipoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddTel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAddCidade, jButtonAddFuncao, jButtonAddTel1, jButtonAddTel2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBoxFuncao, jComboBoxTipoTelefone, jComboBoxTipoTelefone2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(948, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadeActionPerformed
       // String a = jComboBoxCidade.getModel().toString();
        cid = (Cidades)jComboBoxCidade.getSelectedItem();
  
        
       
    }//GEN-LAST:event_jComboBoxCidadeActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        jTextFieldCodigo.setText(String.valueOf(dfunc.geraCodigo()));
        jTextFieldNomeFunc.setText("");
        jTextFieldCPF.setText("");
        jTextFieldRG.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldTelefone1.setText("");
        jTextFieldTelefone2.setText("");
        jComboBoxCidade.setSelectedIndex(-1);
        jComboBoxFuncao.setSelectedIndex(-1);
        jComboBoxTipoTelefone.setSelectedIndex(-1);
        jComboBoxTipoTelefone2.setSelectedIndex(-1);
        //----- Campos que vão iniciar desabilitados
        
        jTextFieldCodigo.setEnabled(true);
        jTextFieldNomeFunc.setEnabled(true);
        jComboBoxCidade.setEnabled(true);
        jComboBoxFuncao.setEnabled(true);
        jComboBoxTipoTelefone.setEnabled(true);
        jComboBoxTipoTelefone2.setEnabled(true);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonLimpar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonFechar.setEnabled(true);
        jTextFieldNomeFunc.requestFocus();
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            func = new Funcionarios();
            func.setId_funcionarios(Integer.parseInt(jTextFieldCodigo.getText()));
            func.setCpf_funcionarios(jTextFieldCPF.getText());
            func.setEmail_funcionarios(jTextFieldEmail.getText());
            func.setEndereco(jTextFieldEndereco.getText());
            func.setNome_funcionarios(jTextFieldNomeFunc.getText());
            func.setRg_funcionarios(jTextFieldRG.getText());
            func.setTelefone1(jTextFieldTelefone1.getText());
            func.setTelefone2(jTextFieldTelefone2.getText());
            //func.setCidades((Cidades)jComboBoxCidade.getSelectedItem());
            cid.setNome_cidades(jComboBoxCidade.getSelectedItem().toString());    
            func.setCidades(cid);
            func.setFfunc((FuncaoFuncionario)jComboBoxFuncao.getSelectedItem());
            func.setTipotel((TipoTelefone)jComboBoxTipoTelefone.getSelectedItem());
            func.setTipotel((TipoTelefone)jComboBoxTipoTelefone2.getSelectedItem());
            dfunc.insert(func);
            preencheTabela();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar o cadastro!"+ "ERRO:" + e.getMessage());
        }
        jTextFieldCodigo.setText("");
        jTextFieldNomeFunc.setText("");
        jTextFieldCPF.setText("");
        jTextFieldEmail.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldRG.setText("");
        jTextFieldTelefone1.setText("");
        jTextFieldTelefone2.setText("");
        jComboBoxCidade.setSelectedItem(0);
        jComboBoxFuncao.setSelectedItem(0);
        jComboBoxTipoTelefone.setSelectedItem(0);
        jComboBoxTipoTelefone2.setSelectedItem(0);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonLimpar.setEnabled(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAddCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCidadeActionPerformed

        TelaCadCidades tcc = new TelaCadCidades();//ABIR A TELA DE CADASTRO DE CIDADES
        tcc.setVisible(true); 
        
    }//GEN-LAST:event_jButtonAddCidadeActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
         try {
            func = new Funcionarios();
            func.setId_funcionarios(Integer.parseInt(jTextFieldCodigo.getText()));
            func.setCpf_funcionarios(jTextFieldCPF.getText());
            func.setEmail_funcionarios(jTextFieldEmail.getText());
            func.setEndereco(jTextFieldEndereco.getText());
            func.setNome_funcionarios(jTextFieldNomeFunc.getText());
            func.setRg_funcionarios(jTextFieldRG.getText());
            func.setTelefone1(jTextFieldTelefone1.getText());
            func.setTelefone2(jTextFieldTelefone2.getText());
            func.setCidades((Cidades)jComboBoxCidade.getSelectedItem());
            func.setFfunc((FuncaoFuncionario)jComboBoxFuncao.getSelectedItem());
            func.setTipotel((TipoTelefone)jComboBoxTipoTelefone.getSelectedItem());
            func.setTipotel((TipoTelefone)jComboBoxTipoTelefone2.getSelectedItem());
            dfunc.atualizar(func);
            preencheTabela();
             JOptionPane.showMessageDialog(null, "Funcionario atualizado!");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao atualizar o funcionario!"+ "ERRO:" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "Confirma a exclusão do registro selecionado?","Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.OK_OPTION );
            if(resultado == JOptionPane.YES_OPTION){
                try {
                    dfunc.removerSelecionado(func);
                    preencheTabela();
                    jTextFieldCodigo.setText("");
                    jTextFieldCPF.setText("");
                    jTextFieldEmail.setText("");
                    jTextFieldEndereco.setText("");
                    jTextFieldNomeFunc.setText("");
                    jTextFieldRG.setText("");
                    jTextFieldTelefone1.setText("");
                    jTextFieldTelefone2.setText("");
                    JOptionPane.showMessageDialog(null, "Estado removido com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover funcaofuncionario:" + e.getMessage());
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
        jTextFieldCPF.setText(null);
        jTextFieldEmail.setText(null);
        jTextFieldEndereco.setText(null);
        jTextFieldNomeFunc.setText(null);
        jTextFieldRG.setText(null);
        jTextFieldTelefone1.setText(null);
        jTextFieldTelefone2.setText(null);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTableTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTabelaMouseClicked
        int linha  = jTableTabela.getSelectedRow();
        func = tmfunc.getFuncionarios(linha);
        
       jTextFieldCodigo.setText((String.valueOf(func.getId_funcionarios())));
       jTextFieldCPF.setText(String.valueOf(func.getCpf_funcionarios()));
       jTextFieldEmail.setText(String.valueOf(func.getEmail_funcionarios()));
       jTextFieldEndereco.setText(String.valueOf(func.getEndereco()));
       jTextFieldNomeFunc.setText(String.valueOf(func.getNome_funcionarios()));
       jTextFieldRG.setText(String.valueOf(func.getRg_funcionarios()));
       jTextFieldTelefone1.setText(String.valueOf(func.getTelefone1()));
       jTextFieldTelefone2.setText(String.valueOf(func.getTelefone2()));
       
       jButtonAlterar.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jButtonExcluir.setEnabled(true);
       jButtonLimpar.setEnabled(true);
       jButtonFechar.setEnabled(true);
       jTextFieldCodigo.setEnabled(true);
       jTextFieldCPF.setEnabled(true);
       jTextFieldEmail.setEnabled(true);
       jTextFieldEndereco.setEnabled(true);
       jTextFieldNomeFunc.setEnabled(true);
       jTextFieldRG.setEnabled(true);
       jTextFieldTelefone1.setEnabled(true);
       jTextFieldTelefone2.setEnabled(true);
    }//GEN-LAST:event_jTableTabelaMouseClicked

    private void jButtonAddFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFuncaoActionPerformed
        TelaFuncaoFuncionario tff = new TelaFuncaoFuncionario();
        tff.setVisible(true);
        preencherComboboxFuncao();
    }//GEN-LAST:event_jButtonAddFuncaoActionPerformed

    private void jComboBoxFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFuncaoActionPerformed
        ff = (FuncaoFuncionario)jComboBoxFuncao.getSelectedItem();
    }//GEN-LAST:event_jComboBoxFuncaoActionPerformed

    private void jButtonAddTel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTel1ActionPerformed
       TelaTipoTelefone ttt = new TelaTipoTelefone();
       ttt.setVisible(true);
       preencherComboboxTipoTel1();
    }//GEN-LAST:event_jButtonAddTel1ActionPerformed

    private void jButtonAddTel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddTel2ActionPerformed
       TelaTipoTelefone ttt = new TelaTipoTelefone();
       ttt.setVisible(true);
       preencherComboboxTipoTel2();
    }//GEN-LAST:event_jButtonAddTel2ActionPerformed

    private void jComboBoxTipoTelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxTipoTelefoneMouseClicked
        
    }//GEN-LAST:event_jComboBoxTipoTelefoneMouseClicked

    private void jComboBoxTipoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoTelefoneActionPerformed
        tt = (TipoTelefone)jComboBoxTipoTelefone.getSelectedItem();
    }//GEN-LAST:event_jComboBoxTipoTelefoneActionPerformed

    private void jComboBoxTipoTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoTelefone2ActionPerformed
       tt = (TipoTelefone)jComboBoxTipoTelefone2.getSelectedItem();
    }//GEN-LAST:event_jComboBoxTipoTelefone2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       preencherCombobox();
       preencherComboboxFuncao();
       preencherComboboxTipoTel1();
       preencherComboboxTipoTel2();
    }//GEN-LAST:event_formWindowActivated

    
    private void preencheTabela() throws SQLException{
        List<Funcionarios> tipos = dfunc.listarTodos();
        tmfunc = new TableModelFuncionario(tipos);
        jTableTabela.setModel(tmfunc);
    } 
   
    private void preencherCombobox(){
        jComboBoxCidade.removeAll();
        dcmCidades = new DefaultComboBoxModel(dCidade.listarTodos().toArray());
        jComboBoxCidade.setModel(dcmCidades);
    }
    
    private void preencherComboboxFuncao(){
        jComboBoxFuncao.removeAll();
        dcbmff = new DefaultComboBoxModel(dff.listarTodos().toArray());
        jComboBoxFuncao.setModel(dcbmff);
    }
    private void preencherComboboxTipoTel1(){
        jComboBoxTipoTelefone.removeAll();
        dcbmtt = new DefaultComboBoxModel(dtt.listarTodos().toArray());
        jComboBoxTipoTelefone.setModel(dcbmtt);
        
    }
    
    private void preencherComboboxTipoTel2(){
        jComboBoxTipoTelefone.removeAll();
        dcbmtt = new DefaultComboBoxModel(dtt.listarTodos().toArray());
        jComboBoxTipoTelefone2.setModel(dcbmtt);
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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCidade;
    private javax.swing.JButton jButtonAddFuncao;
    private javax.swing.JButton jButtonAddTel1;
    private javax.swing.JButton jButtonAddTel2;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxCidade;
    private javax.swing.JComboBox jComboBoxFuncao;
    private javax.swing.JComboBox jComboBoxTipoTelefone;
    private javax.swing.JComboBox jComboBoxTipoTelefone2;
    private javax.swing.JLabel jLabel5TipoTelefone;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNomeFunc;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelTelefone1;
    private javax.swing.JLabel jLabelTelefone2;
    private javax.swing.JLabel jLabelTipoTel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNomeFunc;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldTelefone1;
    private javax.swing.JTextField jTextFieldTelefone2;
    // End of variables declaration//GEN-END:variables
}
