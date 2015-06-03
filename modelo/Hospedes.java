package modelo;

public class Hospedes {
    
    private int id_hospede;
    private String nome_hospede;
    private String cpf_hospede;
    private String rg_hospede;
    private String endereco_hospede;
    private String cidade;
    private String telefone;
    private String placa_veiculo;
    private String email;
    private String observacao;

    public Hospedes() {
    }

    public Hospedes(int id_hospede, String nome_hospede, String cpf_hospede, String rg_hospede, String endereco_hospede, String cidade, String telefone, String placa_veiculo, String email, String observacao) {
        this.id_hospede = id_hospede;
        this.nome_hospede = nome_hospede;
        this.cpf_hospede = cpf_hospede;
        this.rg_hospede = rg_hospede;
        this.endereco_hospede = endereco_hospede;
        this.cidade = cidade;
        this.telefone = telefone;
        this.placa_veiculo = placa_veiculo;
        this.email = email;
        this.observacao = observacao;
    }

    public int getId_hospede() {
        return id_hospede;
    }

    public void setId_hospede(int id_hospede) {
        this.id_hospede = id_hospede;
    }

    public String getNome_hospede() {
        return nome_hospede;
    }

    public void setNome_hospede(String nome_hospede) {
        this.nome_hospede = nome_hospede;
    }

    public String getCpf_hospede() {
        return cpf_hospede;
    }

    public void setCpf_hospede(String cpf_hospede) {
        this.cpf_hospede = cpf_hospede;
    }

    public String getRg_hospede() {
        return rg_hospede;
    }

    public void setRg_hospede(String rg_hospede) {
        this.rg_hospede = rg_hospede;
    }

    public String getEndereco_hospede() {
        return endereco_hospede;
    }

    public void setEndereco_hospede(String endereco_hospede) {
        this.endereco_hospede = endereco_hospede;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPlaca_veiculo() {
        return placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
    
    
    
}
