import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vertice {
    public String nomeCidade;
    public Vector<Vertice> vizinhanca = new Vector<>();
    public Vector<Aresta> conexoes = new Vector<>();

    Vertice() {
        System.out.println("Nome");
        this.nomeCidade = functions.getStringSC();
    }

    public void info_vertice(){
        System.out.println("Cidade: " + this.nomeCidade);
    }

    public void info_vizinhos() {
        System.out.println("Vizinhos: ");
        for(Vertice vizinho : this.vizinhanca){
            System.out.println(vizinho.nomeCidade);
        }
    }

    public void info_conexoes() {
        for(Aresta aresta : this.conexoes){
            aresta.info_aresta();
            System.out.println("===============================");
        }
    }
}
