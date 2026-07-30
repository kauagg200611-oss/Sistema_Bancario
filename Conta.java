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

    public void depositar(double deposito){
        if(deposito <= 0){
            return;
        }else{
            System.out.println("Deposito realizado com sucesso !");
        }
        saldo += deposito;
    }
}
