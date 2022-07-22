package heranca;
public class Moto extends Terrestre{
    private int potencia;
    private String partidaEletrica = "Não";

    public void cadastro(){
        super.cadastro();

        System.out.print("\nInsira a potencia da moto: ");
        setPotencia(kboard.nextInt());
    }

    public String getPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(String partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void instalerPartElet() {
        setPartidaEletrica("Sim");;;
    }

    public void info() {
        super.info();
        System.out.print("Potência: " + getPotencia()+ "cc\n" +
                            "Possui partida eletrica: " + getPartidaEletrica() + "\n" );
    }   
}
