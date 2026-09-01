package Sistema_Bancario;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String cpf, int idade) {
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

    public String getCpf(){
        return cpf;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }
}
