package Sistema_Bancario;

public class ContaPoupanca extends Conta {
    private double rendimentoMes;

    public ContaPoupanca(String numeroConta, Cliente titular, double rendimentoMes) {
        super(numeroConta, titular);
        this.rendimentoMes = rendimentoMes;
    }

    public void aplicarRendimento(){
        double rendimento = getSaldo() * rendimentoMes;
        depositar(rendimento);
        System.out.println("Rendimento aplicado. Novo saldo: " + getSaldo() + "\n");
    }
}


