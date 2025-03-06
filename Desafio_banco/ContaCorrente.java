package Desafio_banco;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldo, String nomeBanco) {
        super(saldo, nomeBanco);
    }

    public String toString() {
        return "Essa é sua conta " + TipoConta.CORRENTE + " no banco: " + this.nomeBanco;
    }
}
