import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class StringCzyCyfra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().charAt(0);
        //int ile = Integer.parseInt(wyraz);
        if (ch < 58 && ch > 47) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
        String mess = Character.isDigit(ch) ? "tak" : "nie";
        System.out.println(mess);

    }
}
