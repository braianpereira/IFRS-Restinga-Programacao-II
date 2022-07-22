public class Helicoptero extends Aereo{
    private int rotores;

    Helicoptero() {
        this.setRotores(0);
    }

    @Override
    public void info() {
        System.out.println("Rotores: " + (this.getRotores() > 0 ? this.getRotores() : "Não informado"));
        super.info();
    }

    public int getRotores() {
        return rotores;
    }

    public void setRotores(int rotores) {
        this.rotores = rotores;
    }
}
