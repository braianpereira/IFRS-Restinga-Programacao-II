import java.util.ArrayList;
import java.util.List;

public class Tutor extends Pessoa {
    private List<Pet> pets = new ArrayList<>();

    Tutor(String nome, String cpf, String email, String telefone){
        super(nome, cpf, email, telefone);
    }

    public void info_tutor(){
        System.out.println(this.getNomeCompleto() + " - " + this.getEmail());
    }

    public void into_pets(){
        System.out.println("        PETS");

        for (int i = 0; i < this.pets.size(); i++){
            this.pets.get(i).info_pet();
            System.out.println("=============================");
        }
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }
}
