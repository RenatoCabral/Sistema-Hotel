package TableModel;

import modelo.Funcionarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelFuncionario extends AbstractTableModel{
    
    private static final int Col_Id_Funcionario= 0;
    private static final int Col_Nome_Funcionario= 1;
    private static final int Col_CPF_Funcionario= 2;
    private static final int Col_RG_Funcionario= 3;
    private static final int Col_Endereco= 4;
    private static final int Col_Email_Funcionario= 5;
    private static final int Col_Nome_Cidades = 6;
    
    private List<Funcionarios> tipos;

    public TableModelFuncionario() {
    }

    public TableModelFuncionario(List<Funcionarios> tipos) {
        this.tipos = tipos;
    }
    
    

    @Override
    public int getRowCount() {
         return tipos.size();
    }

    @Override
    public int getColumnCount() {
         return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionarios func = tipos.get(rowIndex);
        if(columnIndex == Col_Id_Funcionario){
           return func.getId_funcionario();
       }else if(columnIndex == Col_Nome_Funcionario){
           return func.getNome_funcionario();
       }else if(columnIndex == Col_CPF_Funcionario){
           return func.getCpf_funcionario();
       }else if(columnIndex == Col_RG_Funcionario){
           return func.getRg_funcionario();
       } else if(columnIndex == Col_Endereco){
           return func.getEndereco();
       }else if(columnIndex == Col_Email_Funcionario){
           return func.getEmail_funcionario();
       }else if(columnIndex == Col_Nome_Cidades){
           return func.getCidades().getNome_cidades();
       
       }
        return "";      
    }
    
    @Override
     public String getColumnName(int column){
        if(column == Col_Id_Funcionario)
            return "Id_Funcionario";
        if(column == Col_Nome_Funcionario)
            return "Nome_Funcionario";
        if(column == Col_CPF_Funcionario)
            return "CPF_Funcionario";
        if(column == Col_RG_Funcionario)
            return "RG_Funcionario";
        if(column == Col_Endereco)
            return "Endereco";
        if(column == Col_Email_Funcionario)
            return "Email_Funcionario";
        if(column == Col_Nome_Cidades)
            return "Nome_Cidades";
         return "";
    }
    
     public Funcionarios getFuncionarios(int linha){
        return tipos.get(linha);
    }
    
}
