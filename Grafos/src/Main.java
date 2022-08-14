public class Main {
    static Grafo grafo = new Grafo();

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("1 - Cadastrar cidade");
            System.out.println("2 - Cadastrar conexão");
            System.out.println("3 - Listar cidades");
            System.out.println("4 - Listar conexões");
            System.out.println("5 - Listar cidades vizinhas");
            System.out.println("6 - Sair");

            opcao = functions.getInt();
            switch (opcao){
                case 1 -> grafo.cadastra_cidade();
                case 2 -> grafo.cadastra_conexao();
                case 3 -> grafo.info_cidades();
                case 4 -> grafo.info_conexoes();
                case 5 -> listaVizinhos();
                case 6 -> System.exit(1);
            }

        }while(opcao != 6);
    }

    private static void listaVizinhos() {
        int cidade_index;

        grafo.info_cidades();

        if(grafo.cidades.size() > 0) {
            System.out.println("Selecione a cidade:");
            do {
                cidade_index = functions.getInt();
            } while (cidade_index < 0 && cidade_index >= grafo.cidades.size());

            grafo.cidades.get(cidade_index).info_vizinhos();
        }
    }
}