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
    private static final int Col_Telefone1 = 6;
    private static final int Col_Telefone2 = 7;
    private static final int Col_Id_Cidades = 8;
    private static final int Col_Id_Funcao_Funcionario = 9;
    private static final int Col_Id_Tipo_Telefone = 10;
    
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
         return 11;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionarios func = tipos.get(rowIndex);
        if(columnIndex == Col_Id_Funcionario){
           return func.getId_funcionarios();
       }else if(columnIndex == Col_Nome_Funcionario){
           return func.getNome_funcionarios();
       }else if(columnIndex == Col_CPF_Funcionario){
           return func.getCpf_funcionarios();
       }else if(columnIndex == Col_RG_Funcionario){
           return func.getRg_funcionarios();
       } else if(columnIndex == Col_Endereco){
           return func.getEndereco();
       }else if(columnIndex == Col_Email_Funcionario){
           return func.getEmail_funcionarios();
       }else if(columnIndex == Col_Telefone1){
           return func.getTelefone1();
       }else if(columnIndex == Col_Telefone2){
           return func.getTelefone2();
       }else if(columnIndex == Col_Id_Cidades){
           return func.getCidades().getId_cidades();
       }else if(columnIndex == Col_Id_Funcao_Funcionario){
           return func.getFfunc().getId_funcao();
       }else if(columnIndex == Col_Id_Tipo_Telefone){
           return func.getTipotel().getId_tipotelefone();
           
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
        if(column == Col_Telefone1)
            return "Telefone1";
        if(column == Col_Telefone2)
            return "Telefone2";
        if(column == Col_Id_Cidades)
            return "id_Cidades";
        if(column == Col_Id_Funcao_Funcionario)
            return "id_Funcao_Funcionario";
        if(column == Col_Id_Tipo_Telefone)
            return "id_Tipo_Telefone";
         return "";
    }
    
     public Funcionarios getFuncionarios(int linha){
        return tipos.get(linha);
    }
    
}
