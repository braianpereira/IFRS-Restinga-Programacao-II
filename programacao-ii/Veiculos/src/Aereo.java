public class Aereo extends Veiculo{
    String codigo;
    int pos_z;
    String empresa;

    public void deslocamento(int x, int y, int z){
        super.deslocamento(x, y);

        this.pos_z = z;
    }

    public void compra(String empresa, float valor){
        this.empresa = empresa;
        this.valor = valor;
    }
}
