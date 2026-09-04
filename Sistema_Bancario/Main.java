package Sistema_Bancario;

public class Main {
    public static void main(String[] args) {

        //Criando o banco
        Banco banco = new Banco(1, 10, 10);

        //Adicionando cliente
        Cliente cliente1 = new Cliente("Paulo", "12345678901", 37);
        
        //Adicionando cliente ao banco
        banco.adicionarCliente(cliente1);

        //Criando conta para o cliente
        Conta conta1 = new Conta("001", cliente1);

        //Adicionando conta ao banco
        banco.adicionarConta(conta1); 

        //Criando conta corrente para o cliente, com limite de crédito de 300.0, porém o cliente está sem saldo.
        ContaCorrente contaCorrente1 = new ContaCorrente("001", cliente1, 300.0);
        
        //Depositando 1000.0 na conta corrente, através do método depositar da classe Conta, que é herdado pela classe ContaCorrente.
        contaCorrente1.depositar(1000.0);

        //Tentando sacar 1300.0 da conta corrente, através do método sacar da classe ContaCorrente, que sobrescreve o método sacar da classe Conta.
        contaCorrente1.sacar(689.0);

    }   
}
