public abstract class ContaBancaria {
    protected Pessoa titular;
    protected Banco banco;
    protected int nroConta;
    protected double saldo;
    protected String senha;

    public void saque(){
        System.out.println("Em manutenção");
    }

    public void deposito() {
        System.out.println("Em manutenção");
    }

    public boolean verificaSenha() {
        System.out.println("Em manutenção");

        return false;
    }
}
