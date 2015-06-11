package TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.TiposDeQuartos;

public class TableModelTiposDeQuartos extends AbstractTableModel{
    
    private static final int Col_Id_TiposDeQuartos= 0;
    private static final int Col_Descricao= 1;
    private static final int Col_Valor= 2;
    
     private List<TiposDeQuartos> tipos;

    public TableModelTiposDeQuartos() {
    }

    public TableModelTiposDeQuartos(List<TiposDeQuartos> tipos) {
        this.tipos = tipos;
    }
     
     @Override
    public int getRowCount() {
        return tipos.size();
    }
    
    @Override
    public int getColumnCount() {
         return 3;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         TiposDeQuartos tiposquartos = tipos.get(rowIndex);
       if(columnIndex == Col_Id_TiposDeQuartos){
           return tiposquartos.getId_TiposQuartos();
       }else if(columnIndex == Col_Descricao){
           return tiposquartos.getDescrição();
       }else if(columnIndex == Col_Valor){
           return tiposquartos.getValor();
       } 
        return "";
    }
    
    @Override
    public String getColumnName(int column){
        if(column == Col_Id_TiposDeQuartos)
            return "Id_TiposDeQuartos";
        if(column == Col_Descricao)
            return "Descrição";
        if(column == Col_Valor)
            return "Valor";
         return "";
    }
    
     public TiposDeQuartos getTiposDeQuartos(int linha){
        return tipos.get(linha);
    }
    
}
