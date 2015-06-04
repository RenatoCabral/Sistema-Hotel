package DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public void insert(Hospedes hosp){
        String comando  = "Insert Into hospedes (id_hospede, nome_hospede, cpf_hospede, rg_hospede, endereco_hospede, email, placa_veiculo, id_cidades,id_tipotelefone, telefone1, telefone2) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        conexao  = cSQL.getConnection();
        
        try {
            
        } catch (Exception e) {
        }
        
        
    }

   
}
