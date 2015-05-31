package TableModel;

import classes.Estado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelEstado extends AbstractTableModel{
    
    private static final int Col_Id = 0;
    private static final int Col_NomeEstado = 1;
    private static final int Col_Sigla = 2;
    private static final int Col_Status = 3;
    
    private List<Estado> tipos;

    public TableModelEstado() {
    }

    public TableModelEstado(List<Estado> tipos) {
        this.tipos = new ArrayList<>(tipos);
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
         Estado est = tipos.get(rowIndex);
       if(columnIndex == Col_Id){
           return est.getId_estado();
       }else if(columnIndex == Col_NomeEstado){
           return est.getNome_estado();
       }else if(columnIndex == Col_Sigla){
           return est.getSigla();
       }else if(columnIndex == Col_Status){
           return est.getStatus();
       }   
        return "";
    }
    
     @Override
    public String getColumnName(int column){
        if(column == Col_Id)
            return "Id";
        if(column == Col_NomeEstado)
            return "NomeEstado";
        if(column == Col_Sigla)
            return "Sigla";
        if(column == Col_Status)
            return "Status";
         return "";
    }
    
     public Estado getEStados(int linha){
        return tipos.get(linha);
    }
}
