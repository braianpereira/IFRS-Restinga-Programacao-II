public class Livro {
    private String titulo;
    private String editora;
    private String area;
    private int ano;
    private float valor;

    public Livro(String titulo, String editora, String area, int ano, float valor) {
        this.titulo = titulo;
        this.editora = editora;
        this.area = area;

        this.ano = 0;

        if(ano > 0)
            this.ano = ano;

        this.valor = 0;

        if(valor >= 0)
            this.valor = valor;
    }

    public void info() {
        System.out.printf("\n###  Título/Editora: %s/%s", this.titulo, this.editora);
        System.out.printf("\n###  Categoria: %s", this.area);
        System.out.printf("\n###  Ano: %d", this.ano);
        System.out.printf("\n###  Valor R$: %.2f", this.valor);
        System.out.println("\n");
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getArea() {
        return this.area;
    }

    public float getValor() {
        return this.valor;
    }
}
