package DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Fornecedor;
import modelo.Produtos;

public class DAOProdutos {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    private DAOFornecedor daoFornecedor = new DAOFornecedor();
    private Fornecedor fornecedor = new Fornecedor();
    private Produtos produtos = new Produtos();
    
      public void inserir(Produtos produtos){
        String comando  = "Insert Into produtos (id_produto, nome_produto, codigo_produto, quantidade, valor_compra, valor_venda, id_fornecedor) values (?, ?, ?, ?, ?, ?, ?)";
        conexao  = cSQL.getConnection();
        
          try { 
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, produtos.getId_produto());
            enviaComando.setString(2, produtos.getNome_produto());
            enviaComando.setInt(3, produtos.getCod_produto());
            enviaComando.setInt(4, produtos.getQuantidade());
            enviaComando.setDouble(5, produtos.getValor_compra());
            enviaComando.setDouble(6, produtos.getValor_venda());
            enviaComando.setInt(7, produtos.getFornecedor().getId_fornecedor());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!");   
            enviaComando.close();    
          } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Registro não efetuado" + "ERRO:"+ ex.getMessage());
          } 
      }
      
        public void atualizar(Produtos produtos){
            String query = "update produtos set nome_produto= ?, codigo_produto= ?, quantidade= ?, valor_compra= ?, valor_venda= ?, id_fornecedor where id_produto= ?";
            conexao = cSQL.getConnection();
            
            try {
                 enviaComando = conexao.prepareStatement(query);
                 enviaComando.setInt(7, produtos.getId_produto());
                 enviaComando.setString(1, produtos.getNome_produto());
                 enviaComando.setInt(2, produtos.getCod_produto());
                 enviaComando.setInt(3, produtos.getQuantidade());
                 enviaComando.setDouble(4, produtos.getValor_compra());
                 enviaComando.setDouble(5, produtos.getValor_venda());
                 enviaComando.setInt(6, produtos.getFornecedor().getId_fornecedor());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar produto:" + e.getMessage());
            }finally{  
                try{
                    enviaComando.close();
                    conexao.close();
                }catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados \n ERRO:" + ex.getMessage());
                }
            }
        }
        
        public void removerTudo(){ 
            String query = "Delete from produtos";
            conexao = cSQL.getConnection();
        
            try {
                enviaComando = conexao.prepareStatement(query);
                enviaComando.executeUpdate();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir produtos:" + ex.getMessage());
            }finally{
                try {
                    enviaComando.close();
                    conexao.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao fehcar conexão:\n ERRO:" + ex.getMessage());
                }
            }   
        }
        
        public int geraCodigo(){
            conexao = cSQL.getConnection();
            int codigo = 0;
            String comando = "select max(id_produto) as codigo from produtos";
        
            try {
                enviaComando = conexao.prepareStatement(comando);
                resultado = enviaComando.executeQuery();
            while(resultado.next()){
                codigo = resultado.getInt("codigo");
            }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar código:" + ex.getMessage());
            }finally{
                try {
                    enviaComando.close();
                    resultado.close();
                } catch (Throwable ex) {
                     JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());    
                }
            }
            return codigo + 1;
        }
        
        public List<Produtos> localizarTipo(String Produtos){
            conexao = cSQL.getConnection();
            List<Fornecedor> tipos = new ArrayList<>();
            String comando = "select *from fornecedor where razao_social= ?";
}
