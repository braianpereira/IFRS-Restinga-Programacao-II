import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    private String nome_completo;
    private String cpf;
    private String endereco;
    private List<String> telefone = new ArrayList<>();
    private String email;

    Pessoa(){
        Scanner sc = new Scanner(System.in);
        boolean novo;

        System.out.println("Nome:");
        this.setNome_completo(sc.nextLine());
        this.setCpf(sc.nextLine());
        this.setEmail(sc.nextLine());
        this.setEndereco(sc.nextLine());
        do {
            System.out.println("Telefone:");
            this.setTelefone(sc.nextLine());
            System.out.println("Inserir mais 1 telefone S ou N:");
            novo = sc.nextLine().equals("S");
        }while(novo);
    }

    Pessoa(String nome, String cpf, String email, String telefone){
        this.setNome_completo(nome);
        this.setCpf(cpf);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public void info_pessoa(){
        System.out.println("Nome: " + this.getNomeCompleto());
        System.out.println("E-mail: " + this.getEmail());
        System.out.println("CPF: " + this.getCpf());
        if (this.endereco.length() > 0)
            System.out.println("Endereco: " + this.getEndereco());
    }

    public void info_contato(){
        for(int i = 0; i < telefone.size(); i++){
            System.out.println("Telefone " + (i + 1) + ": " +telefone.get(i));
        }
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNomeCompleto() {
        return this.nome_completo;
    }

    public void setNome_completo(String nome){
        this.nome_completo = nome;
    }

    public List<String> getTelefone() {
        return telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone.add(telefone);
    }
}
