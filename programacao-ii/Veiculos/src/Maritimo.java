public class Maritimo extends Veiculo {
    String codigo;
    String empresa;

    public void compra(String empresa, float valor){
        this.empresa = empresa;
        this.valor = valor;
    }
}
