public class Aresta {
    public Vertice cidade1;
    public Vertice cidade2;
    public int distancia;

    Aresta(Vertice cidade1, Vertice cidade2, int distancia){
        this.cidade1 = cidade1;
        this.cidade2 = cidade2;
        this.distancia = distancia;
    }

    public void info_aresta() {
        System.out.println("Cidade 1: " + this.cidade1.nomeCidade);
        System.out.println("Cidade 2: " + this.cidade2.nomeCidade);
        System.out.println("Distancia: " + this.distancia);
    }
}
