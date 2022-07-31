public class ContaPoupanca extends ContaBancaria{
    private double rendimento;
    private int saquesMensais;

    ContaPoupanca(Banco banco, Pessoa titular){
        this.banco = banco;
        this.titular = titular;
        this.saquesMensais = 3;
        this.saldo = 0;

        System.out.println("Número da conta:");
        this.setNroConta(functions.getInt());

        System.out.println("Informe a taxa mensal:");
        this.setRendimento(functions.getDouble());

        System.out.println("Informe a senha:");
        this.setSenha(functions.getStringSC());

    }

    public void info() {
        System.out.println("Banco: " + this.banco.getNome());
        System.out.println("Conta: " + this.getNroConta());
        System.out.println("Titular: " + this.titular.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Rendimento: " + this.getRendimento() + "%");
        System.out.println("Saques restantes no mes: " + this.getSaquesMensais());
        System.out.println("##############################################");
    }

    public void novoMes() {
        this.saquesMensais = 3;
        this.saldo *= this.rendimento;
    }

    public void saque() {
        if(this.getSaquesMensais() > 0){
            super.saque();
            this.saquesMensais--;
        } else {
            System.out.println("Limite mensal alcançado");
        }
    }

    public void saque(double valor) {
        if(this.getSaquesMensais() > 0){
            super.saque(valor);
        } else {
            System.out.println("Limite mensal alcançado");
        }
    }

    public double getRendimento(){ return this.rendimento; }

    public int getSaquesMensais() { return this.saquesMensais; }

    public void setRendimento(double rendimento){ this.rendimento = rendimento; }
}
