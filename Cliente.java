package Sistema_Bancario;

public class Cliente {
    private String nome;
    private int cpf;
    private int idade;

    public Cliente(String nome, int cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public int getCpf(){
        return cpf;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }
}
