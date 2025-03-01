package org.example;

public abstract class ContaBancaria {
    public int numeroConta;
    public String titular;
    public double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }else{
            System.out.println("Valor insuficiente para realizar depósito!");
        }
    }

    public abstract void sacar(double valor);

    public void exibirInformacoes(){
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$ %.2f\n" + this.saldo);
    }


}
