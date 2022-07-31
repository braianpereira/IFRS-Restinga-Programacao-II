import javax.swing.*;
import java.util.Scanner;

public final class functions {
    public static int getInt(){
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {

            int aux = sc.nextInt();
            sc.nextLine();
            return aux;
        }else {

            System.out.println("Informe um numero válido!");

            return getInt();
        }
    }

    public static double getDouble(){
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextDouble()) {
            double aux = sc.nextDouble();
            sc.nextLine();
//            sc.close();
            return aux;
        } else {

            System.out.println("Informe um numero válido!");

            return getDouble();
        }
    }

    public static String getString(String label){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        return JOptionPane.showInputDialog(frame, label);
    }

    public int getIntDialog(String label){
        return Integer.parseInt(getString(label));
    }

    public static String getStringSC(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
