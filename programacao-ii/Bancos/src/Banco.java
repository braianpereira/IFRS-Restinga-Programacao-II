import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private String nome;
    private String cnpj;
    private int nroBanco;
    private List<ContaBancaria> contasBancaria = new ArrayList<>();

    Banco() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        this.setNome(sc.nextLine());
//        this.setNome(functions.getString("Nome:"));
        System.out.println("CNPJ: ");
        this.setCnpj(sc.nextLine());
//        this.setCnpj(functions.getString("CNPJ:"));
        System.out.println("Número Banco: ");
        this.setNroBanco(functions.getInt());

    }

    Banco(String nome, String cnpj, int nroBanco){
        this.setNome(nome);
        this.setCnpj(cnpj);
        this.setNroBanco(nroBanco);
    }

    public void infoBanco(){
        System.out.printf("Banco %s - AG %s - %s\n", this.getNome(), this.getNroBanco(), this.getCnpj());
    }

    public void infoContas() {
        System.out.println("Em manutenção");
    }

    public void criarConta() {
        System.out.println("Em manutenção");
    }

    public void fecharConta() {
        System.out.println("Em manutenção");
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setNroBanco(int nroBanco){
        this.nroBanco = nroBanco;
    }

    public int getNroBanco() {
        return this.nroBanco;
    }
}
