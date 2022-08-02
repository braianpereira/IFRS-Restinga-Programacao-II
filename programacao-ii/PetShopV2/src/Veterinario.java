import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Pessoa{
    public int crmv;
    public List<Consulta> atendimentos = new ArrayList<>();
    public String turno;

    Veterinario(String nome, String cpf, String email, String telefone, int crmv, String turno) {
        super(nome, cpf, email, telefone);
        this.crmv = crmv;
        this.turno = turno;
    }

    public void info_veterinario() {
        System.out.println("Nome: " + this.getNomeCompleto());
        System.out.println("CRMV: " + this.crmv);
        System.out.println("Turno: " + this.turno);
    }

    public void info_consultas(){
        double valor_total = 0;

        System.out.println("             Consultas");
        for(int i = 0; i < this.atendimentos.size(); i++){
            valor_total += this.atendimentos.get(i).valor;

            System.out.println("Consulta:");
            System.out.println("Valor: " + this.atendimentos.get(i).valor);
            System.out.println("Data: " + this.atendimentos.get(i).data.toString());

            System.out.println("paciente:");
            this.atendimentos.get(i).paciente.info_pet();

            System.out.println("=====================================");
        }
        System.out.println("Valor total: " + valor_total);

        System.out.println("=====================================");
    }

    public void addConsulta(Consulta consulta) {
        this.atendimentos.add(consulta);
    }
}
