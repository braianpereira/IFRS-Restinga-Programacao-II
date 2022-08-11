import java.util.Scanner;

public class Livro {
    private String titulo;
    private String editora;
    private String area;
    private int ano;
    private float valor;

    public Livro() {
        Scanner sc = new Scanner(System.in);
        String titulo, editora, area;
        int ano;
        float valor;

        System.out.println("Informe o título do livro: ");
        titulo = sc.nextLine();
        System.out.println("Informe a Editora do livro: ");
        editora = sc.nextLine();
        System.out.println("Informe a Área do livro: ");
        area = sc.nextLine();
        System.out.println("Informe o ano do livro: ");
        ano = sc.nextInt();
        System.out.println("Informe o valor do livro: ");
        valor = sc.nextFloat();

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
