package Sistema_Bancario;

public class Conta {
    private String numeroConta;
    private double saldo;
    private Cliente titular;

    public Conta(String numeroConta, double saldo, Cliente titular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
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

    public void sacar(double valor){
        if(valor <= 0 || valor > saldo){
            return;
        }
        saldo -= valor;
    }
}
