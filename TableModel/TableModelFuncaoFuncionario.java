package TableModel;

import modelo.FuncaoFuncionario;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class TableModelFuncaoFuncionario extends AbstractTableModel{
    
    private static final int Col_Id_Funcao = 0;
    private static final int Col_NomeFuncao = 1;
   
    
    private List<FuncaoFuncionario> tipos;

    public TableModelFuncaoFuncionario() {
    }
    
    
    public TableModelFuncaoFuncionario(List<FuncaoFuncionario> tipos) {
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
        FuncaoFuncionario ff = tipos.get(rowIndex);
       if(columnIndex == Col_Id_Funcao){
           return ff.getId_funcao();
       }else if(columnIndex == Col_NomeFuncao){
           return ff.getNome_Funcao();
       }   
        return "";
    }
    
     @Override
    public String getColumnName(int column){
        if(column == Col_Id_Funcao)
            return "IdFuncao";
        if(column == Col_NomeFuncao)
            return "NomeFuncao";
         return "";
    }
    
     public FuncaoFuncionario getFuncaoFuncionario(int linha){
        return tipos.get(linha);
    }
    
}
