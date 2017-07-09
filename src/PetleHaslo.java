import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class PetleHaslo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haslo = sc.nextLine();
        while (!haslo.equals("Polska")) {
            System.out.println("żle!");
            haslo = sc.nextLine();
        }
        System.out.printf("ok");
    }
}
