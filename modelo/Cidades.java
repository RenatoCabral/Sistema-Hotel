package modelo;

public class Cidades {
    
    private int id_cidades;
    private String nome_cidades;
    private String estados;

    public Cidades() {
    }

    public Cidades(int id_cidades, String nome_cidades, String estados) {
        this.id_cidades = id_cidades;
        this.nome_cidades = nome_cidades;
        this.estados = estados;
    }

    public int getId_cidades() {
        return id_cidades;
    }

    public void setId_cidades(int id_cidades) {
        this.id_cidades = id_cidades;
    }

    public String getNome_cidades() {
        return nome_cidades;
    }

    public void setNome_cidades(String nome_cidades) {
        this.nome_cidades = nome_cidades;
    }

    public String getEstados() {
        return estados;
    }

    public void setEstados(String estados) {
        this.estados = estados;
    }
    
    

    @Override
    public String toString() {
        return nome_cidades;
    }
    
    
    
}
