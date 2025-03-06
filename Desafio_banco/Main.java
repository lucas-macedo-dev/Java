package Desafio_banco;

public class Main {
    public static void main(String[] args) {

        ContaCorrente Itau = new ContaCorrente(1000.00, "Itau");
        System.out.println(Itau);
        Itau.consultarSaldo();
        Itau.depositar(4534.67);
        Itau.consultarSaldo();

        System.out.println("=========================");

        ContaPoupanca Caixa = new ContaPoupanca(1000.00, "Caixa", 0.01);
        System.out.println(Caixa);
        Caixa.consultarSaldo();
        Caixa.depositar(4534.67);
        Caixa.consultarSaldo();
    }
}
