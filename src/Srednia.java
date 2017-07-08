import java.util.Scanner;

/**
 * Created by arabk on 08.07.2017.
 */
public class Srednia {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        int a = sc1.nextInt();
        int b = sc2.nextInt();
        int c = sc3.nextInt();
        System.out.println((double)(a+b+c)/3);
    }
}
