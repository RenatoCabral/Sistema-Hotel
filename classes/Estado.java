package classes;

public class Estado {
    
    private int id_estado;
    private String nome_estado;
    private String sigla;
    private int status;
   

    public Estado() {
    }

    public Estado(int id_estado, String nome_estado, String sigla, int status) {
        this.id_estado = id_estado;
        this.nome_estado = nome_estado;
        this.sigla = sigla;
        this.status = status;
      
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getNome_estado() {
        return nome_estado;
    }

    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    

    
  
}
