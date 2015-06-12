package TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Produtos;

public class TableModelProduto extends AbstractTableModel{
    
    private static final int Col_Id_Produto= 0;
    private static final int Col_Nome_Produto= 1;
    private static final int Col_Quantidade= 2;
    private static final int Col_Codigo_Produto= 3;
    private static final int Col_Valor_Compra= 4;
    private static final int Col_Valor_Venda= 5;
    private static final int Col_Id_Fornecedor= 6;
    
     private List<Produtos> tipos;

    public TableModelProduto() {
    }

    public TableModelProduto(List<Produtos> tipos) {
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
        Produtos produtos = tipos.get(rowIndex);
        if(columnIndex == Col_Id_Produto){
            return produtos.getId_produto();
        }else if(columnIndex == Col_Codigo_Produto){
            return produtos.getCod_produto();
        }else if(columnIndex == Col_Nome_Produto){
            return produtos.getNome_produto();
        }else if(columnIndex == Col_Quantidade){
            return produtos.getQuantidade();
        }else if(columnIndex == Col_Valor_Compra){
            return produtos.getValor_compra();
        }else if(columnIndex == Col_Valor_Venda){
            return produtos.getValor_venda();
        }else if(columnIndex == Col_Id_Fornecedor){
            return produtos.getFornecedor().getId_fornecedor();
        }
        return "";
    }
    
     @Override
     public String getColumnName(int column){
        if(column == Col_Id_Produto)
            return "Id_Produto";
        if(column == Col_Codigo_Produto)
             return "Cod_Produto";
        if(column == Col_Nome_Produto)
             return "Nome_Produto";
        if(column == Col_Quantidade)
             return "Quantidade";
        if(column == Col_Valor_Compra)
             return "Valor_Compra";
        if(column == Col_Valor_Venda)
             return "Valor_Venda";
        if(column == Col_Id_Fornecedor)
             return "Id_Fornecedor";
        return "";
    }
     
      public Produtos getProdutos(int linha){
         return tipos.get(linha);
     }
}
