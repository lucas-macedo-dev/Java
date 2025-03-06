package Desafio_banco;

public class ContaPoupanca extends ContaBancaria {
    double taxa;

    public ContaPoupanca(double saldo, String nomeBanco, double taxa) {
        super(saldo, nomeBanco);
        this.taxa = taxa;
    }

    @Override
    public void depositar(double valor) {
        double valorAjustado = valor - (valor * taxa);
        super.depositar(valorAjustado);
    }

    @Override
    public String toString() {
        return "Essa é sua conta " + TipoConta.POUPANCA + " no banco: " + this.nomeBanco + " e você paga uma taxa de " + this.taxa * 100 + "% por depósito.";
    }
}
