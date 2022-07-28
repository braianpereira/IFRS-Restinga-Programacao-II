import java.util.Scanner;

public abstract class ContaBancaria {
    protected Pessoa titular;
    protected Banco banco;
    protected int nroConta;
    protected double saldo;
    protected String senha;

    public void saque(){
        double valor;

        System.out.println("Informe o valor:");
        valor = functions.getDouble();

        this.saque(valor);
    }

    public void saque(double valor){
        if (verificaSenha()){
            if(this.saldo - valor >= 0){
                this.saldo -= valor;
                System.out.println("Sacado R$ " + valor);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }
    }

    public void deposito(){
        double valor;

        System.out.println("Informe o valor:");
        valor = functions.getDouble();

        this.deposito(valor);
    }

    public void deposito(double deposito) {
        this.saldo += deposito;

        System.out.println("Valor depositado");
    }

    public boolean verificaSenha() {
        Scanner sc = new Scanner(System.in);
        String senha;

        System.out.println("Informe a senha:");
        senha = sc.nextLine();

        sc.close();

        return this.verificaSenha(senha);
    }

    public boolean verificaSenha(String senha) {
        return senha == this.senha;
    }

    public void info(){

    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }

    public int getNroConta() {
        return nroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
