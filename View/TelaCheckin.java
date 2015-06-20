package View;

import DAO.DAOCheckin;
import DAO.DAOFuncionario;
import DAO.DAOHospedes;
import DAO.DAOQuartos;
import MascarasCampos.LimitandoCamposNumeros;
import TableModel.TableModelCheckin;
import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Checkin;
import modelo.Funcionarios;
import modelo.Hospedes;
import modelo.Quartos;

public class TelaCheckin extends javax.swing.JFrame {
    
    //private TelaCheckin instancia;
    
    Checkin checkin = new Checkin();
    Quartos quartos = new Quartos();
    Hospedes hospedes = new Hospedes();
    Funcionarios funcionarios = new Funcionarios();
    
    private DAOCheckin dCheckin = new DAOCheckin();
    private DAOQuartos dQuartos = new DAOQuartos();
    private DAOHospedes dHospedes = new DAOHospedes();
    private DAOFuncionario dFuncionario = new DAOFuncionario();
    private DefaultComboBoxModel dcbmCheckin = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmQuarto = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmHospedes = new DefaultComboBoxModel();
    private DefaultComboBoxModel dcbmFuncionario = new DefaultComboBoxModel();
    private TableModel.TableModelCheckin tmCheckin = new TableModelCheckin();

    public TelaCheckin() {
        initComponents();
        
        try {
            preencheTabela();
        } catch (Exception e) {
        }
        
        //MASCARA CAMPOS
        jTextFieldCodigo.setDocument(new LimitandoCamposNumeros(10));
        jTextFieldQtdeHospedes.setDocument(new LimitandoCamposNumeros(10));
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabelHospede = new javax.swing.JLabel();
        jButtonAddHospede = new javax.swing.JButton();
        jLabelQtdeHospedes = new javax.swing.JLabel();
        jTextFieldQtdeHospedes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelQuarto = new javax.swing.JLabel();
        jComboBoxQuarto = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxAtendente = new javax.swing.JComboBox();
        jButtonAddQuarto = new javax.swing.JButton();
        jButtonAddAtendente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButtonSalvar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jTextFieldHoraChegada = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter hora = new javax.swing.text.MaskFormatter("##:##");

            jTextFieldHoraChegada = new javax.swing.JFormattedTextField(hora);
        }catch(Exception e){
        }
        jTextFieldHoraSaida = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter hora = new javax.swing.text.MaskFormatter("##:##");

            jTextFieldHoraSaida = new javax.swing.JFormattedTextField(hora);
        }catch(Exception e){
        }

        jButtonNovo = new javax.swing.JButton();
        jFormattedTextFieldDataChegada = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");

            jFormattedTextFieldDataChegada = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }
        jFormattedTextFieldDataSaida = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");

            jFormattedTextFieldDataSaida = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }
        jComboBoxHospede = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Checkin"));

        jLabelCodigo.setText("Código");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setEnabled(false);

        jLabel1.setText("Informações Pessoais");

        jLabelHospede.setText("Hóspede");

        jButtonAddHospede.setText("+");
        jButtonAddHospede.setEnabled(false);
        jButtonAddHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddHospedeActionPerformed(evt);
            }
        });

        jLabelQtdeHospedes.setText("Quantidade Hóspedes");

        jTextFieldQtdeHospedes.setEnabled(false);

        jLabel2.setText("Hóspedagem");

        jLabelQuarto.setText("Quarto");

        jComboBoxQuarto.setEnabled(false);
        jComboBoxQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxQuartoActionPerformed(evt);
            }
        });

        jLabel3.setText("Atendente");

        jComboBoxAtendente.setEnabled(false);
        jComboBoxAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAtendenteActionPerformed(evt);
            }
        });

        jButtonAddQuarto.setText("+");
        jButtonAddQuarto.setEnabled(false);
        jButtonAddQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddQuartoActionPerformed(evt);
            }
        });

        jButtonAddAtendente.setText("+");
        jButtonAddAtendente.setEnabled(false);
        jButtonAddAtendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAtendenteActionPerformed(evt);
            }
        });

        jLabel4.setText("Check-In");

        jLabel5.setText("Check-Out");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        jTextFieldHoraChegada.setEnabled(false);

        jTextFieldHoraSaida.setEnabled(false);

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jComboBoxHospede.setEnabled(false);
        jComboBoxHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHospedeActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTableTabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelCodigo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabelQuarto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonAddQuarto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jFormattedTextFieldDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldHoraChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel5)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jFormattedTextFieldDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jTextFieldHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jComboBoxAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addComponent(jButtonAddAtendente)))
                                .addGap(0, 189, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelHospede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxHospede, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAddHospede)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelQtdeHospedes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldQtdeHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFechar)
                        .addGap(31, 31, 31))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonFechar, jButtonNovo, jButtonSalvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHospede)
                    .addComponent(jComboBoxHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddHospede)
                    .addComponent(jLabelQtdeHospedes)
                    .addComponent(jTextFieldQtdeHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelQuarto)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAddQuarto)
                        .addComponent(jLabel3)
                        .addComponent(jComboBoxAtendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAddAtendente)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextFieldDataChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHoraChegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHoraSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonNovo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonFechar, jButtonNovo, jButtonSalvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(898, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
      this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonAddQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddQuartoActionPerformed
        TelaQuartos tq = new TelaQuartos();
        tq.setVisible(true);
    }//GEN-LAST:event_jButtonAddQuartoActionPerformed

    private void jButtonAddAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAtendenteActionPerformed
       TelaFuncionario tf = new TelaFuncionario();
       tf.setVisible(true);
    }//GEN-LAST:event_jButtonAddAtendenteActionPerformed

    private void jButtonAddHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddHospedeActionPerformed
        TelaHospede th = new TelaHospede();
        th.setVisible(true);
    }//GEN-LAST:event_jButtonAddHospedeActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       jTextFieldCodigo.setText(String.valueOf(dCheckin.geraCodigo()));
       jTextFieldHoraChegada.setText("");
       jTextFieldHoraSaida.setText("");
       jFormattedTextFieldDataChegada.setText("");
       jFormattedTextFieldDataSaida.setText("");
       jTextFieldQtdeHospedes.setText("");
       jComboBoxHospede.setSelectedIndex(-1);
       jComboBoxAtendente.setSelectedIndex(-1);
       jComboBoxQuarto.setSelectedIndex(-1);
       //------------------------------------
       jTextFieldCodigo.setEnabled(true);
       jTextFieldQtdeHospedes.setEnabled(true);
       jFormattedTextFieldDataChegada.setEnabled(true);
       jFormattedTextFieldDataSaida.setEnabled(true);
       jTextFieldHoraChegada.setEnabled(true);
       jTextFieldHoraSaida.setEnabled(true);
       jComboBoxAtendente.setEnabled(true);
       jComboBoxQuarto.setEnabled(true);
       jComboBoxHospede.setEnabled(true);
       jButtonAddAtendente.setEnabled(true);
       jButtonAddHospede.setEnabled(true);
       jButtonAddQuarto.setEnabled(true);
       jButtonFechar.setEnabled(true);
       jButtonNovo.setEnabled(false);
       jButtonSalvar.setEnabled(true);
       
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
      /*if(quartos.getStatus()){
           JOptionPane.showMessageDialog(null, "Este quarto esta ocupado!Por Favor selecione outro!", "Aviso", JOptionPane.WARNING_MESSAGE);
           return; 
       
      }*/
        try {
            checkin = new Checkin();
            checkin.setId_Checkin(Integer.parseInt(jTextFieldCodigo.getText()));
            checkin.setData_chegada(jFormattedTextFieldDataChegada.getText());
            checkin.setData_saida(jFormattedTextFieldDataSaida.getText());
            checkin.setFuncionarios((Funcionarios)jComboBoxAtendente.getSelectedItem());
            checkin.setHora_chegada(jTextFieldHoraChegada.getText());
            checkin.setHora_saida(jTextFieldHoraSaida.getText());
            checkin.setQuartos((Quartos)jComboBoxQuarto.getSelectedItem());
            checkin.setHospedes((Hospedes)jComboBoxHospede.getSelectedItem());
            checkin.setQuantidade_hospede(Integer.parseInt(jTextFieldQtdeHospedes.getText()));
            dCheckin.inserir(checkin);
            jComboBoxQuarto.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar o cadastro!"+ "ERRO:" + e.getMessage());
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       preencherComboboxFuncionario();
       preencherComboboxQuarto();
       preencherComboboxHospede();
    }//GEN-LAST:event_formWindowActivated

    private void jComboBoxQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxQuartoActionPerformed
       quartos = (Quartos)jComboBoxQuarto.getSelectedItem();
    }//GEN-LAST:event_jComboBoxQuartoActionPerformed

    private void jComboBoxAtendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAtendenteActionPerformed
       funcionarios = (Funcionarios)jComboBoxAtendente.getSelectedItem();
    }//GEN-LAST:event_jComboBoxAtendenteActionPerformed

    private void jComboBoxHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHospedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHospedeActionPerformed

    /**/
    private void preencherComboboxQuarto(){
        jComboBoxQuarto.removeAll();
        dcbmQuarto = new DefaultComboBoxModel(dQuartos.listarTodos().toArray());
        jComboBoxQuarto.setModel(dcbmQuarto);
    }
    
    private void preencherComboboxFuncionario(){
        jComboBoxAtendente.removeAll();
        dcbmFuncionario = new DefaultComboBoxModel(dFuncionario.listarTodos().toArray());
        jComboBoxAtendente.setModel(dcbmFuncionario);
    }
    
    private void preencherComboboxHospede(){
        jComboBoxHospede.removeAll();
        dcbmHospedes = new DefaultComboBoxModel(dHospedes.listarTodos().toArray());
        jComboBoxHospede.setModel(dcbmHospedes);
    }
    
    private void preencheTabela() throws SQLException{
        List<Checkin> tipos = dCheckin.listarTodos();
        tmCheckin = new TableModelCheckin(tipos);
        jTableTabela.setModel(tmCheckin);
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
            java.util.logging.Logger.getLogger(TelaCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCheckin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAtendente;
    private javax.swing.JButton jButtonAddHospede;
    private javax.swing.JButton jButtonAddQuarto;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxAtendente;
    private javax.swing.JComboBox jComboBoxHospede;
    private javax.swing.JComboBox jComboBoxQuarto;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataChegada;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataSaida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelHospede;
    private javax.swing.JLabel jLabelQtdeHospedes;
    private javax.swing.JLabel jLabelQuarto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldHoraChegada;
    private javax.swing.JTextField jTextFieldHoraSaida;
    private javax.swing.JTextField jTextFieldQtdeHospedes;
    // End of variables declaration//GEN-END:variables

    
  /*  public void recebeDados(Checkin check){
        jTextFieldCodigo.setText(String.valueOf(check.getId_Checkin()));
        jComboBoxHospede.setSelectedIndex(Integer.parseInt(String.valueOf(check.getHospedes())));
        jTextFieldQtdeHospedes.setText(String.valueOf(check.getQuantidade_hospede()));
        jComboBoxQuarto.setSelectedIndex(Integer.parseInt(String.valueOf(check.getQuartos())));
        jComboBoxAtendente.setSelectedIndex(Integer.parseInt(String.valueOf(check.getFuncionarios())));
        jFormattedTextFieldDataChegada.setText(String.valueOf(check.getData_chegada()));
        jTextFieldHoraChegada.setText(String.valueOf(check.getHora_chegada()));
        jFormattedTextFieldDataSaida.setText(String.valueOf(check.getData_saida()));
        jTextFieldHoraSaida.setText(String.valueOf(check.getHora_saida()));
    }*/
}
