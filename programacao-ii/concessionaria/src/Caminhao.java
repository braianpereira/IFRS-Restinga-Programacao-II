public class Caminhao extends Terrestre {
    private int eixos;
    private float peso;

    public Caminhao() {
        this.setPeso(0);
        this.setEixos(0);
    }

    @Override
    public void info() {
        System.out.println("Peso: " + (this.getPeso() > 0 ? this.getPeso() : "Não informado"));
        System.out.println("Eixos: " + (this.getEixos() > 0 ? this.getEixos() : "Não informado"));
        super.info();
    }

    public void carrega(float peso){
        this.peso += peso;
    }

    public void descarrega (){
        this.peso -= peso;
    }

    public int getEixos() {
        return this.eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public float getPeso() {
        return this.peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
    }
}
