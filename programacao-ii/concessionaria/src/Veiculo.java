import java.util.Scanner;

public class Veiculo {

    private String fabricante;
    private String modelo;
    private String pais;
    private int pos_x;
    private int pos_y;
    private float valor;
    private int passageiros;

    Veiculo(){
        this.setFabricante("Não informado");
        this.setModelo("Não informado");
        this.setPais("Não informado");

        this.setPos_x(0);
        this.setPos_y(0);
        this.setPassageiros(0);
    }

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
        this.setPos_x(this.getPos_x() + x);
        this.setPos_y(this.getPos_y() + y);
    }

    public void info() {
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Pais: " + this.pais);
        System.out.println("Passageiros: " + (this.passageiros > 0 ? this.passageiros : "Não informado"));
        System.out.println("Posição X: " + this.pos_x);
        System.out.println("Posição Y: " + this.pos_y);
    }

    public float getValor() {
        return valor;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPais() {
        return pais;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }
}
