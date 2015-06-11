package DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cidades;
import modelo.Fornecedor;
import modelo.TipoTelefone;

public class DAOFornecedor {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    private DAOTipoTelefone dTipoTelefone = new DAOTipoTelefone();
    private DAOCidades dCidades = new DAOCidades();
    private Fornecedor fornecedor = new Fornecedor();
    private Cidades cidades = new Cidades();
    private TipoTelefone tipotelefone = new TipoTelefone();
    
    public void inserir(Fornecedor fornec){
        String comando  = "Insert Into fornecedor (id_fornecedor, razao_social, nome_fantasia, cnpj, insc_estadual, endereco, telefone, id_cidades, id_tipotelefone) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, fornec.getId_fornecedor());
            enviaComando.setString(2, fornec.getRazaoSocial());
            enviaComando.setString(3, fornec.getNomeFantasia());
            enviaComando.setString(4, fornec.getCnpj());
            enviaComando.setString(5, fornec.getInsc_estadual());
            enviaComando.setString(6, fornec.getEndereco());
            enviaComando.setString(7, fornec.getTelefone());
            enviaComando.setInt(8, fornec.getCidades().getId_cidades());
            enviaComando.setInt(9, fornec.getTipotelefone().getId_tipotelefone());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!");   
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + "ERRO:"+ ex.getMessage());
        }
        
    }
    
     public void atualizar(Fornecedor fornec){
        String query = "update fornecedor set razao_social= ?, nome_fantasia= ?, cnpj= ?, insc_estadual= ?, endereco= ?, telefone= ?, id_cidades= ?, id_tipotelefone= ? where id_fornecedor= ?";
        conexao = cSQL.getConnection();
        
         try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(9, fornec.getId_fornecedor());
            enviaComando.setString(1, fornec.getRazaoSocial());
            enviaComando.setString(2, fornec.getNomeFantasia());
            enviaComando.setString(3, fornec.getCnpj());
            enviaComando.setString(4, fornec.getInsc_estadual());
            enviaComando.setString(5, fornec.getEndereco());
            enviaComando.setString(6, fornec.getTelefone());
            enviaComando.setInt(7, fornec.getCidades().getId_cidades());
            enviaComando.setInt(8, fornec.getTipotelefone().getId_tipotelefone());
            enviaComando.executeUpdate();
         } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar fornecedor:" + e.getMessage());
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
        String query = "Delete from fornecedor";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fornecedor:" + ex.getMessage());
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
        String comando = "select max(id_fornecedor) as codigo from fornecedor";
        
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
     
     public List<Fornecedor> localizarTipo(String Fornecedor){
        conexao = cSQL.getConnection();
        List<Fornecedor> tipos = new ArrayList<>();
        String comando = "select *from fornecedor where razao_social= ?";
        
          try {
                enviaComando = conexao.prepareStatement(comando);
                resultado = enviaComando.executeQuery() ;
                
               while(resultado.next()){ 
                Fornecedor forn = new Fornecedor();
                forn.setId_fornecedor(resultado.getInt("id_fornecedor"));
                forn.setCnpj(resultado.getString("cnpj"));
                forn.setEndereco(resultado.getString("endereco"));
                forn.setInsc_estadual(resultado.getString("insc_estadual"));
                forn.setRazaoSocial(resultado.getString("razao_social"));
                forn.setNomeFantasia(resultado.getString("nome_fantasia"));
                forn.setTelefone(resultado.getString("telefone"));
                forn.setCidades(dCidades.localizarCidades(resultado.getInt("id_cidades")));
                forn.setTipotelefone(dTipoTelefone.localizarTipoTelefone(resultado.getInt("id_tipotelefone")));
                tipos.add(forn);
               }
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, "Erro ao buscar hospedes" + e.getMessage());
          }finally{
            try {
                
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
      }
     
     public List<Fornecedor> listarTodos(){
        conexao = cSQL.getConnection();
        List<Fornecedor> tipos = new ArrayList<>();
        String comando = "select *from fornecedor";
        
          try {
               enviaComando = conexao.prepareStatement(comando);
                resultado = enviaComando.executeQuery() ;
            
               while(resultado.next()){ 
                   Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId_fornecedor(resultado.getInt("id_fornecedor"));
                fornecedor.setCnpj(resultado.getString("cnpj"));
                fornecedor.setEndereco(resultado.getString("endereco"));
                fornecedor.setInsc_estadual(resultado.getString("insc_estadual"));
                fornecedor.setRazaoSocial(resultado.getString("razao_social"));
                fornecedor.setNomeFantasia(resultado.getString("nome_fantasia"));
                fornecedor.setTelefone(resultado.getString("telefone"));
                fornecedor.setCidades(dCidades.localizarCidades(resultado.getInt("id_cidades")));
                fornecedor.setTipotelefone(dTipoTelefone.localizarTipoTelefone(resultado.getInt("id_tipotelefone")));
                tipos.add(fornecedor);
               }
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, "Erro ao buscar forncedor" + e.getMessage());
          }finally{
            try {
                
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
      }
     
      public void removerSelecionado(Fornecedor forn){
        String query = "Delete from fornecedor where id_fornecedor= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, forn.getId_fornecedor());
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fornecedor:" + ex.getMessage());
        }finally{
            try {
                enviaComando.close();
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
    }
     
    
}
