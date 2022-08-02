import java.util.Date;

public class Consulta {
    public Veterinario veterinario;
    public Pet paciente;
    public Tutor acompanhante;
    public double valor;
    public Date data;

    Consulta(Veterinario veterinario, Pet paciente, Tutor acompanhante, double valor, Date data){
        this.veterinario = veterinario;
        this.paciente = paciente;
        this.valor = valor;
        this.data = data;

        veterinario.addConsulta(this);
        paciente.addConsulta(this);
    }

    public void info_consulta(){
        System.out.println("Consulta:");
        System.out.println("Valor: " + this.valor);
        System.out.println("Data: " + this.data.toString());

        System.out.println("Veterinário:");
        this.veterinario.info_veterinario();
        System.out.println("Paciente:");
        this.paciente.info_pet();
    }
}
