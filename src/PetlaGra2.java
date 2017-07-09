import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class PetlaGra2 {
    public static void main(String[] args) {
        final int zgaduj = 100;
        Scanner sc = new Scanner(System.in);
        int proba;
        while ((proba = sc.nextInt()) != zgaduj) {
            if (zgaduj>proba) {
                System.out.println("za malo");
            } else {
                System.out.println("za duzo");
            }
        }
        System.out.println("trafiles");
    }
}
