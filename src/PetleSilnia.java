import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class PetleSilnia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int silnia = 1;
        if (n!=0) {
            for (int i = 1; i <= n; i++) {
                silnia = silnia * i;
            }
        }

        System.out.print(silnia);
    }
}
