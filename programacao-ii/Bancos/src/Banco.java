import java.util.List;

public class Banco {
    private String nome;
    private String cnpj;
    private int nroBanco;
    private List<String> contaBancaria;

    public void InfoBanco(){
        System.out.printf("Banco %s - AG %s - %s\n", this.nome, this.nroBanco, this.cnpj);
    }

    public void InfoContas() {
        System.out.println("Em manutenção");
    }

    public void CriarConta() {
        System.out.println("Em manutenção");
    }

    public void FecharConta() {
        System.out.println("Em manutenção");
    }
}
