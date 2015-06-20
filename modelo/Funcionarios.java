package modelo;

public class Funcionarios {
    
    private int id_funcionarios;
    private String nome_funcionarios;
    private String cpf_funcionarios;
    private String rg_funcionarios;
    private String endereco;
    private String email_funcionarios;
    private String telefone1;
    private String telefone2;
    private Cidades cidades;
    private FuncaoFuncionario ffunc;
    private String tipo_telefone;

    public Funcionarios() {
    }

  
    public Funcionarios(int id_funcionarios, String nome_funcionarios, String cpf_funcionarios, String rg_funcionarios, String endereco, String email_funcionarios, String telefone1, String telefone2, Cidades cidades, FuncaoFuncionario ffunc, String tipo_telefone) {
        this.id_funcionarios = id_funcionarios;
        this.nome_funcionarios = nome_funcionarios;
        this.cpf_funcionarios = cpf_funcionarios;
        this.rg_funcionarios = rg_funcionarios;
        this.endereco = endereco;
        this.email_funcionarios = email_funcionarios;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.cidades = cidades;
        this.ffunc = ffunc;
        this.tipo_telefone = tipo_telefone;
    }

    public int getId_funcionarios() {
        return id_funcionarios;
    }

    public void setId_funcionarios(int id_funcionarios) {
        this.id_funcionarios = id_funcionarios;
    }

    public String getNome_funcionarios() {
        return nome_funcionarios;
    }

    public void setNome_funcionarios(String nome_funcionarios) {
        this.nome_funcionarios = nome_funcionarios;
    }

    public String getCpf_funcionarios() {
        return cpf_funcionarios;
    }

    public void setCpf_funcionarios(String cpf_funcionarios) {
        this.cpf_funcionarios = cpf_funcionarios;
    }

    public String getRg_funcionarios() {
        return rg_funcionarios;
    }

    public void setRg_funcionarios(String rg_funcionarios) {
        this.rg_funcionarios = rg_funcionarios;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail_funcionarios() {
        return email_funcionarios;
    }

    public void setEmail_funcionarios(String email_funcionarios) {
        this.email_funcionarios = email_funcionarios;
    }

    public Cidades getCidades() {
        return cidades;
    }

    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
    }

    public FuncaoFuncionario getFfunc() {
        return ffunc;
    }

    public void setFfunc(FuncaoFuncionario ffunc) {
        this.ffunc = ffunc;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getTipo_telefone() {
        return tipo_telefone;
    }

    public void setTipo_telefone(String tipo_telefone) {
        this.tipo_telefone = tipo_telefone;
    }
    
    

    @Override
    public String toString() {
        return nome_funcionarios;
    }
    
      
}
