public class Terrestre extends Veiculo {

    private String placa;
    private String dono;

    public Terrestre() {
        this.setPlaca("Não infomado");
        this.setDono("Não infomado");
    }

    public Terrestre(String placa, String dono) {
        this.placa = placa;
        this.dono = dono;
    }

    @Override
    public void info() {
        System.out.println("Dono: " + this.getDono());
        System.out.println("Placa: " + this.getPlaca());

        super.info();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
