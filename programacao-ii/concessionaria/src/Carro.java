public class Carro extends Terrestre{
    private String combustivel;
    private String classe;
    private String potencia;


    public Carro() {
        this.setCombustivel("Não informado");
        this.setClasse("Não informado");
        this.setPotencia("Não informado");
    }

    @Override
    public void info() {
        System.out.println("Combustível: " + this.getCombustivel());
        System.out.println("Classe: " + this.getClasse());
        System.out.println("Potencia: " + this.getPotencia());
        super.info();
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }
}
