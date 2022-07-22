package heranca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner kboard = new Scanner(System.in);
    static  List<List> Veiculo2 = new ArrayList<>();
    static ArrayList<Veiculo> veiculos1 = new ArrayList<>();
    
    static List<Carro> carros = new ArrayList<>();
    static List<Moto> motos = new ArrayList<>();
    static List<Caminhao> caminhoes = new ArrayList<>();
    static List<aviao> avioes = new ArrayList<>();
    static List<helicoptero> helicopteros = new ArrayList<>();
    static List<Navio> navios = new ArrayList<>();
    static List<Submarino> submarinos = new ArrayList<>();
    


    public static void main(String[] args) {

        menu();

        veiculos1.add(new Carro());
        veiculos1.add(new Moto());
        veiculos1.add(new Carro());

        Veiculo2.add(carros);
    }

    public static void menu(){

        while(true){
           System.out.print("[1] Cadastrar um veiculo\n" +
                              "[2] Exibir os veiculos\n" + 
                              "Selecine uma opção: ");
            int key = kboard.nextInt();
            switch (key) {
                case 1:
                    cadastro();
                    break;
            
                case 2:
                    exibir();
                    break;
            }            
        }
    }

    public static void cadastro(){
        System.out.print("\n[1] Cadastrar um carro\n"   +
        "[2] Cadastrar uma moto\n"    +
        "[3] Cadastrar um caminhão\n" +
        "[4] Cadastrar um avião\n"    +
        "[5] Cadastrar um helicoptero\n"+
        "[6] Cadastrar um navio\n"      +
        "[7] Cadastrar um submarino\n" + 
        "Selecine uma opção: ");
        
        int key = kboard.nextInt();

        switch (key) {
            case 1:
                Carro c = new Carro();
                c.cadastro();
                carros.add(c);
                break;

            case 2:
                Moto m = new Moto();
                m.cadastro();
                motos.add(m);

                break;
            case 3:
                Caminhao cm = new Caminhao();
                cm.cadastro();
                caminhoes.add(cm);    
            
                break;
            
            case 4:
                aviao a = new aviao();
                a.cadastro();
                avioes.add(a);    
                break;
            
            case 5:
                helicoptero h = new helicoptero();
                h.cadastro();
                helicopteros.add(h);
                break;
            
            case 6:
                Navio n = new Navio();
                n.cadastro();
                navios.add(n);    

                break;
            
            case 7:
                Submarino s = new Submarino();
                s.cadastro();
                submarinos.add(s);
                break;
            
        }
    }

    public static void exibir(){
        System.out.print("\n[1] Exibir todos os carros\n"   +
                        "[2]  Exibir todas as motos\n"    +
                        "[3]  Exibir todos os caminhões\n" +
                        "[4]  Exibir todos os aviões\n"    +
                        "[5]  Exibir todos os helicopteros\n"+
                        "[6]  Exibir todos os navios\n"      +
                        "[7]  Exibir todos os submarinos\n" + 
                        "Selecine uma opção: ");
        
        int key = kboard.nextInt();

        switch (key) {
            case 1:
                System.out.println("========================================\n"+ 
                               "               CARROS                      ");
                for(Carro i : carros){
                    i.info();
                }
                System.out.println("========================================\n");
                break;

            case 2:
                System.out.println("========================================\n"+ 
                                   "               MOTOS                      ");
                for(Moto i : motos){
                    i.info();
                }    
                System.out.println("========================================\n");
 
                break;

            case 3:
                System.out.println("========================================\n"+ 
                                "               CAMINHÕES                 ");
                for(Caminhao i : caminhoes){
                    i.info();
                }
                System.out.println("========================================\n");
                break;
            
            case 4:    
                System.out.println("========================================\n"+ 
                                "               AVIÕES                      ");
                for(aviao i : avioes){
                    i.info();
                } 
                System.out.println("========================================\n");
                break;
            
            case 5:
                System.out.println("========================================\n"+ 
                                "            HELICOPTEROS                 ");
                for(helicoptero i : helicopteros){
                    i.info();
                }
                System.out.println("========================================\n");
                break;
            
            case 6:
                System.out.println("========================================\n"+ 
                                "               NAVIOS                    ");
                for(Navio i : navios){
                    i.info();
                }
                System.out.println("========================================\n");

                break;
            
            case 7:   
                System.out.println("========================================\n"+ 
                               "              SUBMARINOS                ");
                for(Submarino i : submarinos){
                    i.info();
                }
                System.out.println("========================================\n");
                break;
            
        }
    }
}