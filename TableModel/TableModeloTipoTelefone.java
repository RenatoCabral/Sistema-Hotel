package TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.TipoTelefone;

public class TableModeloTipoTelefone extends AbstractTableModel{
    
    private static final int Col_Id_TipoTelefone= 0;
    private static final int Col_Nome_TipoTelefone= 1;
    
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
      if(columnIndex == Col_Id_TipoTelefone){
          return tt.getId_tipotelefone();
      }else if(columnIndex == Col_Nome_TipoTelefone){
          return tt.getNome_tipotelefone();
      }
      return "";
    }
    
     @Override
    public String getColumnName(int column){
        if(column == Col_Id_TipoTelefone)
            return "Id_TipoTelefone";
        if(column == Col_Nome_TipoTelefone)
            return "Nome_TipoTelefone";
        return "";
    }
    
    public TipoTelefone getTipoTelefone(int linha){
        return tipos.get(linha);
    }
}
