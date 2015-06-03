package DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TipoTelefone;

public class DAOTipoTelefone {
    
     private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    
     public void insert(TipoTelefone tt){
        String comando  = "Insert Into tipotelefone (id_tipo_telefone, nome_tipo_telefone) values (?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, tt.getId_tipo_telefone());
            enviaComando.setString(2, tt.getNome_tipo_telefone());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado");   
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + ex.getMessage());
        }
    }
     
     public void atualizar(TipoTelefone tt){
        String query = "update tipotelefone set nome_tipo_telefone = ? where id_tipo_telefone= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(2, tt.getId_tipo_telefone());
            enviaComando.setString(1, tt.getNome_tipo_telefone());
            enviaComando.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar tipotelefone:" + ex.getMessage());
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
        String query = "Delete from tipotelefone";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir tipotelefone:" + ex.getMessage());
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
        String comando = "select max(id_tipo_telefone) as codigo from tipotelefone";
        
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
      
       public List<TipoTelefone> localizarTipo(String TipoTelefone){
        conexao = cSQL.getConnection();
        List<TipoTelefone> tipos = new ArrayList<>();
        String comando = "select *from tipotelefone where nome_tipo_telefone = ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, TipoTelefone);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                TipoTelefone tt = new TipoTelefone();
                tt.setId_tipo_telefone(resultado.getInt("id_tipo_telefone"));
                tt.setNome_tipo_telefone(resultado.getString("nome_tipo_telefone"));
                tipos.add(tt);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar tipotelefone" + ex.getMessage());
        }finally{
            try {    
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
    }
       
       public List<TipoTelefone> listarTodos(){
        conexao = cSQL.getConnection();
        List<TipoTelefone> tipos = new ArrayList<>();
        String comando = "select *from tipotelefone";  
        try {
            enviaComando = conexao.prepareStatement(comando);
            resultado = enviaComando.executeQuery() ;       
            while(resultado.next()){ 
                TipoTelefone tt = new TipoTelefone();
                tt.setId_tipo_telefone(resultado.getInt("id_tipo_telefone"));
                tt.setNome_tipo_telefone(resultado.getString("nome_tipo_telefone"));
                tipos.add(tt);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar tipotelefone" + ex.getMessage());
        }finally{
            try {
               
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return tipos;
    }
       
        public void removerSelecionado(TipoTelefone tt){
        String query = "Delete from estado where id_tipo_telefone= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, tt.getId_tipo_telefone());
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir tipotelefone:" + ex.getMessage());
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