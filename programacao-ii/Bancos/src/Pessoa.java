import javax.swing.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public int idade;
    private String cpf;
    private List<ContaBancaria> contasBancarias = new ArrayList<>();

    Pessoa(){
//        Scanner sc = new Scanner(System.in);

//        System.out.println("Nome: ");
        this.setNome(JOptionPane.showInputDialog("Nome:"));

//        System.out.println("Sobrenome: ");
        this.setSobrenome(JOptionPane.showInputDialog("Sobrenome:"));

//        System.out.println("CPF: ");
        this.setCpf(JOptionPane.showInputDialog("CPF:"));

//        sc.close();

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

    public void infoContas() {
        if (contasBancarias.size() > 0) {
            for(int i = 0; i < contasBancarias.size(); i++){
                System.out.println("ID: " + i + " ");
                contasBancarias.get(i).info();
            }
        } else {
            System.out.println("Nenhuma conta cadastrada");
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

    public void addConta(ContaBancaria ct){
        System.out.println(ct);
        this.contasBancarias.add(ct);
    }

    public ContaBancaria getConta(int contaIndex){
//        if (contaIndex <= this.contasBancarias.size())
            return this.contasBancarias.get(contaIndex);

//        return null;
    }

    public int getContasSize() {
        return this.contasBancarias.size();
    }

    public void virarMesContas() {
        for (ContaBancaria conta: contasBancarias){
            conta.novoMes();
        }
    }
}
