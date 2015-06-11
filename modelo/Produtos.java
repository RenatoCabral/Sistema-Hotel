package modelo;

public class Produtos {
    
    private int id_produto;
    private int cod_produto;
    private String nome_produto;
    private double valor_compra;
    private double valor_venda;
    private int quantidade;
    private Fornecedor fornecedor;

    public Produtos() {
    }

    public Produtos(int id_produto, int cod_produto, String nome_produto, double valor_compra, double valor_venda, int quantidade,Fornecedor fornecedor) {
        this.id_produto = id_produto;
        this.cod_produto = cod_produto;
        this.nome_produto = nome_produto;
        this.valor_compra = valor_compra;
        this.valor_venda = valor_venda;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
    
    
}
