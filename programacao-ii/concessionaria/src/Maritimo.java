public class Maritimo extends Veiculo {
    private String codigo;
    private String empresa;

    Maritimo() {
        this.setCodigo("Não informado");
        this.setEmpresa("Não informado");
    }

    @Override
    public void info() {
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Empresa: " + this.getEmpresa());
        super.info();
    }

    public void compra(String empresa, float valor){
        this.setEmpresa(empresa);
        this.setValor(valor);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
