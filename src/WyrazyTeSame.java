import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class WyrazyTeSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String mess = str1.equals(str2) ? "takie same" : "inne";
        System.out.println(mess);
    }
}
