package DAO;

import modelo.FuncaoFuncionario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOFuncaoFuncionario {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    private FuncaoFuncionario ff = new FuncaoFuncionario();
    
    
    
    public void insert(FuncaoFuncionario ff){
        String comando  = "Insert Into funcao_funcionario (id_funcao, nome_funcao) values (?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, ff.getId_funcao());
            enviaComando.setString(2, ff.getNome_Funcao());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado");   
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + ex.getMessage());
        }
    }
    
    public void atualizar(FuncaoFuncionario ff ){
        String query = "update funcao_funcionario set nome_funcao = ? where id_funcao= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(2, ff.getId_funcao());
            enviaComando.setString(1, ff.getNome_Funcao());
            enviaComando.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar funcao_funcionario:" + ex.getMessage());
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
        String query = "Delete from funcao_funcionario";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcao_funcionario:" + ex.getMessage());
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
        String comando = "select max(id_funcao) as codigo from funcao_funcionario";
        
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
    
    public List<FuncaoFuncionario> localizarTipo(String Funcao_Funcionario){
        conexao = cSQL.getConnection();
        List<FuncaoFuncionario> tipos = new ArrayList<>();
        String comando = "select *from funcao_funcionario where nome_funcao = ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, Funcao_Funcionario);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                FuncaoFuncionario ff = new FuncaoFuncionario();
                ff.setId_funcao(resultado.getInt("id_funcao"));
                ff.setNome_Funcao(resultado.getString("nome_funcao"));
                tipos.add(ff);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcao_funcionario" + ex.getMessage());
        }finally{
            try {    
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
    }
    
     public List<FuncaoFuncionario> listarTodos(){
        conexao = cSQL.getConnection();
        List<FuncaoFuncionario> tipos = new ArrayList<>();
        String comando = "select *from funcao_funcionario";  
        try {
            enviaComando = conexao.prepareStatement(comando);
            resultado = enviaComando.executeQuery() ;       
            while(resultado.next()){ 
                FuncaoFuncionario ff = new FuncaoFuncionario();
                ff.setId_funcao(resultado.getInt("id_funcao"));
                ff.setNome_Funcao(resultado.getString("nome_funcao"));
                tipos.add(ff);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcao_funcionario" + ex.getMessage());
        }finally{
            try {
               
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return tipos;
    }
    
    public void removerSelecionado(FuncaoFuncionario ff){
        String query = "Delete from funcao_funcionario where id_funcao= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, ff.getId_funcao());
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcao_funcionario:" + ex.getMessage());
        }finally{
            try {
                enviaComando.close();
                conexao.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
    }
    
    public FuncaoFuncionario localizarFuncaoFuncionario(int  id) {
        conexao = cSQL.getConnection();
        FuncaoFuncionario  ff = null;
        String comando = "Select * from funcao_funcionario where id_funcao = ? order by nome_funcao";
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, id);
            resultado = enviaComando.executeQuery();

            while (resultado.next()) {
                ff = new FuncaoFuncionario();
                ff.setId_funcao(resultado.getInt("id_funcao"));
                ff.setNome_Funcao(resultado.getString("nome_funcao"));
            
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcao_funcionario:" + e.getMessage());
        } finally {
            try {
                enviaComando.close();
                resultado.close();
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexÃ£o com o banco de dados:" + e.getMessage());
            }
        }
        return ff;
    }
    
     public List<FuncaoFuncionario> getFuncaoFuncionario() {
        conexao = cSQL.getConnection();
        List<FuncaoFuncionario> ListFuncaoFuncionario = new ArrayList<>();
        String comando = "select *from funcao_funcionario";
         try {
             enviaComando = conexao.prepareStatement(comando);
             resultado = enviaComando.executeQuery();
             while (resultado.next()){
                ff = new FuncaoFuncionario();
                ff.setId_funcao(resultado.getInt("id_funcao"));
                ff.setNome_Funcao(resultado.getString("nome_funcao"));
                ListFuncaoFuncionario.add(ff);
             }
             
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Erro ao tentar prencher uma lista de Cidades!!\n\nERRO: " + ex.getMessage());
         }finally{
            try {
                conexao.close();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Erro ao tentar prencher uma lista de Cidades!!\n\nERRO: " + ex.getMessage());
            }   
         }
         return ListFuncaoFuncionario;
     }
}
