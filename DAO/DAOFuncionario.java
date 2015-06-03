package DAO;

import modelo.Funcionarios;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAOFuncionario {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    
     public void insert(Funcionarios func){
        String comando  = "Insert Into fornecedor (id_funcionarios, nome_funcionarios, cpf_funcionarios, rg_funcionarios, endereco,email_funcionarios, id_cidades, id_funcao) values (?, ?, ?, ?, ?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, func.getId_funcionario());
            enviaComando.setString(2, func.getNome_funcionario());
            enviaComando.setString(3, func.getCpf_funcionario());
            enviaComando.setString(4, func.getRg_funcionario());
            enviaComando.setString(5, func.getEndereco());
            enviaComando.setString(6, func.getEmail_funcionario());
            enviaComando.setString(7, func.getCidades().getNome_cidades());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!");   
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + ex.getMessage());
        }
    }
    
    public void atualizar(Funcionarios func ){
        String query = "update funcionarios set nome_funcionarios = ?, cpf_funcionarios= ?, rg_funcionarios= ?, endereco= ?, email_funcionarios=?, id_cidades= ?  where id_funcionario= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(7, func.getId_funcionario());
            enviaComando.setString(1, func.getNome_funcionario());
            enviaComando.setString(2, func.getCpf_funcionario());
            enviaComando.setString(3, func.getRg_funcionario());
            enviaComando.setString(4, func.getEndereco());
            enviaComando.setString(5, func.getEmail_funcionario());
            enviaComando.setString(6, func.getCidades().getNome_cidades());
            enviaComando.executeUpdate();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar funcionarios:" + ex.getMessage());
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
        String query = "Delete from funcionarios";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionarios:" + ex.getMessage());
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
        String comando = "select max(id_funcionarios) as codigo from funcionarios";
        
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
    
    public List<Funcionarios> localizarTipo(String Funcionarios){
        conexao = cSQL.getConnection();
        List<Funcionarios> tipos = new ArrayList<>();
        String comando = "select *from funcionario where nome_funcionarios = ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, Funcionarios);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                Funcionarios func = new Funcionarios();
                func.setId_funcionario(resultado.getInt("id_funcionarios"));
                func.setNome_funcionario(resultado.getString("nome_funcionarios"));
                func.setCpf_funcionario(resultado.getString("cpf_funcionarios"));
                func.setRg_funcionario(resultado.getString("rg_funcionarios"));
                func.setEndereco(resultado.getString("endereco"));
                func.setEmail_funcionario(resultado.getString("email_funcionarios"));
                //func.setCidades(resultado.getC("id_cidades"));
                tipos.add(func);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionario" + ex.getMessage());
        }finally{
            try {
                
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
    }
    
     public List<Funcionarios> listarTodos(){
        conexao = cSQL.getConnection();
        List<Funcionarios> tipos = new ArrayList<>();
        String comando = "select *from funcionarios";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            resultado = enviaComando.executeQuery() ;
            
            while(resultado.next()){ 
                Funcionarios func = new Funcionarios();
                func.setId_funcionario(resultado.getInt("id_funcionarios"));
                func.setNome_funcionario(resultado.getString("nome_funcionarios"));
                func.setCpf_funcionario(resultado.getString("cpf_funcionarios"));
                func.setRg_funcionario(resultado.getString("rg_funcionarios"));
                func.setEndereco(resultado.getString("endereco"));
                func.setEmail_funcionario(resultado.getString("email_funcionarios"));
                tipos.add(func);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionarios" + ex.getMessage());
        }finally{
            try {
               
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return tipos;
    }
    
    public void removerSelecionado(Funcionarios func){
        String query = "Delete from funcionarios where id_funcionarios= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, func.getId_funcionario());
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir funcionarios:" + ex.getMessage());
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
