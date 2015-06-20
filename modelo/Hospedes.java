package modelo;

public class Hospedes {
    
    private int id_hospede;
    private String nome_hospede;
    private String cpf_hospede;
    private String rg_hospede;
    private String endereco_hospede;
    private Cidades cidades;
    private String telefone;
    private String placa_veiculo;
    private String email;
    private String telefone1;
    private String telefone2;
    private String tipo_telefone;

    public Hospedes() {
    }

    public Hospedes(int id_hospede,String telefone1, String telefone2, String nome_hospede, String cpf_hospede, String rg_hospede, String endereco_hospede,String telefone, String placa_veiculo, String email, Cidades cidades, String tipo_telefone) {
        this.id_hospede = id_hospede;
        this.nome_hospede = nome_hospede;
        this.cpf_hospede = cpf_hospede;
        this.rg_hospede = rg_hospede;
        this.endereco_hospede = endereco_hospede;
        this.telefone = telefone;
        this.placa_veiculo = placa_veiculo;
        this.email = email;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
        this.cidades = cidades;
        this.tipo_telefone = tipo_telefone;
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

    public Cidades getCidades() {
        return cidades;
    }

    public void setCidades(Cidades cidades) {
        this.cidades = cidades;
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

    public String getTipo_Telefone() {
        return tipo_telefone;
    }

    public void setTipo_Telefone(String tipo_telefone) {
        this.tipo_telefone = tipo_telefone;
    }
    
    
    
    @Override
    public String toString() {
        return nome_hospede;
    }

    
}
