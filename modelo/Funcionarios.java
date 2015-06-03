package modelo;

public class Funcionarios {
    
    private int id_funcionario;
    private String nome_funcionario;
    private String cpf_funcionario;
    private String rg_funcionario;
    private String endereco;
    private String email_funcionario;
    private Cidades cidades;
    private FuncaoFuncionario ffunc;
    private Telefone tel;

    public Funcionarios() {
    }

  
    public Funcionarios(int id_funcionario, String nome_funcionario, String cpf_funcionario, String rg_funcionario, String endereco, String email_funcionario, Cidades cidades, FuncaoFuncionario ffunc, Telefone tel) {
        this.id_funcionario = id_funcionario;
        this.nome_funcionario = nome_funcionario;
        this.cpf_funcionario = cpf_funcionario;
        this.rg_funcionario = rg_funcionario;
        this.endereco = endereco;
        this.email_funcionario = email_funcionario;
        this.cidades = cidades;
        this.ffunc = ffunc;
        this.tel = tel;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getCpf_funcionario() {
        return cpf_funcionario;
    }

    public void setCpf_funcionario(String cpf_funcionario) {
        this.cpf_funcionario = cpf_funcionario;
    }

    public String getRg_funcionario() {
        return rg_funcionario;
    }

    public void setRg_funcionario(String rg_funcionario) {
        this.rg_funcionario = rg_funcionario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail_funcionario() {
        return email_funcionario;
    }

    public void setEmail_funcionario(String email_funcionario) {
        this.email_funcionario = email_funcionario;
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

    public Telefone getTel() {
        return tel;
    }

    public void setTel(Telefone tel) {
        this.tel = tel;
    }
    
    
    
    

       
}
