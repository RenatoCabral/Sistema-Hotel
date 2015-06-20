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
import modelo.Cidades;
import modelo.FuncaoFuncionario;

public class DAOFuncionario {
    
    private Cidades cid = new Cidades();
    private FuncaoFuncionario ff = new FuncaoFuncionario();
    private DAOCidades dCidades = new DAOCidades();
    private DAOFuncaoFuncionario dFuncFunc = new DAOFuncaoFuncionario();
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    
     public void insert(Funcionarios func){
        String comando  = "Insert Into funcionarios (id_funcionarios, nome_funcionarios, cpf_funcionarios, rg_funcionarios, endereco, email_funcionarios,id_cidades, id_funcao, tipo_telefone, telefone1, telefone2) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, func.getId_funcionarios());
            enviaComando.setString(2, func.getNome_funcionarios());
            enviaComando.setString(3, func.getCpf_funcionarios());
            enviaComando.setString(4, func.getRg_funcionarios());
            enviaComando.setString(5, func.getEndereco());
            enviaComando.setString(6, func.getEmail_funcionarios());
            enviaComando.setInt(7, func.getCidades().getId_cidades());
            enviaComando.setInt(8, func.getFfunc().getId_funcao());
            enviaComando.setString(9, func.getTipo_telefone());
            enviaComando.setString(10,func.getTelefone1());
            enviaComando.setString(11,func.getTelefone2());
            
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!");   
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + "ERRO:"+ ex.getMessage());
        }
    }
    
    public void atualizar(Funcionarios func ){
        String query = "update funcionarios set nome_funcionarios = ?, cpf_funcionarios= ?, rg_funcionarios= ?, endereco= ?, email_funcionarios=?, id_cidades= ?, id_funcao=?, tipo_telefone, telefone1, telefone2  where id_funcionario= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(11, func.getId_funcionarios());
            enviaComando.setString(1, func.getNome_funcionarios());
            enviaComando.setString(2, func.getCpf_funcionarios());
            enviaComando.setString(3, func.getRg_funcionarios());
            enviaComando.setString(4, func.getEndereco());
            enviaComando.setString(5, func.getEmail_funcionarios());
            enviaComando.setInt(6, func.getCidades().getId_cidades());
            enviaComando.setInt(7, func.getFfunc().getId_funcao());
            enviaComando.setString(8, func.getTipo_telefone());
            enviaComando.setString(9, func.getTelefone1());
            enviaComando.setString(10, func.getTelefone2());
            resultado = null;
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
        String comando = "select *from funcionarios where nome_funcionarios = ?";
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setString(1, Funcionarios);
            resultado = enviaComando.executeQuery();
            
            while(resultado.next()){ 
                Funcionarios func = new Funcionarios();
                func.setId_funcionarios(resultado.getInt("id_funcionarios"));
                func.setNome_funcionarios(resultado.getString("nome_funcionarios"));
                func.setCpf_funcionarios(resultado.getString("cpf_funcionarios"));
                func.setRg_funcionarios(resultado.getString("rg_funcionarios"));
                func.setEndereco(resultado.getString("endereco"));
                func.setEmail_funcionarios(resultado.getString("email_funcionarios"));
                func.setTelefone1(resultado.getString("telefone1"));
                func.setTelefone2(resultado.getString("telefone2"));
                func.setCidades(dCidades.localizarCidades(resultado.getInt("id_cidades")));
                func.setFfunc(dFuncFunc.localizarFuncaoFuncionario(resultado.getInt("id_funcao")));
                func.setTipo_telefone(resultado.getString("tipo_telefone"));
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
                func.setId_funcionarios(resultado.getInt("id_funcionarios"));
                func.setNome_funcionarios(resultado.getString("nome_funcionarios"));
                func.setCpf_funcionarios(resultado.getString("cpf_funcionarios"));
                func.setRg_funcionarios(resultado.getString("rg_funcionarios"));
                func.setEndereco(resultado.getString("endereco"));
                func.setEmail_funcionarios(resultado.getString("email_funcionarios"));
                func.setTelefone1(resultado.getString("telefone1"));
                func.setTelefone2(resultado.getString("telefone2"));
                func.setCidades(dCidades.localizarCidades(resultado.getInt("id_cidades")));
                func.setFfunc(dFuncFunc.localizarFuncaoFuncionario(resultado.getInt("id_funcao")));
                func.setTipo_telefone(resultado.getString("tipo_telefone"));
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
            enviaComando.setInt(1, func.getId_funcionarios());
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
    
    public Funcionarios localizarFuncionarios(int id){
        conexao = cSQL.getConnection();
        Funcionarios funcionarios = null;
        String comando = "select *from funcionarios where id_funcionarios= ? order by nome_funcionarios";
        
        try {
                enviaComando = conexao.prepareStatement(comando);
                enviaComando.setInt(1, id);
                resultado = enviaComando.executeQuery();
            
            while(resultado.next()){ 
                funcionarios = new Funcionarios();
                funcionarios.setId_funcionarios(resultado.getInt("id_funcionarios"));
                funcionarios.setNome_funcionarios(resultado.getString("nome_funcionarios"));
                funcionarios.setCpf_funcionarios(resultado.getString("cpf_funcionarios"));
                funcionarios.setRg_funcionarios(resultado.getString("rg_funcionarios"));
                funcionarios.setEndereco(resultado.getString("endereco"));
                funcionarios.setEmail_funcionarios(resultado.getString("email_funcionarios"));
                funcionarios.setTelefone1(resultado.getString("telefone1"));
                funcionarios.setTelefone2(resultado.getString("telefone2"));
                funcionarios.setCidades(dCidades.localizarCidades(resultado.getInt("id_cidades")));
                funcionarios.setFfunc(dFuncFunc.localizarFuncaoFuncionario(resultado.getInt("id_funcao")));
                funcionarios.setTipo_telefone(resultado.getString("tipo_telefone"));
                //tipos.add(func);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar funcionarios" + ex.getMessage());
        }finally{
            try {
                enviaComando.close();
                resultado.close();
               
            } catch (Throwable e) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + e.getMessage());
            }
        }
        return funcionarios;
    }
    
   
}
