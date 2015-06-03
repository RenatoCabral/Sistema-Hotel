package modelo;

public class Telefone {
    
    private int id_telefone;
    private String numero;

    public Telefone() {
    }

    public Telefone(int id_telefone, String numero) {
        this.id_telefone = id_telefone;
        this.numero = numero;
    }

    public int getId_telefone() {
        return id_telefone;
    }

    public void setId_telefone(int id_telefone) {
        this.id_telefone = id_telefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
}
