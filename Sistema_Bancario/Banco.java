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

    // Verifica se o número da conta já existe
    for(int i = 0; i < contas.length; i++){
        if(contas[i] != null && contas[i].getNumeroConta().equals(conta.getNumeroConta())){
            System.out.println("Conta já existe");
            return;
        }
    }
    // Verifica se o titular está cadastrado
    boolean titularEncontrado = false;

    for(int i = 0; i < clientes.length; i++){
        if(clientes[i] != null && clientes[i].equals(conta.getTitular())){
            titularEncontrado = true;
            System.out.println("Titular da conta encontrado");
            break;
        }
    }
    if(!titularEncontrado){
        System.out.println("Titular da conta não encontrado");
        return;
    }
    // Procura espaço para adicionar a conta
    for(int i = 0; i < contas.length; i++){
        if(contas[i] == null){
            contas[i] = conta;
            System.out.println("Conta adicionada com sucesso");
            return;
        }
    }
    // Se chegou aqui, não existe espaço
    System.out.println("Não há espaço para adicionar a conta");
}

    public void procurarConta(String numeroConta){
    if(numeroConta == null){
        System.out.println("Número da conta inválido");
        return;
    }

    for(int i = 0; i < contas.length; i++){
        if(contas[i] != null && contas[i].getNumeroConta().equals(numeroConta)){
            System.out.println("Conta encontrada: " + contas[i].getNumeroConta()
                    + ", Titular: " + contas[i].getTitular().getNome()
                    + ", Saldo: " + contas[i].getSaldo());
            return;
        }
    }
    System.out.println("Conta não encontrada");
}

    public void listarContas(){
        System.out.println("Contas do banco " + numeroBanco + ":");
        boolean contasExistem = false;
        for(int i = 0; i < contas.length; i++){
            if(contas[i] != null){
                System.out.println("Número da conta: " + contas[i].getNumeroConta() + ", Titular: " + contas[i].getTitular().getNome() + ", Saldo: " + contas[i].getSaldo());
                contasExistem = true;
            }
        }
        if(!contasExistem){
            System.out.println("Nenhuma conta cadastrada.");
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
