import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String especie;
    private String raca;
    private String nome;
    private int idade;
    private List<Tutor> tutores = new ArrayList<>();
    public List<Consulta> atendimentos = new ArrayList<>();

    Pet(String nome, int idade, String raca, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.especie = especie;
    }

    public void addTutor(Tutor t){
        this.tutores.add(t);
    }

    public void info_pet(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Raca: " + this.raca);
        System.out.println("Especie: " + this.especie);
    }

    public void info_tutores(){
        System.out.println("             TUTOR(ES)");
        for (int i = 0; i < this.tutores.size(); i++) {
            this.tutores.get(i).info_tutor();
        }
    }

    public void info_consultas(){
        double valor_total = 0;

        System.out.println("             Consultas");
        for(int i = 0; i < this.atendimentos.size(); i++){
            valor_total += this.atendimentos.get(i).valor;

            System.out.println("Consulta:");
            System.out.println("Valor: " + this.atendimentos.get(i).valor);
            System.out.println("Data: " + this.atendimentos.get(i).data.toString());

            System.out.println("Veterinário:");
            this.atendimentos.get(i).veterinario.info_veterinario();

            System.out.println("=====================================");
        }
        System.out.println("Valor total: " + valor_total);

        System.out.println("=====================================");
    }

    public void addConsulta(Consulta consulta) {
        this.atendimentos.add(consulta);
    }

}
