package ViewPesquisas;

import DAO.DAOFornecedor;
import TableModel.TableModelFornecedor;
import View.TelaFornecedor;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Fornecedor;


public class TelaPesquisaFornecedor extends javax.swing.JFrame {
    
    TelaFornecedor tf;
    
     public TelaPesquisaFornecedor(TelaFornecedor title) throws HeadlessException {
        tf = title;
        initComponents();
             jTableTabelaForn.setAutoCreateRowSorter(true); // ordenação das colunas
        
        try {
            preencheTabela();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
     
     List<Fornecedor> f = new ArrayList();
    
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

    
    public TelaPesquisaFornecedor() {
        initComponents();
        jTableTabelaForn.setAutoCreateRowSorter(true); // ordenação das colunas
        
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
        jButtonFechar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaForn = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        jButtonFechar.setText("Fechar");

        jTableTabelaForn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTabelaForn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableTabelaFornKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabelaForn);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFechar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(834, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTabelaFornKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableTabelaFornKeyPressed
       if(getValida()==1){
            if(evt.getKeyCode() == evt.VK_ENTER){
                //pega a linha selecionada
                setLinha(jTableTabelaForn.getSelectedRow());
                //recupera um objeto da lista em um alinha especifica que foi definido
                Fornecedor fornecedor = f.get(getLinha());
                //envia o objeto para ser enviado;

                enviaDados(fornecedor,1);
            }
        }
    }//GEN-LAST:event_jTableTabelaFornKeyPressed

   
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
            java.util.logging.Logger.getLogger(TelaPesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaForn;
    // End of variables declaration//GEN-END:variables

     public void preencheTabela() throws SQLException{
        
        DAOFornecedor dfornec = new DAOFornecedor();
        f = dfornec.getFornecedor();
        TableModelFornecedor tmfornec= new TableModelFornecedor(f);
        jTableTabelaForn.setModel(tmfornec);
       /* List<Cidades> tipos = dCidades.listarTodos();
        tmc = new TableModelCidades(tipos);
        jTableTabela.setModel(tmc);*/
    }
    
     private void enviaDados(Fornecedor forn, int i) {
         if(i == 1){
         
             //TelaCadCidades.getInstancia().setVisible(true);
             //TelaCadCidades.getInstancia().recebeDados(cid);
             
            tf.recebeDados(forn);
            dispose();
         }
     
     }









}
