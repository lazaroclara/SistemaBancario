package org.example;

public class ContaInvestimento extends ContaBancaria{
    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + (valor * 0.02);

        if(valorComTaxa <= saldo){
            saldo -= valorComTaxa;
            System.out.println("Seu saque de R$ " + valor + " foi concluído!");
            System.out.println("Taxa de retirada de 2% aplicada: R$ " + (valor * 0.02));
        }else{
            System.out.println("Saldo insuficiente!");
        }
        }
    }
