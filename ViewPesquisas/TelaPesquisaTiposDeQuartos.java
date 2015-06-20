package ViewPesquisas;


import DAO.DAOTiposDeQuartos;
import TableModel.TableModelTiposDeQuartos;
import View.TelaQuartos;
import View.TelaTiposDeQuartos;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TiposDeQuartos;

public class TelaPesquisaTiposDeQuartos extends javax.swing.JFrame {
    
    TelaTiposDeQuartos ttdq;
    TelaQuartos tq;

    public TelaPesquisaTiposDeQuartos( TelaTiposDeQuartos title) throws HeadlessException{
        ttdq = title;
      
        initComponents();
         jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas
         
         try {
            preencheTabela();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public TelaPesquisaTiposDeQuartos(TelaQuartos title) throws HeadlessException {
         tq =title;

         initComponents();
         jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas
         
         try {
            preencheTabela();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
     
    }

    List<TiposDeQuartos> tdq = new ArrayList();
    
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
    
    public TelaPesquisaTiposDeQuartos() {
        initComponents();
             jTableTabela.setAutoCreateRowSorter(true); // ordenação das colunas
        
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
        jTableTabela = new javax.swing.JTable();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

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
        jTableTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableTabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTabela);

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFechar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(688, 305));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableTabelaKeyPressed
      if(getValida()==1){
            if(evt.getKeyCode() == evt.VK_ENTER){
                //pega a linha selecionada
                setLinha(jTableTabela.getSelectedRow());
                //recupera um objeto da lista em um alinha especifica que foi definido
                TiposDeQuartos tiposdequartos = tdq.get(getLinha());
                //envia o objeto para ser enviado;

                enviaDados(tiposdequartos,1);
            }
        }
      else{
          if(evt.getKeyCode() == evt.VK_ENTER){
                //pega a linha selecionada
                setLinha(jTableTabela.getSelectedRow());
                //recupera um objeto da lista em um alinha especifica que foi definido
                TiposDeQuartos tiposdequartos = tdq.get(getLinha());
                //envia o objeto para ser enviado;

                enviaDados(tiposdequartos,0);
            }
      }
    }//GEN-LAST:event_jTableTabelaKeyPressed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPesquisaTiposDeQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaTiposDeQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaTiposDeQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisaTiposDeQuartos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisaTiposDeQuartos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabela;
    // End of variables declaration//GEN-END:variables

     private void preencheTabela() throws SQLException{
        
        DAO.DAOTiposDeQuartos dtdq = new DAOTiposDeQuartos();
        tdq = dtdq.getListaTiposDeQuartos();
        TableModelTiposDeQuartos tmtdq = new TableModelTiposDeQuartos(tdq);
        jTableTabela.setModel(tmtdq);
     }
     
     private void enviaDados(TiposDeQuartos tdq, int i) {
         if(i == 1){
          
             ttdq.recebeDados(tdq);/*TELA DE TIPOS DE DE QUARTOS RECEBE O METODO RECEBEDADOS,
                                   COMO PARAMETRO TIPOSDEQUARTOS */
             dispose();
         }
         else{
             tq.recebeDados(tdq);// ERRO ESTA AQUI, COMO FAÇO ESSA DECLARAÇÃO? 
                dispose();
             
         }
         
     }
   
}
