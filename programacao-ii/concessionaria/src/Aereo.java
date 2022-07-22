public class Aereo extends Veiculo{
    private String codigo;
    private int pos_z;
    private String empresa;

    Aereo() {
        this.setCodigo("Não informádo");
        this.setPos_z(0);
        this.setEmpresa("Não informádo");
    }

    @Override
    public void info() {
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Empresa: " + this.getEmpresa());
        super.info();
        System.out.println("Cilindradas: " + (this.getPos_z() > 0 ? this.getPos_z() : "Não informado"));
    }

    public void deslocamento(int x, int y, int z){
        super.deslocamento(x, y);
        this.setPos_z(this.getPos_z() + z);
    }

    public void compra(String empresa, float valor){
        this.empresa = empresa;
        this.setValor(valor);
        this.setValor(valor);
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPos_z() {
        return this.pos_z;
    }

    public void setPos_z(int pos_z) {
        this.pos_z = pos_z;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
