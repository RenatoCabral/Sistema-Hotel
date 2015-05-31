package classes;

public class TiposDeQuartos {
    
    private int id_TiposQuartos;
    private String descrição;

    public TiposDeQuartos() {
    }

    public TiposDeQuartos(int id_TiposQuartos, String descrição) {
        this.id_TiposQuartos = id_TiposQuartos;
        this.descrição = descrição;
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
    
    
    
}
