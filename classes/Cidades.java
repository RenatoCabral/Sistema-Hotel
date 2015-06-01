package classes;

public class Cidades {
    
    private int id_cidades;
    private String nome_cidades;
    private int estados;

    public Cidades() {
    }

    public Cidades(int id_cidades, String nome_cidades, int estados) {
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

    public int getEstados() {
        return estados;
    }

    public void setEstados(int estados) {
        this.estados = estados;
    }
    
    

    @Override
    public String toString() {
        return id_cidades + " " + nome_cidades + " " + estados;
    }
    
    
    
}
