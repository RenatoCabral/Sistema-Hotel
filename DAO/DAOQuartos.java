package DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Quartos;
import modelo.TiposDeQuartos;


public class DAOQuartos {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    private DAOTiposDeQuartos dtdq = new DAOTiposDeQuartos();
    private Quartos quartos = new Quartos();
    private TiposDeQuartos tdq = new TiposDeQuartos();
    
    
    public void insert(Quartos quartos){
        String comando  = "Insert Into quartos (id_quarto, numero_quarto, status, id_tiposquarto) values (?, ?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, quartos.getId_quarto());
            enviaComando.setInt(2, quartos.getNumero_quarto());
            enviaComando.setString(3, quartos.getStatus());
            enviaComando.setInt(4, quartos.getTiposquartos().getId_TiposQuartos());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro salvo com sucesso!");   
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + ex.getMessage());
        }
    }
    
     public void atualizar(Quartos quartos){
        String query = "update quartos set numero_quarto= ?, status= ?, id_tiposquarto where id_quarto= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(4, quartos.getId_quarto());
            enviaComando.setInt(1, quartos.getNumero_quarto());
            enviaComando.setString(2, quartos.getStatus());
            enviaComando.setInt(3, quartos.getTiposquartos().getId_TiposQuartos());
            enviaComando.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar quartos:" + ex.getMessage());
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
        String query = "Delete from quartos";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir quartos:" + ex.getMessage());
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
        String comando = "select max(id_quarto) as codigo from quartos";
        
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
      
      public List<Quartos> localizarTipo(String Quartos){
        conexao = cSQL.getConnection();
        List<Quartos> tipos = new ArrayList<>();
        String comando = "select *from quartos where numero_quarto= ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, Quartos);
            resultado = enviaComando.executeQuery();
            
            while(resultado.next()){ 
                Quartos quartos = new Quartos();
                quartos.setId_quarto(resultado.getInt("id_quarto"));
                quartos.setNumero_quarto(resultado.getInt("numero_quarto"));
                quartos.setStatus(resultado.getString("status"));
                quartos.setTiposquartos(dtdq.localizarTiposDeQuartos(resultado.getInt("id_tiposquarto")));
                tipos.add(quartos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar quartos" + ex.getMessage());
        }finally{
            try {    
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
    }
      
      public List<Quartos> listarTodos(){
        conexao = cSQL.getConnection();
        List<Quartos> tipos = new ArrayList<>();
        String comando = "select *from quartos";  
        try {
            enviaComando = conexao.prepareStatement(comando);
            resultado = enviaComando.executeQuery() ;       
            while(resultado.next()){ 
                Quartos quartos = new Quartos();
                quartos.setId_quarto(resultado.getInt("id_quarto"));
                quartos.setNumero_quarto(resultado.getInt("numero_quarto"));
                quartos.setStatus(resultado.getString("status"));
                quartos.setTiposquartos(dtdq.localizarTiposDeQuartos(resultado.getInt("id_tiposquarto")));
                tipos.add(quartos);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar quartos" + ex.getMessage());
        }finally{
            try {
               
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return tipos;
    }
      
      public void removerSelecionado(Quartos quartos){
        String query = "Delete from quartos where id_quarto= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, quartos.getId_quarto());
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir quartos:" + ex.getMessage());
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
