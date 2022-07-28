public class ContaCorrente extends ContaBancaria{
    private double taxasMensais;

    public void info() {
        System.out.printf("Banco: " + this.banco.getNome());
        System.out.printf("Conta: " + this.getNroConta());
        System.out.printf("Titular: " + this.titular.getNome());
        System.out.printf("Saldo: " + this.getSaldo());
        System.out.printf("Taxa mensal: " + this.getTaxasMensais());
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
