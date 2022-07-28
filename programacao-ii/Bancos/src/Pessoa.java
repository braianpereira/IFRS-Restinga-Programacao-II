import java.util.List;
import java.util.Scanner;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;
    private String cpf;
    private List<ContaBancaria> contasBancarias;

    Pessoa(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        this.setNome(sc.nextLine());

        System.out.println("Sobrenome: ");
        this.setSobrenome(sc.nextLine());

        System.out.println("CPF: ");
        this.setCpf(sc.nextLine());

    }

    Pessoa(String nome, String sobrenome, String cpf, int idade){
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setIdade(idade);
        this.setCpf(cpf);
    }

    public void info(){
        System.out.printf("Nome: %s %s\n", this.getNome(), this.getSobrenome());
        System.out.println("Idade: " + this.getIdade());
    }

    public void inforConas() {
        for (ContaBancaria ct : contasBancarias){
            ct.info();
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }
}
