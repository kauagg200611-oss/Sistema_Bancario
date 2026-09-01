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
        Boolean titularEncontrado = false;
        if(conta == null){
            System.out.println("Conta inválida");
            return;
        }
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] != null && clientes[i].equals(conta.getTitular())){
                titularEncontrado = true;
                System.out.println("Titular da conta encontrado");
                break;
            } else {
                continue;
            }
        }
        if(!titularEncontrado){
            System.out.println("Titular da conta não encontrado");
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

    public Conta procurarConta(String numeroConta){

    if(numeroConta == null){
        System.out.println("Número da conta inválido");
        return null;
    }

    for(int i = 0; i < contas.length; i++){

        if(contas[i] != null && contas[i].getNumeroConta().equals(numeroConta)){
            return contas[i];
        }
    }

    System.out.println("Conta não encontrada");
    return null;
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
