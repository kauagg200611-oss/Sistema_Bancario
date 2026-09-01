package Sistema_Bancario;

public class Banco {
    private int numeroBanco;   
    private Cliente[] clientes;
    private Conta[] contas;

    public Banco(int numeroBanco, int capacidadeClientes, int capacidadeContas) {
        this.numeroBanco = numeroBanco;
        this.clientes = new Cliente[capacidadeClientes];
        this.contas = new Conta[capacidadeContas];
    }

    public void adicionarCliente(Cliente cliente) {
        for (int i = 0; i < clientes.length; i++){
            if (clientes[i] == null && cliente != null){
                clientes[i] = cliente;
                System.out.println("Cliente adicionado com sucesso");
                break;
            }
        }
    }

    public void adicionarConta(Conta conta){
        if(conta == null){
            System.out.println("Conta inválida");
            return;
        }
        for (int i = 0; i < contas.length; i++){
            if (contas[i] == null){
                contas[i] = conta;
                System.out.println("Conta adicionada com sucesso");
                break;
            }
        }
        }
    }

    public int getNumeroBanco(){
        return numeroBanco;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public Conta[] getContas() {
        return contas;
    }
}
