package modelo;

public class Quartos {
    
    private int id_quarto;
    private int numero_quarto;
    private TiposDeQuartos tiposquartos;
    private String status;

    public Quartos() {
    }

    public Quartos(int id_quarto, int numero_quarto, TiposDeQuartos tiposquartos, String status) {
        this.id_quarto = id_quarto;
        this.numero_quarto = numero_quarto;
        this.tiposquartos = tiposquartos;
        this.status = status;
    }

    public int getId_quarto() {
        return id_quarto;
    }

    public void setId_quarto(int id_quarto) {
        this.id_quarto = id_quarto;
    }

    public int getNumero_quarto() {
        return numero_quarto;
    }

    public void setNumero_quarto(int numero_quarto) {
        this.numero_quarto = numero_quarto;
    }

    public TiposDeQuartos getTiposquartos() {
        return tiposquartos;
    }

    public void setTiposquartos(TiposDeQuartos tiposquartos) {
        this.tiposquartos = tiposquartos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return numero_quarto+ "/" +tiposquartos.toString();
    }
    
    
}
