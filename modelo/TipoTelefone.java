package modelo;

public class TipoTelefone {
    private int id_tipo_telefone;
    private String nome_tipo_telefone;

    public TipoTelefone() {
    }

    public TipoTelefone(int id_tipo_telefone, String nome_tipo_telefone) {
        this.id_tipo_telefone = id_tipo_telefone;
        this.nome_tipo_telefone = nome_tipo_telefone;
    }

    public int getId_tipo_telefone() {
        return id_tipo_telefone;
    }

    public void setId_tipo_telefone(int id_tipo_telefone) {
        this.id_tipo_telefone = id_tipo_telefone;
    }

    public String getNome_tipo_telefone() {
        return nome_tipo_telefone;
    }

    public void setNome_tipo_telefone(String nome_tipo_telefone) {
        this.nome_tipo_telefone = nome_tipo_telefone;
    }

    @Override
    public String toString() {
        return nome_tipo_telefone;
    }
    
    
    
}
