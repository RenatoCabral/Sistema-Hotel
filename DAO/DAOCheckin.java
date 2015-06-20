package DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Checkin;
import modelo.Funcionarios;
import modelo.Hospedes;
import modelo.Quartos;

public class DAOCheckin {
    
    private Conexao cSQL = new Conexao();
    private Connection conexao;
    public static ResultSet resultado;
    private PreparedStatement enviaComando;
    private DAOHospedes dHospedes = new DAOHospedes();
    private DAOQuartos dQuartos = new DAOQuartos();
    private DAOFuncionario dFuncionario = new DAOFuncionario();
    private Checkin checkin = new Checkin();
    private Hospedes hospedes = new Hospedes();
    private Quartos quartos = new Quartos();
    private Funcionarios funcionarios = new Funcionarios();
    
    public void inserir(Checkin checkin){
        String comando = "Insert into checkin(id_checkin, data_chegada, hora_chegada, data_saida, hora_saida, quantidade_hospede,id_hospede, id_quarto, id_funcionario )values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        conexao  = cSQL.getConnection();
        try {
            enviaComando = conexao.prepareStatement(comando);
            enviaComando.setInt(1, checkin.getId_Checkin());
            enviaComando.setString(2, checkin.getData_chegada());
            enviaComando.setString(3, checkin.getHora_chegada());
            enviaComando.setString(4, checkin.getData_saida());
            enviaComando.setString(5, checkin.getHora_saida());
            enviaComando.setInt(6, checkin.getQuantidade_hospede()); 
            enviaComando.setInt(7, checkin.getHospedes().getId_hospede());
            enviaComando.setInt(8, checkin.getQuartos().getId_quarto());
            enviaComando.setInt(10, checkin.getFuncionarios().getId_funcionarios());
            enviaComando.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro efetuado com sucesso!"); 
            enviaComando.close();
        } catch (Exception e) {
            if(e.getMessage().contains("hospde_id_hospede")){
                JOptionPane.showMessageDialog(null, "ja cadastrado");
            }
             JOptionPane.showMessageDialog(null, "Registro não efetuado" + "ERRO:"+ e.getMessage());
        }
    
    }
    
    public int geraCodigo(){
        conexao = cSQL.getConnection();
        int codigo = 0;
        String comando = "select max(id_checkin) as codigo from checkin";
        
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
    
    public List<Checkin> listarTodos(){
        conexao = cSQL.getConnection();
        List<Checkin> tipos = new ArrayList<>();
        String comando = "select *from checkin";
        
          try {
                enviaComando = conexao.prepareStatement(comando);
                resultado = enviaComando.executeQuery() ;
            
               while(resultado.next()){ 
                   Checkin checkin = new Checkin();
                checkin.setId_Checkin(resultado.getInt("id_checkin"));
                checkin.setData_chegada(resultado.getString("data_chegada"));
                checkin.setData_saida(resultado.getString("data_saida"));
                checkin.setFuncionarios(dFuncionario.localizarFuncionarios(resultado.getInt("id_funcionarios")));
                checkin.setHora_chegada(resultado.getString("hora_chegada"));
                checkin.setHora_saida(resultado.getString("hora_saida"));
                checkin.setQuantidade_hospede(resultado.getInt("quantidade_hospede"));
                checkin.setHospedes(dHospedes.LocalizarHospede(resultado.getInt("id_hospede")));
                checkin.setQuartos(dQuartos.localizarQuartos(resultado.getInt("id_quarto")));
                tipos.add(checkin);
               }
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, "Erro ao buscar checkin" + e.getMessage());
          }finally{
            try {
                enviaComando.close();
                conexao.close();
            } catch (Throwable ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados:\n ERRO:" + ex.getMessage());
            }
        }
        return tipos;
      }
    
   
}
