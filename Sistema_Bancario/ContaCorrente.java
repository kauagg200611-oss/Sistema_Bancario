package Sistema_Bancario;

public class ContaCorrente extends Conta {
    private double limiteCredito;

    public ContaCorrente(String numeroConta, Cliente titular, double limiteCredito) {
        super(numeroConta, titular);
        this.limiteCredito = limiteCredito;
    } 

    // Sobrescreve o método sacar para permitir que o cliente saque até o limite de crédito
    @Override
    public boolean sacar(double valor){
        if (valor <= 0 || valor > getSaldo() + limiteCredito) {
            System.out.println("Valor inválido ou excede o limite de crédito\n");
            return false;
        }
        super.sacarComLimite(valor);
        System.out.println("Saque realizado com sucesso. Novo saldo: " + getSaldo() + "\n");
        return true;
        }
    }
