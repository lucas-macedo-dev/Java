package Desafio_banco;

public abstract class ContaBancaria implements Conta {
    protected Double saldo;
    protected String nomeBanco;

    public ContaBancaria(double saldo, String nomeBanco) {
        this.saldo = saldo;
        this.nomeBanco = nomeBanco;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O seu saldo é de: R$" + this.saldo);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Essa é sua conta no banco: ";
    }
}
