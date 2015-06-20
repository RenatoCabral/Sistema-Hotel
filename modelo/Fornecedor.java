package modelo;

public class Fornecedor {
    
    private int id_fornecedor;
    private String cnpj;
    private String insc_estadual;
    private String NomeFantasia;
    private String RazaoSocial;
    private String telefone;
    private String endereco;
    private Cidades cidades;
    private String tipo_telefone;


    public Fornecedor() {
    }

    public Fornecedor(int id_fornecedor, String endereco, String cnpj, String insc_estadual, String NomeFantasia, String RazaoSocial, String telefone, Cidades cidades, String tipo_telefone) {
        this.id_fornecedor = id_fornecedor;
        this.cnpj = cnpj;
        this.insc_estadual = insc_estadual;
        this.NomeFantasia = NomeFantasia;
        this.RazaoSocial = RazaoSocial;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidades = cidades;
        this.tipo_telefone = tipo_telefone;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInsc_estadual() {
        return insc_estadual;
    }

    public void setInsc_estadual(String insc_estadual) {
        this.insc_estadual = insc_estadual;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cidades getCidades() {
        return cidades;
    }

    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
    }

    public String getTipo_telefone() {
        return tipo_telefone;
    }

    public void setTipo_telefone(String tipo_telefone) {
        this.tipo_telefone = tipo_telefone;
    }

    @Override
    public String toString() {
        return NomeFantasia;
    }
    
    
    
}
