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

    public void adicionarCliente(Cliente cliente){

    // Verifica se o cliente é válido
    if(cliente == null){
        System.out.println("Cliente inválido\n");
        return;
    }

    // Verifica se o CPF já está cadastrado
    for(int i = 0; i < clientes.length; i++){
        if(clientes[i] != null && clientes[i].getCpf().equals(cliente.getCpf())){
            System.out.println("Cliente já cadastrado\n");
            return;
        }
    }

    // Procura espaço para adicionar o cliente
    for(int i = 0; i < clientes.length; i++){
        if(clientes[i] == null){
            clientes[i] = cliente;
            System.out.println("Cliente adicionado com sucesso\n");
            return;
        }
    }
    // Se chegou aqui, não existe espaço
    System.out.println("Não há espaço para adicionar o cliente\n");
}

    public void adicionarConta(Conta conta){
    if(conta == null){
        System.out.println("Conta inválida\n");
        return;
    }

    // Verifica se o número da conta já existe
    for(int i = 0; i < contas.length; i++){
        if(contas[i] != null && contas[i].getNumeroConta().equals(conta.getNumeroConta())){
            System.out.println("Conta já existe\n");
            return;
        }
    }
    // Verifica se o titular está cadastrado
    boolean titularEncontrado = false;

    for(int i = 0; i < clientes.length; i++){
        if(clientes[i] != null && clientes[i].equals(conta.getTitular())){
            titularEncontrado = true;
            System.out.println("Titular da conta encontrado\n");
            break;
        }
    }
    if(!titularEncontrado){
        System.out.println("Titular da conta não encontrado\n");
        return;
    }
    // Procura espaço para adicionar a conta
    for(int i = 0; i < contas.length; i++){
        if(contas[i] == null){
            contas[i] = conta;
            System.out.println("Conta adicionada com sucesso\n");
            return;
        }
    }
    // Se chegou aqui, não existe espaço
    System.out.println("Não há espaço para adicionar a conta\n");
}

    public void procurarConta(String numeroConta){
    if(numeroConta == null){
        System.out.println("Número da conta inválido\n");
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
    System.out.println("Conta não encontrada\n");
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
            System.out.println("Nenhuma conta cadastrada.\n");
            }
        }
    
    public void removerConta(String numeroConta){
        if(numeroConta == null){
            System.out.println("Número da conta inválido\n");
            return;
        }
        for(int i = 0; i < contas.length; i++){
            if(contas[i] != null && contas[i].getNumeroConta().equals(numeroConta)){
                contas[i] = null;
                System.out.println("Conta removida com sucesso\n");
                return;
            }
        }
        System.out.println("Conta não encontrada\n");
    }

    public void removerCliente(String cpf){
        if(cpf == null){
            System.out.println("CPF inválido\n");
            return;
        }
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] != null && clientes[i].getCpf().equals(cpf)){
                // Antes de remover o cliente, verifica se ele possui contas
                for(int j = 0; j < contas.length; j++){
                    if(contas[j] != null && contas[j].getTitular().equals(clientes[i])){
                        System.out.println("Não é possível remover o cliente, ele possui contas cadastradas\n");
                        return;
                    }
                }
                clientes[i] = null;
                System.out.println("Cliente removido com sucesso\n");
                return;
            }
        }
        System.out.println("Cliente não encontrado\n");
    }

    public void procurarCliente(String cpf){
        if(cpf == null){
            System.out.println("CPF inválido\n");
            return;
        }
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] != null && clientes[i].getCpf().equals(cpf)){
                System.out.println("Cliente encontrado: " + clientes[i].getNome() + ", CPF: " + clientes[i].getCpf() + ", Idade: " + clientes[i].getIdade());
                return;
            }
        }
    }

    public void listarClientes(){
        System.out.println("Clientes do banco " + numeroBanco + ":");
        boolean clientesExistem = false;
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] != null){
                System.out.println("Nome: " + clientes[i].getNome() + ", CPF: " + clientes[i].getCpf() + ", Idade: " + clientes[i].getIdade());
                clientesExistem = true;
            }
        }
        if(!clientesExistem){
            System.out.println("Nenhum cliente cadastrado.\n");
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
