package TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Quartos;

public class TableModelQuartos extends AbstractTableModel{
    
    private static final int Col_Id = 0;
    private static final int Col_Numero_Quarto= 1;
    private static final int Col_Status= 2;
    private static final int Col_Id_TiposDeQuartos= 3;
   // private static final int Col_Descricao_TiposDeQuartos= 4;
    
     private List<Quartos> tipos;

    public TableModelQuartos() {
    }

    public TableModelQuartos(List<Quartos> tipos) {
        this.tipos = tipos;
    }
     
    @Override
    public int getRowCount() {
        return tipos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Quartos quartos = tipos.get(rowIndex);
        if(columnIndex == Col_Id){
           return quartos.getId_quarto();
       }else if(columnIndex == Col_Numero_Quarto){
           return quartos.getNumero_quarto();
       }else if(columnIndex == Col_Status){
           return quartos.getStatus();
       }else if(columnIndex == Col_Id_TiposDeQuartos){
           return quartos.getTiposquartos().getId_TiposQuartos();
      // }else if(columnIndex == Col_Descricao_TiposDeQuartos){
           //return quartos.getTiposquartos().getDescrição();
       }
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if(column == Col_Id)
            return "Id";
        if(column == Col_Numero_Quarto)
            return "Numero_Quarto";
        if(column == Col_Status)
            return "Status";
        if(column == Col_Id_TiposDeQuartos)
            return "Id_TiposDeQuartos";
       // if(column == Col_Descricao_TiposDeQuartos)
            //return "Descricao_TiposDeQuartos";
         return "";
    }
    
     public Quartos getQuartos(int linha){
        return tipos.get(linha);
    }
    
}
