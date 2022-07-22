public class VeiculoTerrestre {
    private String placa;
    int kms, ano_fab;
    String tipoVenda;
    String modelo;
    String fabricante;

    VeiculoTerrestre(String modelo, String fabricante, int ano_fab){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano_fab = ano_fab;
    }

}
