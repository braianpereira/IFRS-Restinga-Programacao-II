public class Navio extends Maritimo{
    private String nome;

    Navio() {
        this.setNome("Não informado");
    }

    @Override
    public void info() {
        System.out.println("Nome: " + this.getNome());
        super.info();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
