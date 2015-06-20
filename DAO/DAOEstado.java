package DAO;

import modelo.Estado;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOEstado {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    private Estado est = new Estado();
    
    
    
    public void insert(Estado est){
        String comando  = "Insert Into estado (id_estado, sigla, nome_estado) values (?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, est.getId_estado());
            enviaComando.setString(2, est.getSigla());
            enviaComando.setString(3, est.getNome_estado());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado");   
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + ex.getMessage());
        }
    }
    
    public void atualizar(Estado est ){
        String query = "update estado set sigla = ?, nome_estado= ? where id_estado= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(4, est.getId_estado());
            enviaComando.setString(1, est.getSigla());
            enviaComando.setString(2, est.getNome_estado());
            enviaComando.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar estado:" + ex.getMessage());
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
        String query = "Delete from estado";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir estado:" + ex.getMessage());
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
        String comando = "select max(id_estado) as codigo from estado";
        
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
    
    public List<Estado> localizarTipo(String Estados){
        conexao = cSQL.getConnection();
        List<Estado> tipos = new ArrayList<>();
        String comando = "select *from estado where nome_estado = ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, Estados);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                Estado est = new Estado();
                est.setId_estado(resultado.getInt("id_estado"));
                est.setSigla(resultado.getString("sigla"));
                est.setNome_estado(resultado.getString("nome_estados"));
                tipos.add(est);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar estado" + ex.getMessage());
        }finally{
            try {    
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
    }
    
     public List<Estado> listarTodos(){
        conexao = cSQL.getConnection();
        List<Estado> tipos = new ArrayList<>();
        String comando = "select *from estado";  
        try {
            enviaComando = conexao.prepareStatement(comando);
            resultado = enviaComando.executeQuery() ;       
            while(resultado.next()){ 
                Estado est = new Estado();
                est.setId_estado(resultado.getInt("id_estado"));
                est.setSigla(resultado.getString("sigla"));
                est.setNome_estado(resultado.getString("nome_estado"));
                tipos.add(est);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar estado" + ex.getMessage());
        }finally{
            try {
               
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return tipos;
    }
    
    public void removerSelecionado(Estado est){
        String query = "Delete from estado where id_estado= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, est.getId_estado());
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir estado:" + ex.getMessage());
        }finally{
            try {
                enviaComando.close();
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
    }
    
    public List<Estado> localizarEstado(String nome_estado) {
        conexao = cSQL.getConnection();
        List<Estado> estados = new ArrayList<>();
        String comando = "Select *from estado where nome_estado = ? order by nome_estado";
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, nome_estado);
            resultado = enviaComando.executeQuery();

            while (resultado.next()) {
                Estado est = new Estado();
                est.setId_estado(resultado.getInt("id_estado"));
                est.setNome_estado(resultado.getString("nome_estado"));
                est.setSigla(resultado.getString("sigla"));
                estados.add(est);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar estado:" + e.getMessage());
        } finally {
            try {
                enviaComando.close();
                resultado.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexÃ£o com o banco de dados:" + e.getMessage());
            }
        }
        return estados;
    }

    
    
}

  
