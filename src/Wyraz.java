import java.util.Scanner;

/**
 * Created by arabk on 08.07.2017.
 */
public class Wyraz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char ch = str.charAt(str.length()-2);
        System.out.println(ch);
    }
}
