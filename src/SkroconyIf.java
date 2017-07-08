import java.util.Scanner;

/**
 * Created by arabk on 08.07.2017.
 */
public class SkroconyIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String message = age >= 18 ? "spoko" : "spadaj";
        System.out.println(message);

    }
}
