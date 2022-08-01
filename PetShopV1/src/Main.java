public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Josue da Silva", "741.852.963-11", "josue@gmail.com", "51 - 9874563231");

        Tutor tutor_1 = new Tutor("Andressa Nunes", "123.456.789-00", "andy.nunes@gmail.com", "53 - 854.856.254-41");

        Pet pet_1 = new Pet(tutor_1, "Preto", 6, "Doberman", "Cao");

        pet_1.info_pet();
        pet_1.info_tutores();

    }
}