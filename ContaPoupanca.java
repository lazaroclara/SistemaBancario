package org.example;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Seu saque de R$ " + valor + " foi concluído!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
