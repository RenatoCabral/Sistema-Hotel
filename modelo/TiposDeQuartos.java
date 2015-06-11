package modelo;

public class TiposDeQuartos {
    
    private int id_TiposQuartos;
    private String descrição;
    private Double valor;

    public TiposDeQuartos() {
    }

    public TiposDeQuartos(int id_TiposQuartos, String descrição, Double valor) {
        this.id_TiposQuartos = id_TiposQuartos;
        this.descrição = descrição;
        this.valor = valor;
    }

    public int getId_TiposQuartos() {
        return id_TiposQuartos;
    }

    public void setId_TiposQuartos(int id_TiposQuartos) {
        this.id_TiposQuartos = id_TiposQuartos;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descrição;
    }
    
    
    
    
    
    
    
    
}
