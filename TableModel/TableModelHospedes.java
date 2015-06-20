package TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Hospedes;

public class TableModelHospedes extends AbstractTableModel {
    
    private static final int Col_Id_Hospede= 0;
    private static final int Col_Nome_Hospede= 1;
    private static final int Col_CPF_Hospede= 2;
    private static final int Col_RG_Hospede= 3;
    private static final int Col_Endereco_Hospede= 4;
    private static final int Col_Email= 5;
    private static final int Col_Telefone1 = 6;
    private static final int Col_Telefone2 = 7;
    private static final int Col_Placa_Veiculo = 8;
    private static final int Col_Id_Cidades = 9;
    private static final int Col_TipoTelefone = 10;
    
     private List<Hospedes> tipos;

    public TableModelHospedes() {
    }

    public TableModelHospedes(List<Hospedes> tipos) {
        this.tipos = tipos;
    }
     
    @Override
    public int getRowCount() {
        return tipos.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Hospedes hosp = tipos.get(rowIndex);
         if(columnIndex == Col_Id_Hospede){
           return hosp.getId_hospede();
       }else if(columnIndex == Col_Nome_Hospede){
           return hosp.getNome_hospede();
       }else if(columnIndex == Col_CPF_Hospede){
           return hosp.getCpf_hospede();
       }else if(columnIndex == Col_RG_Hospede){
           return hosp.getRg_hospede();
       } else if(columnIndex == Col_Endereco_Hospede){
           return hosp.getEndereco_hospede();
       }else if(columnIndex == Col_Email){
           return hosp.getEmail();
       }else if(columnIndex == Col_Telefone1){
           return hosp.getTelefone1();
        }else if(columnIndex == Col_TipoTelefone){
           return hosp.getTipo_Telefone();
       }else if(columnIndex == Col_Telefone2){
           return hosp.getTelefone2();
       }else if(columnIndex == Col_Placa_Veiculo){
           return hosp.getPlaca_veiculo();
       }else if(columnIndex == Col_Id_Cidades){
           return hosp.getCidades().getId_cidades();
           
       }
        return "";    
    }
    
    @Override
     public String getColumnName(int column){
        if(column == Col_Id_Hospede)
            return "Id_Hospede";
        if(column == Col_Nome_Hospede)
            return "Nome_Hospede";
        if(column == Col_CPF_Hospede)
            return "CPF_Hospede";
        if(column == Col_RG_Hospede)
            return "RG_Hospede";
        if(column == Col_Endereco_Hospede)
            return "Endereco_Hospede";
        if(column == Col_Email)
            return "Email";
        if(column == Col_Telefone1)
            return "Telefone1";
        if(column == Col_TipoTelefone)
            return "TipoTelefone";
        if(column == Col_Telefone2)
            return "Telefone2";
        if(column == Col_Placa_Veiculo)
            return "Placa_Veiculo";
        if(column == Col_Id_Cidades)
            return "Id_Cidades";
        
         return "";
    }
    
     public Hospedes getHospedes(int linha){
        return tipos.get(linha);
    }
}
