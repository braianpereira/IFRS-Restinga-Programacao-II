import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Banco> bancos = new ArrayList<>();
    static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("################################");
            System.out.println("1 - Gerenciar Bancos");
            System.out.println("2 - Gerenciar Pessoas");
            System.out.println("0 - Sair");

            opcao = functions.getInt();

            switch (opcao) {
                case 1 -> printMenuBancos();
                case 2 -> printMenuPessoas();
                case 0 -> System.exit(0);
            }
        }while (true);
    }

    public static void printMenuBancos(){
        int opcao;

        do {
            System.out.println("################################");
            System.out.println("1 - Listar bancos");
            System.out.println("2 - Cadastrar banco");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");

            opcao = functions.getInt();

            switch (opcao) {
                case 1 -> listaBancos();
                case 2 -> bancos.add(new Banco());
                case 0 -> System.exit(0);
            }
        }while (opcao != 9);

    }

    public static void printMenuPessoas(){
        int opcao;

        do {
            System.out.println("################################");
            System.out.println("1 - Listar pessoas");
            System.out.println("2 - Cadastrar pessoa");
            System.out.println("3 - Ver pessoa");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");

            opcao = functions.getInt();

            switch (opcao) {
                case 1 -> listaPessoas();
                case 2 -> pessoas.add(new Pessoa());
                case 0 -> System.exit(0);
            }
        }while (opcao != 9);

    }

    public static void printMenuPessoa(){
        int opcao;

        do {
            System.out.println("################################");
            System.out.println("################################");
            System.out.println("1 - Listar contas");
            System.out.println("2 - Cadastrar conta");
            System.out.println("2 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");

            opcao = functions.getInt();

            switch (opcao) {
                case 1 -> printMenuBancos();
                case 2 -> printMenuPessoas();
                case 0 -> System.exit(0);
            }
        }while (opcao != 9);

    }

    public static void listaBancos(){
        System.out.println("###################################");
        System.out.println("####           BANCOS          ####");

        for(int i = 0; i < bancos.size(); i++){
            System.out.println((i + 1) + " - ");
            bancos.get(i).infoBanco();
        }
    }

    public static void listaPessoas(){
        System.out.println("###################################");
        System.out.println("####           Pessoas          ####");

        for(int i = 0; i < pessoas.size(); i++){
            System.out.printf("%d - %s %s\n", (i + 1), pessoas.get(i).nome, pessoas.get(i).sobrenome);
        }
    }
}