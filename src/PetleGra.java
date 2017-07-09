import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class PetleGra {
    public static void main(String[] args) {
        int zgaduj = 100;
        Scanner sc = new Scanner(System.in);
        int proba = sc.nextInt();
        while (zgaduj!=proba) {
            if (zgaduj>proba) {
                System.out.println("za malo");
                proba = sc.nextInt();
            } else {
                System.out.println("za duzo");
                proba = sc.nextInt();
            }
        }
        System.out.println("trafiles");
    }
}

