import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(
                "Josue da Silva",
                "741.852.963-11",
                "josue@gmail.com",
                "51 - 9874563231"
        );

        Tutor tutor_1 = new Tutor(
                "Andressa Nunes",
                "123.456.789-00",
                "andy.nunes@gmail.com",
                "53 - 854.856.254-41"
        );

        Pet pet_1 = new Pet(
                "Preto",
                6,
                "Doberman",
                "Cao"
        );

        Veterinario vet_1 = new Veterinario(
                "Cleberson Silva",
                "941.735.249-54",
                "cleberson@vetmais.com.br",
                "51 - 987654321",
                784512,
                "Tarde"
        );


        pet_1.addTutor(tutor_1);
        tutor_1.addPet(pet_1);

        Consulta consulta_1 = new Consulta(vet_1, pet_1, tutor_1, 200, new Date(2022, 7, 20));
        Consulta consulta_2 = new Consulta(vet_1, pet_1, tutor_1, 300, new Date(2022, 8, 20));

        System.out.println("Info pet");
        pet_1.info_pet();
        System.out.println("\nPet info tutores");
        pet_1.info_tutores();


        System.out.println("\nInfo tutor");
        tutor_1.info_tutor();

        System.out.println("\nInfo veterinario");
        vet_1.info_veterinario();

        System.out.println("\nInfo Consulta 1");
        consulta_1.info_consulta();
        System.out.println("\nInfo Consulta 2");
        consulta_2.info_consulta();

    }
}