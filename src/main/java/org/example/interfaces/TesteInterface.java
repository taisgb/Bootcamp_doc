package org.example.interfaces;

public class TesteInterface {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(5000.0);
        contaCorrente.getSaldo();
        System.out.println("Saldo Conta Corrente após deposito: R$" + contaCorrente.getSaldo());
        contaCorrente.sacar(1000.0);
        System.out.println("Saldo Conta Corrente após saque: R$" + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(15000.0);
        contaPoupanca.getSaldo();
        System.out.println("Saldo da Conta Poupança após deposito: R$" + contaPoupanca.getSaldo());
        contaPoupanca.sacar(2000.0);
        System.out.println("Saldo da Conta Poupança após saque: R$" + contaPoupanca.getSaldo());


    }
}
