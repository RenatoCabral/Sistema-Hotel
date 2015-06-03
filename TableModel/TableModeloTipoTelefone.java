package TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.TipoTelefone;

public class TableModeloTipoTelefone extends AbstractTableModel{
    
    private static final int Col_Id_Tipo_Telefone= 0;
    private static final int Col_Nome_Tipo_Telefone= 1;
    
     private List<TipoTelefone> tipos;

    public TableModeloTipoTelefone() {
    }

    public TableModeloTipoTelefone(List<TipoTelefone> tipos) {
        this.tipos = tipos;
    }
     
    @Override
    public int getRowCount() {
        return tipos.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      TipoTelefone tt = tipos.get(rowIndex);
      if(columnIndex == Col_Id_Tipo_Telefone){
          return tt.getId_tipo_telefone();
      }else if(columnIndex == Col_Nome_Tipo_Telefone){
          return tt.getNome_tipo_telefone();
      }
      return "";
    }
    
     @Override
    public String getColumnName(int column){
        if(column == Col_Id_Tipo_Telefone)
            return "Id_Tipo_Telefone";
        if(column == Col_Nome_Tipo_Telefone)
            return "Nome_Tipo_Telefone";
        return "";
    }
    
    public TipoTelefone getTipoTelefone(int linha){
        return tipos.get(linha);
    }
}
