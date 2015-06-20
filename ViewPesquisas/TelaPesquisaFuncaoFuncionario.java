package ViewPesquisas;

import DAO.DAOFuncaoFuncionario;
import TableModel.TableModelFuncaoFuncionario;
import View.TelaFuncaoFuncionario;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.FuncaoFuncionario;

public class TelaPesquisaFuncaoFuncionario extends javax.swing.JFrame {
    
    TelaFuncaoFuncionario tff;

    public TelaPesquisaFuncaoFuncionario(TelaFuncaoFuncionario title)throws HeadlessException {
        tff = title;
        initComponents();
        jTableTabelaFF.setAutoCreateRowSorter(true); // ordenação das colunas
         
         try {
            preencheTabela();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
     List<FuncaoFuncionario> ffunc = new ArrayList();
    
    int linha;
    int valida;
    
    public int getValida() {
        return valida;
    }
    
    public void setValida(int valida) {
        this.valida = valida;
    }
    
    public int getLinha() {
        return linha;
    }
    
    public void setLinha(int linha) {
        this.linha = linha;
    }
    
    public TelaPesquisaFuncaoFuncionario() {
        initComponents();
             jTableTabelaFF.setAutoCreateRowSorter(true); // ordenação das colunas
        
        try {
            preencheTabela();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaFF = new javax.swing.JTable();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        jTableTabelaFF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTabelaFF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableTabelaFFKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabelaFF);

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFechar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(527, 287));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTabelaFFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableTabelaFFKeyPressed
       if(getValida()==1){
            if(evt.getKeyCode() == evt.VK_ENTER){
                //pega a linha selecionada
                setLinha(jTableTabelaFF.getSelectedRow());
                //recupera um objeto da lista em um alinha especifica que foi definido
                FuncaoFuncionario funcfunc = ffunc.get(getLinha());
                
                enviaDados(funcfunc,1);
            }
        }
    }//GEN-LAST:event_jTableTabelaFFKeyPressed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    /*private void jTableTabelaKeyPressed(java.awt.event.KeyEvent evt) {                                        
        if(getValida()==1){
            if(evt.getKeyCode() == evt.VK_ENTER){
                //pega a linha selecionada
                setLinha(jTableTabelaFF.getSelectedRow());
                //recupera um objeto da lista em um alinha especifica que foi definido
                FuncaoFuncionario funcfunc = ffunc.get(getLinha());
                
                enviaDados(funcfunc,1);
            }
        }
    }  */       
     
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
            java.util.logging.Logger.getLogger(TelaPesquisaFuncaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaFuncaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaFuncaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaFuncaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaFuncaoFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaFF;
    // End of variables declaration//GEN-END:variables

    public void preencheTabela() throws SQLException{       
        DAOFuncaoFuncionario daofuncfunc = new DAOFuncaoFuncionario();
        ffunc = daofuncfunc.getFuncaoFuncionario();
        TableModelFuncaoFuncionario tmff= new TableModelFuncaoFuncionario(ffunc);
        jTableTabelaFF.setModel(tmff);
     }
    
     private void enviaDados(FuncaoFuncionario ff, int i) {
         if(i == 1){
         
             //TelaCadCidades.getInstancia().setVisible(true);
             //TelaCadCidades.getInstancia().recebeDados(cid);
             
             tff.recebeDados(ff);
             dispose();
         }
     }







}
