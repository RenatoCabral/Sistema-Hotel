package View;

import DAO.DAOCidades;
import DAO.DAOFuncaoFuncionario;
import DAO.DAOFuncionario;
import MascarasCampos.ApenasLetras;
import MascarasCampos.ApenasNumeros;
import MascarasCampos.LimitandoCamposLetras;
import TableModel.TableModelFuncionario;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableRowSorter;
import modelo.Cidades;
import modelo.FuncaoFuncionario;
import modelo.Funcionarios;

public class TelaFuncionario extends javax.swing.JFrame {
    
    String[] veDados = new String[]{"Celular", "Residencial", "Trabalho", "Recado", "Escritorio"};
    
    Funcionarios func = new Funcionarios();
    Cidades cid = new Cidades();
    FuncaoFuncionario ff = new FuncaoFuncionario();
    String tt = new String();
    
    public static List<Funcionarios> Funcionarios;
    private DAOFuncionario dfunc = new DAOFuncionario();
    private DAOCidades dCidade = new DAOCidades();
    private DAOFuncaoFuncionario dff = new DAOFuncaoFuncionario();
    private TableModel.TableModelFuncionario tmfunc = new TableModelFuncionario();
    private DefaultComboBoxModel dcmCidades = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmff = new DefaultComboBoxModel();
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
        jLabelTelefone1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCidades = new javax.swing.JButton();
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
        jLabel5TipoTelefone1 = new javax.swing.JLabel();
        jLabelTipoTelefone2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonAddFuncao = new javax.swing.JButton();
        jTextFieldTipoTelefone1 = new javax.swing.JTextField();
        jTextFieldTipoTelefone2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeCidade = new javax.swing.JTextField();

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

        jLabelCidade.setText("Cód.Cidade");

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

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setEnabled(false);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCidades.setText("Cidades");
        jButtonCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCidadesActionPerformed(evt);
            }
        });

        jLabelTelefone2.setText("Telefone");

        jLabel5TipoTelefone1.setText("Tipo Tel");

        jLabelTipoTelefone2.setText("Tipo Tel");

        jLabel7.setText("Função");

        jButtonAddFuncao.setText("+");
        jButtonAddFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFuncaoActionPerformed(evt);
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

        jLabel1.setText("Cidades");

        jLabel2.setText("Nome Cidade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefone2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5TipoTelefone1)
                            .addComponent(jLabelTipoTelefone2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTipoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldTipoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(275, 340, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCodigo)
                                    .addComponent(jLabelCPF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelNomeFunc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNomeFunc))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelRG)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(535, 535, 535))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonAddFuncao)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel7)
                        .addGap(634, 634, 634))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCidades, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
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
                    .addComponent(jLabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone1)
                    .addComponent(jTextFieldTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5TipoTelefone1)
                    .addComponent(jTextFieldTipoTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTipoTelefone2)
                        .addComponent(jTextFieldTipoTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTelefone2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldCodCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCidades))
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddFuncao)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonAddFuncao, jButtonCidades});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1176, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        //jComboBoxTipoTelefone.setSelectedIndex(-1);
        //jComboBoxTipoTelefone2.setSelectedIndex(-1);
        //----- Campos que vão iniciar desabilitados
        
        jTextFieldCodigo.setEnabled(true);
        jTextFieldNomeFunc.setEnabled(true);
        jComboBoxCidade.setEnabled(true);
        jComboBoxFuncao.setEnabled(true);
        //jComboBoxTipoTelefone.setEnabled(true);
        //jComboBoxTipoTelefone2.setEnabled(true);
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
            //func.setTipotel((String)jComboBoxTipoTelefone.getSelectedItem());
            //func.setTipotel((String)jComboBoxTipoTelefone2.getSelectedItem());
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
       // jComboBoxTipoTelefone.setSelectedItem(0);
       // jComboBoxTipoTelefone2.setSelectedItem(0);
        jButtonAlterar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonFechar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jButtonLimpar.setEnabled(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCidadesActionPerformed

        TelaCadCidades tcc = new TelaCadCidades();//ABIR A TELA DE CADASTRO DE CIDADES
        tcc.setVisible(true); 
        
    }//GEN-LAST:event_jButtonCidadesActionPerformed

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
            //func.setTipotel((String)jComboBoxTipoTelefone.getSelectedItem());
            //func.setTipotel((String)jComboBoxTipoTelefone2.getSelectedItem());
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
                    JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso!");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao remover funcionario:" + e.getMessage());
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

    private void jButtonAddFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFuncaoActionPerformed
        TelaFuncaoFuncionario tff = new TelaFuncaoFuncionario();
        tff.setVisible(true);
        preencherComboboxFuncao();
    }//GEN-LAST:event_jButtonAddFuncaoActionPerformed

/**//**/
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       preencherCombobox();
       preencherComboboxFuncao();
      // preencherComboboxTipoTel1();
      // preencherComboboxTipoTel2();
    }//GEN-LAST:event_formWindowActivated

    private void jTextFieldTipoTelefone1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTipoTelefone1KeyReleased
         if(!(evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode()<= 105 ||evt.getKeyCode() == evt.VK_ENTER))
            return;
        
        if(jTextFieldTipoTelefone1.getText().isEmpty())
            return;
        if(veDados.length == 0)
            return;
        addTextAndSelectToTextFieldToRest(jTextFieldTipoTelefone1, getTextoApartirVetor(jTextFieldTipoTelefone1.getText(), veDados));
    }//GEN-LAST:event_jTextFieldTipoTelefone1KeyReleased

    private void jTextFieldTipoTelefone2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTipoTelefone2KeyReleased
        if(!(evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode()<= 105 ||evt.getKeyCode() == evt.VK_ENTER))
            return;
        
        if(jTextFieldTipoTelefone2.getText().isEmpty())
            return;
        if(veDados.length == 0)
            return;
        addTextAndSelectToTextFieldToRest(jTextFieldTipoTelefone2, getTextoApartirVetor(jTextFieldTipoTelefone2.getText(), veDados));
    }//GEN-LAST:event_jTextFieldTipoTelefone2KeyReleased

    
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
   /* private void preencherComboboxTipoTel1(){
        jComboBoxTipoTelefone.removeAll();
        dcbmtt = new DefaultComboBoxModel(dtt.listarTodos().toArray());
        jComboBoxTipoTelefone.setModel(dcbmtt);
        
    }
    */
   /* private void preencherComboboxTipoTel2(){
        jComboBoxTipoTelefone.removeAll();
        dcbmtt = new DefaultComboBoxModel(dtt.listarTodos().toArray());
        jComboBoxTipoTelefone2.setModel(dcbmtt);
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
    private javax.swing.JButton jButtonAddFuncao;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCidades;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5TipoTelefone1;
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
    private javax.swing.JLabel jLabelTipoTelefone2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCodCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNomeCidade;
    private javax.swing.JTextField jTextFieldNomeFunc;
    private javax.swing.JTextField jTextFieldRG;
    private javax.swing.JTextField jTextFieldTelefone1;
    private javax.swing.JTextField jTextFieldTelefone2;
    private javax.swing.JTextField jTextFieldTipoTelefone1;
    private javax.swing.JTextField jTextFieldTipoTelefone2;
    // End of variables declaration//GEN-END:variables
}
