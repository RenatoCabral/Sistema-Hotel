package DAO;

import modelo.Cidades;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOCidades {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    private Cidades cid = new Cidades();
    
    
    
    
    public void insert(Cidades cid){
        String comando  = "Insert Into cidades (id_cidades, nome_cidades, estados) values (?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, cid.getId_cidades());
            enviaComando.setString(2, cid.getNome_cidades());
            enviaComando.setString(3, cid.getEstados());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro salvo com sucesso!");   
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + ex.getMessage());
        }
    }
    
    public void atualizar(Cidades cid){
        String query = "update cidades set nome_cidades= ?, estado= ? where id_cidades= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(3, cid.getId_cidades());
            enviaComando.setString(1, cid.getNome_cidades());
            enviaComando.setString(2, cid.getEstados());
            enviaComando.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar cidades:" + ex.getMessage());
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
        String query = "Delete from cidades";
        conexao = cSQL.getConnection();
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cidades:" + ex.getMessage());
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
        String comando = "select max(id_cidades) as codigo from cidades";
        
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
    
    public List<Cidades> localizarTipo(String Cidades){
        conexao = cSQL.getConnection();
        List<Cidades> tipos = new ArrayList<>();
        String comando = "select *from cidades where nome_cidades= ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, Cidades);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
               Cidades cid = new Cidades();
               cid.setId_cidades(resultado.getInt("id_cidades"));
               cid.setNome_cidades(resultado.getString("nome_cidades"));
               cid.setEstados(resultado.getString("estados"));
                tipos.add(cid);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cidades" + ex.getMessage());
        }finally{
            try {    
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
    }
    
     public List<Cidades> listarTodos(){
        conexao = cSQL.getConnection();
        List<Cidades> tipos = new ArrayList<>();
        String comando = "select *from cidades";  
        try {
            enviaComando = conexao.prepareStatement(comando);
            resultado = enviaComando.executeQuery() ;       
            while(resultado.next()){ 
                Cidades cid = new Cidades();
                cid.setId_cidades(resultado.getInt("id_cidades"));
                cid.setNome_cidades(resultado.getString("nome_cidades"));
                cid.setEstados(resultado.getString("estados"));
                tipos.add(cid);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cidades" + ex.getMessage());
        }finally{
            try {
               
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return tipos;
    }
     
    
    public void removerSelecionado(Cidades cid){
        String query = "Delete from cidades where id_cidades= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, cid.getId_cidades());
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cidades:" + ex.getMessage());
        }finally{
            try {
                enviaComando.close();
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
    }
    
    public Cidades localizarCidades(int  id) {
        conexao = cSQL.getConnection();
        Cidades  cid = null;
        String comando = "Select * from cidades where id_cidades = ? order by nome_cidades";
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, id);
            resultado = enviaComando.executeQuery();

            while (resultado.next()) {
                cid = new Cidades();
                cid.setId_cidades(resultado.getInt("id_cidades"));
                cid.setNome_cidades(resultado.getString("nome_cidades"));
                cid.setEstados(resultado.getString("estados"));
               
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cidades:" + e.getMessage());
        } finally {
            try {
                enviaComando.close();
                resultado.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexÃ£o com o banco de dados:" + e.getMessage());
            }
        }
        return cid;
    }
     
   
}
