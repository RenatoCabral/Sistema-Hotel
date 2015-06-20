package TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Checkin;

public class TableModelCheckin extends AbstractTableModel{
    
    private static final int Col_Id_Checkin= 0;
    private static final int Col_Data_Chegada= 1;
    private static final int Col_Hora_Chegada= 2;
    private static final int Col_Data_Saida= 3;
    private static final int Col_Hora_Saida= 4;
    private static final int Col_Qtde_Hospede= 5;
    private static final int Col_Id_Hospede= 6;
    private static final int Col_Id_Quarto= 7;
    private static final int Col_Id_Funcionario= 9;
    
    private List<Checkin> tipos;

    public TableModelCheckin() {
    }

    public TableModelCheckin(List<Checkin> tipos) {
        this.tipos = tipos;
    }
    
    @Override
    public int getRowCount() {
        return tipos.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Checkin checkin = tipos.get(rowIndex);
        if(columnIndex == Col_Id_Checkin){
           return checkin.getId_Checkin();
        }else if(columnIndex == Col_Data_Chegada){
            return checkin.getData_chegada();
        }else if(columnIndex == Col_Data_Saida){
            return checkin.getData_saida();
        }else if(columnIndex == Col_Hora_Chegada){
            return checkin.getHora_chegada();
        }else if(columnIndex == Col_Hora_Saida){
            return checkin.getHora_saida();
        }else if(columnIndex == Col_Qtde_Hospede){
            return checkin.getQuantidade_hospede();
        }else if(columnIndex == Col_Id_Funcionario){
            return checkin.getFuncionarios().getId_funcionarios();
        }else if(columnIndex == Col_Id_Hospede){
            return checkin.getHospedes().getId_hospede();
        }else if(columnIndex == Col_Id_Quarto){
            return checkin.getQuartos().getId_quarto();
        }
         return "";
    }
    
    @Override
     public String getColumnName(int column){
        if(column == Col_Id_Checkin)
            return "Id_Checkin";
        if(column == Col_Data_Chegada)
             return "Data_Chegada";
        if(column == Col_Data_Saida)
             return "Data_Saida";
        if(column == Col_Hora_Chegada)
             return "hora_Chegada";
        if(column == Col_Hora_Saida)
             return "hora_Saida";
        if(column == Col_Qtde_Hospede)
             return "Qtde_Hospede";
        if(column == Col_Id_Funcionario)
             return "id_Funcionario";
        if(column == Col_Id_Hospede)
             return "id_Hospede";
        if(column == Col_Id_Quarto)
            return "id_Quarto";
        return "";
       
            
    }
     
      public Checkin getCheckin(int linha){
         return tipos.get(linha);
     }
    
}
