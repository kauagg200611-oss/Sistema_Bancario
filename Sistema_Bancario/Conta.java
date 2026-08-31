package Sistema_Bancario;

public class Conta {
    private String numeroConta;
    private Cliente titular;
    private double saldo;

    public Conta(String numeroConta, Cliente titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public Cliente getTitular(){
        return titular;
    }

    public void depositar(double valor){
        if(valor <= 0){
            return;
        }
        saldo += valor;
    }

    public boolean sacar(double valor){
        if(valor <= 0 || valor > saldo){
            return false;
        }
        saldo -= valor;
        return true;
    }

    public void transferir(double valor, Conta destino){
        if(sacar(valor)){
            destino.depositar(valor);
        }
    }
}
