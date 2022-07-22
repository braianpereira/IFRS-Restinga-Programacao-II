public class Submarino extends Maritimo {
    private int pos_z;
    private int max_profund;

    Submarino(){
        this.setPos_z(0);
        this.setMax_profund(0);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Posição Z: " + this.getPos_z());
        System.out.println("Profundidade máxima: " + (this.getMax_profund() > 0 ? this.getMax_profund() : "Não informado"));
    }

    public void deslocamento(int x, int y, int z) {
        super.deslocamento(x, y);

        int aux_z = this.getPos_z() + z;

        if(aux_z >= this.getMax_profund()){
            this.setPos_z(this.getMax_profund());
            System.out.println("Atingiu a profundidade máxima");
        } else {
            this.setPos_z(aux_z);
        }

    }

    public int getPos_z() {
        return this.pos_z;
    }

    public void setPos_z(int pos_z) {
        this.pos_z = pos_z;
    }

    public int getMax_profund() {
        return this.max_profund;
    }

    public void setMax_profund(int max_profund) {
        this.max_profund = max_profund;
    }
}
