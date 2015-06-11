package TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Fornecedor;

public class TableModelFornecedor extends AbstractTableModel{
    
    private static final int Col_Id_Fornecedor= 0;
    private static final int Col_Razao_Social= 1;
    private static final int Col_Nome_Fantasia= 2;
    private static final int Col_CNPJ= 3;
    private static final int Col_Insc_Estadual= 4;
    private static final int Col_Endereco= 5;
    private static final int Col_Telefone= 6;
    private static final int Col_Id_Cidades = 7;
    private static final int Col_Id_TipoTelefone = 8;
    
    
    private List<Fornecedor> tipos;

    public TableModelFornecedor() {
    }

    public TableModelFornecedor(List<Fornecedor> tipos) {
        this.tipos = tipos;
    }

    @Override
    public int getRowCount() {
         return tipos.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor fornecedor = tipos.get(rowIndex);
        if(columnIndex == Col_Id_Fornecedor){
            return fornecedor.getId_fornecedor();    
        }else if(columnIndex == Col_Razao_Social){
            return fornecedor.getRazaoSocial();
        }else if(columnIndex == Col_Nome_Fantasia){
            return fornecedor.getNomeFantasia();
        }else if(columnIndex == Col_CNPJ){
            return fornecedor.getCnpj();
        }else if(columnIndex == Col_Insc_Estadual){
            return fornecedor.getInsc_estadual();
        }else if(columnIndex == Col_Endereco){
            return fornecedor.getEndereco();
        }else if(columnIndex == Col_Telefone){
            return fornecedor.getTelefone();
        }else if(columnIndex == Col_Id_Cidades){
            return fornecedor.getCidades().getId_cidades();
        }else if(columnIndex == Col_Id_TipoTelefone){
            return fornecedor.getTipotelefone().getId_tipotelefone();
        }
        return "";
    }
    
    @Override
     public String getColumnName(int column){
         if(column == Col_Id_Fornecedor)
             return "Id_Fornecedor";
         if(column == Col_Razao_Social)
             return "Razao_Social";
         if(column == Col_Nome_Fantasia)
             return "Nome_Fantasia";
         if(column == Col_CNPJ)
             return "CNPJ";
         if(column == Col_Insc_Estadual)
             return "Insc_Estadual";
         if(column == Col_Endereco)
             return "Endereco";
         if(column == Col_Telefone)
             return "Telefone";
         if(column == Col_Id_Cidades)
             return "Id_Cidades";
         if(column == Col_Id_TipoTelefone)
             return "Id_TipoTelefone";
         return "";
     }
     
     public Fornecedor getFornecedor(int linha){
         return tipos.get(linha);
     }
    
}
