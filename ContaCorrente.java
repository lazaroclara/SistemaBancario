package org.example;

public class ContaCorrente extends ContaBancaria{
    public double limiteChequeEspecial;

    public ContaCorrente(int numeroConta, String titular, double saldo, double limiteChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = getSaldo() + limiteChequeEspecial;
        if(valor > 0 && valor <= saldoDisponivel){
            setSaldo(getSaldo() - valor);
            System.out.println("Seu saque de R$ " + valor + " foi concluído!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
    }
}
