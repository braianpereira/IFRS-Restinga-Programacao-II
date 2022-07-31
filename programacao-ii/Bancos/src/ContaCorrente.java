import javax.swing.*;

public class ContaCorrente extends ContaBancaria{
    private double taxasMensais;

    ContaCorrente(Banco banco, Pessoa titular){
        this.banco = banco;
        this.titular = titular;
        this.saldo = 0;

        System.out.println("Número da conta:");
        this.setNroConta(functions.getInt());

        System.out.println("Informe a taxa mensal:");
        this.setTaxasMensais(functions.getDouble());

        System.out.println("Informe a senha:");
        this.setSenha(functions.getStringSC());
    }

    ContaCorrente(Banco banco, Pessoa titular, int nroConta, double txMensal, String senha){
        this.banco = banco;
        this.titular = titular;
        this.saldo = 0;
        this.setNroConta(nroConta);
        this.setTaxasMensais(txMensal);
        this.setSenha(senha);
    }

    public void info() {
        System.out.println("Banco: " + this.banco.getNome());
        System.out.println("Conta: " + this.getNroConta());
        System.out.println("Titular: " + this.titular.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Taxa mensal: " + this.getTaxasMensais());
        System.out.println("##############################################");
    }

    public void novoMes() {
        this.saldo -= this.taxasMensais;
    }

    public void setTaxasMensais(double taxasMensais){
        this.taxasMensais = taxasMensais;
    }

    public double getTaxasMensais() {
        return taxasMensais;
    }
}
