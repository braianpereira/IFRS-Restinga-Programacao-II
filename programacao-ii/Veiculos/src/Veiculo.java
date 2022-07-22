import java.util.Scanner;

public class Veiculo {

    String fabricante;
    String modelo;
    String pais;
    int pos_x;
    int pos_y;
    float valor;
    int passageiros;

    public void deslocamento(){
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Informe a posição x");
        x = sc.nextInt();

        System.out.println("Informe a posição y");
        y = sc.nextInt();


        this.deslocamento(x, y);
    }

    public void deslocamento(int x, int y){
        this.pos_x += x;
        this.pos_y += y;
    }
}
