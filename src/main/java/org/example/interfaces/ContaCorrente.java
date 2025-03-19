package org.example.interfaces;

public class ContaCorrente implements Conta {
    private Double saldo = 1000.00;
    private final Double taxaOperacao = 0.60;

    @Override
    public void depositar(Double valor) {
        this.saldo += valor - taxaOperacao;

    }

    public void sacar(Double valor) {
        this.saldo -= valor - taxaOperacao;
    }

    public Double getSaldo(){
        return this.saldo;
    }
}
