public class Submarino extends Maritimo {
    int pos_z;
    int max_profund;

    public void deslocamento(int x, int y, int z) {
        super.deslocamento();

        int aux_z = this.pos_z += z;

        if(aux_z >= max_profund){
            this.pos_z = max_profund;
            System.out.println("Atingiu a profundidade máxima");
        } else {
            this.pos_z = aux_z;
        }

    }
}
