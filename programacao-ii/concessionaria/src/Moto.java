public class Moto extends Terrestre{
    private int cilindradas;

    public Moto() {
        this.setCilindradas(0);
    }

    @Override
    public void info() {
        System.out.println("Cilindradas: " + (this.getCilindradas() > 0 ? this.getCilindradas() : "Não informado"));
        super.info();
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
