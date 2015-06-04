package modelo;

public class TipoTelefone {
    private int id_tipotelefone;
    private String nome_tipotelefone;

    public TipoTelefone() {
    }

    public TipoTelefone(int id_tipotelefone, String nome_tipotelefone) {
        this.id_tipotelefone = id_tipotelefone;
        this.nome_tipotelefone = nome_tipotelefone;
    }

    public int getId_tipotelefone() {
        return id_tipotelefone;
    }

    public void setId_tipotelefone(int id_tipotelefone) {
        this.id_tipotelefone = id_tipotelefone;
    }

    public String getNome_tipotelefone() {
        return nome_tipotelefone;
    }

    public void setNome_tipotelefone(String nome_tipotelefone) {
        this.nome_tipotelefone = nome_tipotelefone;
    }

    @Override
    public String toString() {
        return nome_tipotelefone;
    }
    
    
    
}
