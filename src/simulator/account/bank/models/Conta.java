package simulator.account.bank.models;

public class Conta {
    private String titularConta;
    private String cpf;
    private double saldoConta;
    private boolean contaCorrente;
    private boolean contaPoupanca;


    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        if (saldoConta<0){
            System.out.println("ERRO: saldo insuficiente");

        }else this.saldoConta = saldoConta;
    }

    public boolean isContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(boolean contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public boolean isContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(boolean contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
