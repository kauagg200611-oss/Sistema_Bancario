package Sistema_Bancario;

public class Banco {
    private int numeroBanco;   
    private Cliente[] clientes;
    private Conta[] contas;

    /* 1 - O código deve verificar se ainda existe vetores vazios para q uma conta nova possa ocupar aqle lugar;
    2 - Usar ArrayList */
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

    public void adicionarConta(Conta conta, Cliente cliente){
        if(conta == null || cliente == null){
            System.out.println("Conta ou cliente inválido");
            return;
        }
        for (int i = 0; i < contas.length; i++){
            for (int j = 0; j < clientes.length; j++){
                if (contas[i] == null && clientes[j] != null && clientes[j] == cliente){
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
