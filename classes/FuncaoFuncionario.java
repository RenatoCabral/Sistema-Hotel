package classes;

public class FuncaoFuncionario {
    
    private int id_funcao;
    private String nome_funcao;

    public FuncaoFuncionario() {
    }

    public FuncaoFuncionario(int id_funcao, String nome_funcao) {
        this.id_funcao = id_funcao;
        this.nome_funcao = nome_funcao;
    }

    public int getId_funcao() {
        return id_funcao;
    }

    public void setId_funcao(int id_funcao) {
        this.id_funcao = id_funcao;
    }

    public String getNome_Funcao() {
        return nome_funcao;
    }

    public void setNome_Funcao(String nome_funcao) {
        this.nome_funcao = nome_funcao;
    }
    
    
    
}
