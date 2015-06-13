package modelo;

import java.sql.Date;

public class Checkin {
    
    private int id_Checkin;
    private Date data_chegada;
    private Date data_saida;
    private String hora_chegada;
    private String hora_saida;
    private int quantidade_hospede;
    private Funcionarios funcionarios;
    private Hospedes hospedes;
    private Quartos quartos;

    public Checkin() {
    }

    public Checkin(int id_Checkin, Date data_chegada, Date data_saida, String hora_chegada, String hora_saida, int quantidade_hospede, Funcionarios funcionarios, Hospedes hospedes, Quartos quartos) {
        this.id_Checkin = id_Checkin;
        this.data_chegada = data_chegada;
        this.data_saida = data_saida;
        this.hora_chegada = hora_chegada;
        this.hora_saida = hora_saida;
        this.quantidade_hospede = quantidade_hospede;
        this.funcionarios = funcionarios;
        this.hospedes = hospedes;
        this.quartos = quartos;
    }

    public int getId_Checkin() {
        return id_Checkin;
    }

    public void setId_Checkin(int id_Checkin) {
        this.id_Checkin = id_Checkin;
    }

    public Date getData_chegada() {
        return data_chegada;
    }

    public void setData_chegada(Date data_chegada) {
        this.data_chegada = data_chegada;
    }

    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    public String getHora_chegada() {
        return hora_chegada;
    }

    public void setHora_chegada(String hora_chegada) {
        this.hora_chegada = hora_chegada;
    }

    public String getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(String hora_saida) {
        this.hora_saida = hora_saida;
    }

    public int getQuantidade_hospede() {
        return quantidade_hospede;
    }

    public void setQuantidade_hospede(int quantidade_hospede) {
        this.quantidade_hospede = quantidade_hospede;
    }

    public Funcionarios getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionarios funcionarios) {
        this.funcionarios = funcionarios;
    }

    public Hospedes getHospedes() {
        return hospedes;
    }

    public void setHospedes(Hospedes hospedes) {
        this.hospedes = hospedes;
    }

    public Quartos getQuartos() {
        return quartos;
    }

    public void setQuartos(Quartos quartos) {
        this.quartos = quartos;
    }
    
    
    
    
    
    
}
