public class Caminhao extends Terrestre {
    int eixos;
    float peso;

    public void carrega(float peso){
        this.peso += peso;
    }

    public void descarrega (){
        this.peso -= peso;
    }
}
