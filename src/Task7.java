import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String number = "" + a;
        System.out.println(number.substring(number.length()-1));
        System.out.println(number.charAt(number.length()-1));
        int tmp = a/10;
        tmp = tmp *10;
        tmp = a - tmp;

        System.out.println(tmp);

        tmp = a%10;
        System.out.println(tmp);
    }
}
