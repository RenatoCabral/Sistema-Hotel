package DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TiposDeQuartos;


public class DAOTiposDeQuartos {
    
    //TiposDeQuartos tiposquarto = new TiposDeQuartos();
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    
    
     public void insert(TiposDeQuartos tiposquarto){
        String comando  = "Insert Into tiposquarto (id_tiposquarto, descricao, valor) values (?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, tiposquarto.getId_TiposQuartos());
            enviaComando.setString(2, tiposquarto.getDescrição());
            enviaComando.setDouble(3, tiposquarto.getValor());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado");   
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + ex.getMessage());
        }
    }
     
     public void atualizar(TiposDeQuartos tiposquarto){
        String query = "update tiposquarto set descricao= ?, valor= ? where id_tiposquarto= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(3, tiposquarto.getId_TiposQuartos());
            enviaComando.setString(1, tiposquarto.getDescrição());
            enviaComando.setDouble(2, tiposquarto.getValor());
            enviaComando.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar Tipos de Quartos:" + ex.getMessage());
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
        String query = "Delete from tiposquarto";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Tipos de Quartos:" + ex.getMessage());
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
        String comando = "select max(id_tiposquarto) as codigo from tiposquarto";
        
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
      
       public List<TiposDeQuartos> localizarTipo(String TiposDeQuartos){
        conexao = cSQL.getConnection();
        List<TiposDeQuartos> tipos = new ArrayList<>();
        String comando = "select *from tiposquarto where descricao= ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, TiposDeQuartos);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                TiposDeQuartos tiposquartos = new TiposDeQuartos();
                tiposquartos.setId_TiposQuartos(resultado.getInt("id_tiposquarto"));
                tiposquartos.setDescrição(resultado.getString("descricao"));
                tiposquartos.setValor(resultado.getDouble("valor"));
                tipos.add(tiposquartos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Tipos de Quartos" + ex.getMessage());
        }finally{
            try {    
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
    }
       
       public List<TiposDeQuartos> listarTodos(){
        conexao = cSQL.getConnection();
        List<TiposDeQuartos> tipos = new ArrayList<>();
        String comando = "select *from tiposquarto";  
        try {
            enviaComando = conexao.prepareStatement(comando);
            resultado = enviaComando.executeQuery() ;       
            while(resultado.next()){ 
                TiposDeQuartos tiposquartos = new TiposDeQuartos();
                tiposquartos.setId_TiposQuartos(resultado.getInt("id_tiposquarto"));
                tiposquartos.setDescrição(resultado.getString("descricao"));
                tiposquartos.setValor(resultado.getDouble("valor"));
                tipos.add(tiposquartos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Tipos de Quartos" + ex.getMessage());
        }finally{
            try {
               
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return tipos;
    }
       
       public void removerSelecionado(TiposDeQuartos tiposquarto){
        String query = "Delete from tiposquarto where id_tiposquarto= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, tiposquarto.getId_TiposQuartos());
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Tipos de Quartos:" + ex.getMessage());
        }finally{
            try {
                enviaComando.close();
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
    }
       
       public TiposDeQuartos localizarTiposDeQuartos(int id) {
        conexao = cSQL.getConnection();
        TiposDeQuartos tdq= null;
        String comando = "Select * from tiposquarto where id_tiposquarto= ? order by descricao";
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, id);
            resultado = enviaComando.executeQuery();

            while (resultado.next()) {
                tdq = new TiposDeQuartos();
                tdq.setId_TiposQuartos(resultado.getInt("id_tiposquarto"));
                tdq.setDescrição(resultado.getString("descricao"));
                tdq.setValor(resultado.getDouble("valor"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar tipos de quarto:" + e.getMessage());
        } finally {
            try {
                enviaComando.close();
                resultado.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:" + e.getMessage());
            }
        }
        return tdq;
    }
       
       public List<TiposDeQuartos> getListaTiposDeQuartos(){
        conexao = cSQL.getConnection();
        List<TiposDeQuartos> ListTiposDeQuartos = new ArrayList<>();
        String comando = "select *from tiposquarto";  
        try {
            enviaComando = conexao.prepareStatement(comando);
            resultado = enviaComando.executeQuery() ;       
            while(resultado.next()){ 
                TiposDeQuartos tiposquartos = new TiposDeQuartos();
                tiposquartos.setId_TiposQuartos(resultado.getInt("id_tiposquarto"));
                tiposquartos.setDescrição(resultado.getString("descricao"));
                tiposquartos.setValor(resultado.getDouble("valor"));
                ListTiposDeQuartos.add(tiposquartos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar prencher uma lista de Tipos de Quartos" + ex.getMessage());
        }finally{
            try {
               
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return ListTiposDeQuartos;
    }
}
