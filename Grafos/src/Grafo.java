import java.util.Vector;

public class Grafo {
    public Vector<Vertice> cidades = new Vector<>();
    public Vector<Aresta> conexoes = new Vector<>();

    public void cadastra_cidade() {
        this.cidades.add(new Vertice());
    }

    public  void cadastra_conexao() {
        int cidade1_index;
        int cidade2_index;
        int distancia;

        if(this.cidades.size() < 2){
            System.out.println("Cadastre pelo menos 2 cidades");
        } else {

            this.info_cidades();
            do {
                System.out.println("Selecione a cidade 1: ");
                cidade1_index = functions.getInt();
            } while (cidade1_index < 0 && cidade1_index >= this.cidades.size());

            System.out.println("Cidade " + this.cidades.get(cidade1_index).nomeCidade + " escolhida");

            this.info_cidades();
            do {
                System.out.println("Selecione a cidade 2: ");
                cidade2_index = functions.getInt();

                if(cidade1_index == cidade2_index){
                    System.out.println("A cidade 2 precisa ser diferente da cidade 1");
                }
            } while (cidade1_index == cidade2_index || cidade2_index < 0 && cidade2_index >= this.cidades.size());

            System.out.println("Cidade " + this.cidades.get(cidade2_index).nomeCidade + " escolhida");

            System.out.println("Informe a distancia(int):");
            distancia = functions.getInt();

            conexoes.add(
                    new Aresta(
                            this.cidades.get(cidade1_index),
                            this.cidades.get(cidade2_index),
                            distancia
                    )
            );

            this.cidades.get(cidade1_index).vizinhanca.add(this.cidades.get(cidade2_index));
            this.cidades.get(cidade2_index).vizinhanca.add(this.cidades.get(cidade1_index));

            this.cidades.get(cidade1_index).conexoes.add(this.conexoes.lastElement());
            this.cidades.get(cidade2_index).conexoes.add(this.conexoes.lastElement());

        }

    }

    public void info_cidades(){
        System.out.println("##########################");
        System.out.println("##        CIDADES       ##");

        if(cidades.size() > 0) {
            for (int i = 0; i < cidades.size(); i++) {
                System.out.print("# " + i + " - ");
                cidades.get(i).info_vertice();
            }
            System.out.println("------------------------");
        } else {
            System.out.println("Nenhuma cidade cadastrada");
        }
    }

    public void info_conexoes(){
        System.out.println("##########################");
        System.out.println("##       CONEXOES       ##");

        if(conexoes.size() > 0) {
            for (int i = 0; i < conexoes.size(); i++) {
                System.out.println("# " + i);
                conexoes.get(i).info_aresta();
                System.out.println("------------------------");
            }
        } else {
            System.out.println("Nenhuma conexao cadastrada");
        }
    }
}
