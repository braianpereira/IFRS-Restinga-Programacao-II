import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("###             LIVRARIA               ###");
        System.out.println("###  1 - Cadastrar novo livro          ###");
        System.out.println("###  2 - Listar livros                 ###");
        System.out.println("###  3 - Buscar livros por nome        ###");
        System.out.println("###  4 - Buscar livros por categoria   ###");
        System.out.println("###  5 - Buscar livros por preço       ###");
        System.out.println("###  0 - Encerrar atividades           ###");
        System.out.println("##########################################");
        System.out.println("##########################################");
        System.out.println("###  Escolha uma opção                  ##");

        return sc.nextInt();
    }


    public static void main(String[] args) {

        int op;

        ArrayList<Livro> livros = new ArrayList<>();

        do {
            op = menu();


            switch (op) {
                case 0 -> System.out.println("GoodBye!!!");
                case 1 -> livros = insereNovoLivro(livros);
                case 2 -> listarLivro(livros);
                case 3 -> livrosPorNome(livros);
                case 4 -> livrosPorCategoria(livros);
                case 5 -> livrosPorPreco(livros);
                default -> System.out.println("Opção inválida!!!");
            }

        } while (op != 0);

    }

    private static void livrosPorPreco(ArrayList<Livro> livros) {
        Scanner sc = new Scanner(System.in);
        Float valor;

        System.out.println("### Informe o valor para busca:");
        valor = sc.nextFloat();

        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getValor() == valor)
                livros.get(i).info();
        }
    }

    private static void livrosPorCategoria(ArrayList<Livro> livros) {
        Scanner sc = new Scanner(System.in);
        String categoria;

        System.out.println("### Informe o categoria para busca:");
        categoria = sc.nextLine();

        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getArea().compareTo(categoria) == 0)
                livros.get(i).info();
        }
    }

    private static void livrosPorNome(ArrayList<Livro> livros) {
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("### Informe o titulo para busca:");
        nome = sc.nextLine();

        for(int i = 0; i < livros.size(); i++){
            if(livros.get(i).getTitulo().compareTo(nome) == 0)
                livros.get(i).info();
        }
    }

    private static void listarLivro(ArrayList<Livro> livros) {
        for(int i = 0; i < livros.size(); i++){
            livros.get(i).info();
        }
    }

    private static ArrayList insereNovoLivro(ArrayList<Livro> livros) {
        livros.add(new Livro());

        return livros;

    }
}