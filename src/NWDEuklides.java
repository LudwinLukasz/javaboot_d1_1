import java.util.Scanner;

/**
 * Created by arabk on 28.07.2017.
 */
public class NWDEuklides {
    public static void main(String[] args) {
        System.out.println("podaj pierwszą liczbę:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("podaj drugą liczbę:");
        int b = sc.nextInt();
        int starta=a;
        int startb=b;
        int c = a%b;
        while (a%b != 0 ) {
           // System.out.println("" + a + b + c);
            a = b;
            b = c;
            c = a%b;
        }
        System.out.println("Dla " + starta +" i " + startb +" NWD to: " + b);
    }
}
