import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class StringPierwszaOstatnia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wyraz = sc.nextLine();
        String mess = wyraz.charAt(0) == wyraz.charAt(wyraz.length()-1) ? "tak" : "nie";
        System.out.println(mess);
    }
}
