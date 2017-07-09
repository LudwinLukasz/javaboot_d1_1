import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class PetleHasloDowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haslo;
        boolean isFirst = true;
        do {
            if (!isFirst) {
                System.out.println("złe hasło");
            }
            System.out.printf("podaj hasło");
            haslo = sc.nextLine();
            isFirst = false;
        } while (!haslo.equals("Polska"));

       /* while (!haslo.equals("Polska")) {
            System.out.println("żle!");
            haslo = sc.nextLine();
        }*/
        System.out.printf("ok");
    }
}
