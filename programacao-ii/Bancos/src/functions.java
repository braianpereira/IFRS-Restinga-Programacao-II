import java.util.Scanner;

public final class functions {
    public static int getInt(){
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            return sc.nextInt();
        }else {
            sc.nextLine();
            System.out.println("Informe um numero válido!");
            return getInt();
        }
    }

    public static double getDouble(){
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextDouble()) {
            return sc.nextDouble();
        }else {
            sc.nextLine();
            System.out.println("Informe um numero válido!");
            return getDouble();
        }
    }
}
