package Sistema_Bancario;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco(1, 10, 10);
        Banco banco2 = new Banco(2, 3 , 3);

        Cliente cliente1 = new Cliente("Paulo", "12345678901", 37);

        banco.adicionarCliente(cliente1);
        
        banco2.adicionarCliente(cliente1);

        Conta conta1 = new Conta("001", cliente1);

        banco2.adicionarConta(conta1);

        banco.adicionarConta(conta1); 

        banco.procurarConta("001");

        banco.listarContas(); 
        banco2.listarContas(); 

        conta1.depositar(1000);
        
        System.out.println("saldo da conta 1: " + conta1.getSaldo());

        System.out.println("saldo da conta 1 após tentativa de transferência: " + conta1.getSaldo());   

        banco.removerConta("001");
        banco.removerCliente("12345678901");
    }   
}
