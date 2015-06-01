package TableModel;

import classes.Cidades;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelCidades extends AbstractTableModel{
    
    private static final int Col_Id_Cidades = 0;
    private static final int Col_NomeCidades = 1;
    private static final int Col_Estado = 2;
    
    private List<Cidades> tipos;

    public TableModelCidades(){
    }

    public TableModelCidades(List<Cidades> tipos) {
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
         Cidades cid = tipos.get(rowIndex);
       if(columnIndex == Col_Id_Cidades){
           return cid.getId_cidades();
       }else if(columnIndex == Col_NomeCidades){
           return cid.getNome_cidades();
       }else if(columnIndex == Col_Estado){
           return cid.getEstados();
       }
        return "";
    }
    
     @Override
    public String getColumnName(int column){
        if(column == Col_Id_Cidades)
            return "IdCidades";
        if(column == Col_NomeCidades)
            return "NomeCidades";
        if(column == Col_Estado)
            return "Estado";
         return "";
    }
    
     public Cidades getCidades(int linha){
        return tipos.get(linha);
    }
    
}
