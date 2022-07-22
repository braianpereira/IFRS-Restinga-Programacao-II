import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

        Veiculo v;

        v = new Veiculo();

        veiculos.add(new Veiculo());
        veiculos.add(new Terrestre());
        veiculos.add(new Carro());
        veiculos.add(new Caminhao());
        veiculos.add(new Moto());
        veiculos.add(new Aereo());
        veiculos.add(new Aviao());
        veiculos.add(new Helicoptero());
        veiculos.add(new Maritimo());
        veiculos.add(new Navio());
        veiculos.add(new Submarino());

        veiculos.forEach((veiculo -> {
            System.out.println("=================================================");
            veiculo.info();

        }));

    }
}