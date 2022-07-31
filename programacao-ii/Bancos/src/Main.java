import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Banco> bancos = new ArrayList<>();
    static List<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;

        bancos.add(new Banco("Itau", "741852963123", 123));
        bancos.add(new Banco("BB", "741852963124", 124));
        bancos.add(new Banco("Bradesco", "741852963125", 125));

        pessoas.add(new Pessoa("Braian", "Pereira", "741852963", 22));
        pessoas.get(0).addConta(new ContaCorrente(bancos.get(0), pessoas.get(0), 147,20,"123"));

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
            System.out.println("3 - Virar mes");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");

            opcao = functions.getInt();

            switch (opcao) {
                case 1 -> listaBancos();
                case 2 -> bancos.add(new Banco());
                case 3 -> virarMes();
                case 0 -> System.exit(0);
            }
        }while (opcao != 9);

    }

    private static void virarMes() {
        for(Pessoa pessoa: pessoas){
            pessoa.virarMesContas();
        }
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
                case 3 -> printMenuPessoa();
                case 0 -> System.exit(0);
            }
        }while (opcao != 9);

    }

    public static void printMenuPessoa(){
        int opcao;
        int pessoaIndex;
        Pessoa pessoa;

        do{
            listaPessoas();

            System.out.print("Selecione uma pessoa: ");

            pessoaIndex = functions.getInt();

        } while (pessoaIndex < 0 || pessoaIndex > pessoas.size());

        pessoa = pessoas.get(pessoaIndex);


        do {
            System.out.println("################################");
            System.out.println("1 - Listar contas");
            System.out.println("2 - Cadastrar conta");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("9 - Voltar");
            System.out.println("0 - Sair");

            opcao = functions.getInt();

            switch (opcao) {
                case 1 -> pessoa.infoContas();
                case 2 -> cadastrarConta(pessoaIndex);
                case 3 -> sacar(pessoaIndex);
                case 4 -> depositar(pessoaIndex);
                case 0 -> System.exit(0);
            }
        }while (opcao != 9);
    }

    public static void listaBancos(){
        if(bancos.size() == 0){
            System.out.println("Nenhum banco cadastrado");
        } else {
            System.out.println("###################################");
            System.out.println("####           BANCOS          ####");

            for (int i = 0; i < bancos.size(); i++) {
                System.out.print((i) + " - ");
                bancos.get(i).infoBanco();
            }
        }
    }

    public static void listaPessoas(){
        if(pessoas.size() == 0){
            System.out.println("Nenhuma pessoa cadastrada");
        } else {
            System.out.println("###################################");
            System.out.println("####           Pessoas         ####");

            for (int i = 0; i < pessoas.size(); i++) {
                System.out.printf("%d - %s %s\n", (i), pessoas.get(i).nome, pessoas.get(i).sobrenome);
            }
        }
    }

    public static void cadastrarConta(int pessoaIndex){
        int bancoIndex;
        int tipoConta;

        if(bancos.size() > 0){
            do {
                listaBancos();

                bancoIndex = functions.getInt();
                System.out.println("Selecione um banco");

            } while (bancos.get(bancoIndex) == null);


            System.out.println("Selecione um tipo de conta");
            System.out.println("1 - Corrente");
            System.out.println("2 - Poupanca");
            do{
                tipoConta = functions.getInt();
            }while(tipoConta != 1 && tipoConta != 2);

            if(tipoConta == 1){
                Pessoa p = pessoas.get(pessoaIndex);
                p.addConta(new ContaCorrente(bancos.get(bancoIndex), pessoas.get(pessoaIndex)));
            } else {
                pessoas.get(pessoaIndex).addConta(new ContaPoupanca(bancos.get(bancoIndex), pessoas.get(pessoaIndex)));
            }

        } else {
            System.out.println("Crie um banco antes");
        }
    }

    public static void sacar(int pessoaIndex) {
        int contaIndex;

        System.out.println("Selecione a conta a sacar: ");
        pessoas.get(pessoaIndex).infoContas();

        do{
            contaIndex = functions.getInt();
        }while (contaIndex < 0 || contaIndex > pessoas.get(pessoaIndex).getContasSize());

        pessoas.get(pessoaIndex).getConta(contaIndex).saque();
    }

    public static void depositar(int pessoaIndex) {
        int contaIndex;

        System.out.println("Selecione a conta a depositar: ");
        pessoas.get(pessoaIndex).infoContas();

        do{
            contaIndex = functions.getInt();

        }while (contaIndex < 0 || contaIndex > pessoas.get(pessoaIndex).getContasSize());

        pessoas.get(pessoaIndex).getConta(contaIndex).deposito();
    }
}