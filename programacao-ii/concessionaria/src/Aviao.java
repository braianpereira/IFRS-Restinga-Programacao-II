public class Aviao extends Aereo {
    private int turbinas;

    Aviao() {
        this.setTurbinas(0);
    }

    @Override
    public void info() {
        System.out.println("Turbinas: " + (this.getTurbinas() > 0 ? this.getTurbinas() : "Não informado"));
        super.info();
    }

    public int getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }
}
