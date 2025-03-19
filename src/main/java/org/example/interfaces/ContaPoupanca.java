package org.example.interfaces;

public class ContaPoupanca implements Conta {
    private Double saldo = 23000.00;

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    public Double getSaldo() {
        return saldo;
    }
}
