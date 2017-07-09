import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class StringiCzyM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wyraz = sc.nextLine();
        String mess = (wyraz.endsWith("m") || wyraz.endsWith("M")) ? "tak" : "nie";
        System.out.println(mess);
    }
}
