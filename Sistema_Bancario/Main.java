package Sistema_Bancario;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco(1, 10, 10);

        Cliente cliente1 = new Cliente("Paulo", "12345678901", 37);
        Cliente cliente2 = new Cliente("Maria", "09876543210", 28);
        Cliente cliente3 = new Cliente("Kauã", "23412356489", 20);

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarCliente(cliente3);

        Conta conta1 = new Conta("001", cliente1);
        Conta conta2 = new Conta("002", cliente2);
        Conta conta3 = new Conta("003", cliente3);

        banco.adicionarConta(conta1); 
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);

        banco.procurarConta("001");
        banco.procurarConta("002");
        banco.procurarConta("003");

        banco.listarContas();  

        conta2.depositar(1000);
        conta1.depositar(1000);
        conta3.depositar(9000);
        
        System.out.println("saldo da conta 1: " + conta1.getSaldo());
        System.out.println("saldo da conta 2: " + conta2.getSaldo());
        System.out.println("saldo da conta 3: " + conta3.getSaldo());

        conta1.transferir(2000, conta2);
        System.out.println("saldo da conta 1 após tentativa de transferência: " + conta1.getSaldo());
        System.out.println("saldo da conta 2 após tentativa de transferência: " + conta2.getSaldo());    }
}
