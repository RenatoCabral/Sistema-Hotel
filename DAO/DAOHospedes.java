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
import modelo.Hospedes;
import modelo.TipoTelefone;

public class DAOHospedes{
    
    private DAOCidades dCidades = new DAOCidades();
    private DAOTipoTelefone dTipoTel = new DAOTipoTelefone();
    private Cidades cid = new Cidades();
    private TipoTelefone tt = new TipoTelefone();
    private Hospedes hosp = new Hospedes();
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;

    public void inserir(Hospedes hosp){
        String comando  = "Insert Into hospedes (id_hospede, nome_hospede, cpf_hospede, rg_hospede, endereco_hospede, email, placa_veiculo, id_cidades, id_tipotelefone,telefone1, telefone2) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, hosp.getId_hospede());
            enviaComando.setString(2, hosp.getNome_hospede());
            enviaComando.setString(3, hosp.getRg_hospede());
            enviaComando.setString(4, hosp.getCpf_hospede());
            enviaComando.setString(5, hosp.getEndereco_hospede());
            enviaComando.setString(6, hosp.getPlaca_veiculo());
            enviaComando.setString(7, hosp.getEmail());
            enviaComando.setString(8, hosp.getTelefone1());
            enviaComando.setString(9, hosp.getTelefone2());
            enviaComando.setInt(10, hosp.getCidades().getId_cidades());
            enviaComando.setInt(11, hosp.getTipoTelefone().getId_tipotelefone());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!");   
            enviaComando.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro não efetuado" + "ERRO:"+ ex.getMessage());
        }
        
        
    }
    
     public void atualizar(Hospedes hosp){
         String query = "update hospedes set nome_hospede = ?, cpf_hospede= ?, rg_hospede= ?, endereco_hospede= ?, email= ?,placa_veiculo= ?, telefone1, telefone2, id_cidades= ?,id_tipotelefone= ? where id_hospede= ?";
        conexao = cSQL.getConnection();
        
         try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(11, hosp.getId_hospede());
            enviaComando.setString(1, hosp.getNome_hospede());
            enviaComando.setString(2, hosp.getCpf_hospede());
            enviaComando.setString(3, hosp.getRg_hospede());
            enviaComando.setString(4, hosp.getEndereco_hospede());
            enviaComando.setString(5, hosp.getEmail());
            enviaComando.setString(6, hosp.getPlaca_veiculo());
            enviaComando.setString(7, hosp.getTelefone1());
            enviaComando.setString(8, hosp.getTelefone2());
            enviaComando.setInt(9, hosp.getCidades().getId_cidades());
            enviaComando.setInt(10, hosp.getTipoTelefone().getId_tipotelefone());
            enviaComando.executeUpdate();
         } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao alterar hospede:" + e.getMessage());
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
        String query = "Delete from hospedes";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir hospedes:" + ex.getMessage());
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
        String comando = "select max(id_hospede) as codigo from hospedes";
        
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
     
      public List<Hospedes> localizarTipo(String Hospedes){
        conexao = cSQL.getConnection();
        List<Hospedes> tipos = new ArrayList<>();
        String comando = "select *from hospedes where nome_hospede= ?";
        
          try {
               while(resultado.next()){ 
                   Hospedes hosp = new Hospedes();
                hosp.setId_hospede(resultado.getInt("id_hospede"));
                hosp.setNome_hospede(resultado.getString("nome_hospede"));
                hosp.setCpf_hospede(resultado.getString("cpf_hospede"));
                hosp.setRg_hospede(resultado.getString("rg_hospede"));
                hosp.setEndereco_hospede(resultado.getString("endereco_hospede"));
                hosp.setEmail(resultado.getString("email"));
                hosp.setPlaca_veiculo(resultado.getString("placa_veiculo"));
                hosp.setTelefone1(resultado.getString("telefone1"));
                hosp.setTelefone2(resultado.getString("telefone2"));
                hosp.setCidades(dCidades.localizarCidades(resultado.getInt("id_cidades")));
                hosp.setTipoTelefone(dTipoTel.localizarTipoTelefone(resultado.getInt("id_tipotelefone")));
                tipos.add(hosp);
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
      
       public List<Hospedes> listarTodos(){
        conexao = cSQL.getConnection();
        List<Hospedes> tipos = new ArrayList<>();
        String comando = "select *from hospedes";
        
          try {
               enviaComando = conexao.prepareStatement(comando);
                resultado = enviaComando.executeQuery() ;
            
               while(resultado.next()){ 
                   Hospedes hosp = new Hospedes();
                hosp.setId_hospede(resultado.getInt("id_hospede"));
                hosp.setNome_hospede(resultado.getString("nome_hospede"));
                hosp.setCpf_hospede(resultado.getString("cpf_hospede"));
                hosp.setRg_hospede(resultado.getString("rg_hospede"));
                hosp.setEndereco_hospede(resultado.getString("endereco_hospede"));
                hosp.setEmail(resultado.getString("email"));
                hosp.setPlaca_veiculo(resultado.getString("placa_veiculo"));
                hosp.setTelefone1(resultado.getString("telefone1"));
                hosp.setTelefone2(resultado.getString("telefone2"));
                hosp.setCidades(dCidades.localizarCidades(resultado.getInt("id_cidades")));
                hosp.setTipoTelefone(dTipoTel.localizarTipoTelefone(resultado.getInt("id_tipotelefone")));
                tipos.add(hosp);
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
       
        public List<Hospedes> localizarHospede(String nome_hospede){
        conexao = cSQL.getConnection();
        List<Hospedes> hospedes = new ArrayList<>();
        String comando = "select *from hospedes where nome_hospede= ? order by nome_hospede";
        
          try {
                enviaComando = conexao.prepareStatement(comando);
                enviaComando.setString(1, nome_hospede);
                resultado = enviaComando.executeQuery();
            
               while(resultado.next()){ 
                   Hospedes hosp = new Hospedes();
                hosp.setId_hospede(resultado.getInt("id_hospede"));
                hosp.setNome_hospede(resultado.getString("nome_hospede"));
                hosp.setCpf_hospede(resultado.getString("cpf_hospede"));
                hosp.setRg_hospede(resultado.getString("rg_hospede"));
                hosp.setEndereco_hospede(resultado.getString("endereco_hospede"));
                hosp.setEmail(resultado.getString("email"));
                hosp.setPlaca_veiculo(resultado.getString("placa_veiculo"));
                hosp.setTelefone1(resultado.getString("telefone1"));
                hosp.setTelefone2(resultado.getString("telefone2"));
                hosp.setCidades(dCidades.localizarCidades(resultado.getInt("id_cidades")));
                hosp.setTipoTelefone(dTipoTel.localizarTipoTelefone(resultado.getInt("id_tipotelefone")));
                hospedes.add(hosp);
               }
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, "Erro ao buscar hospedes" + e.getMessage());
          }finally{
            try {
                
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return hospedes;
      }
       
       public void removerSelecionado(Hospedes hosp){
        String query = "Delete from hospedes where id_hospede= ?";
        conexao = cSQL.getConnection();
        
        try {
            enviaComando = conexao.prepareStatement(query);
            enviaComando.setInt(1, hosp.getId_hospede());
            enviaComando.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir hospedes:" + ex.getMessage());
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
