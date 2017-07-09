import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class Nostatnich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wyraz = sc.nextLine();
        int ile = sc.nextInt();
        System.out.println(wyraz.substring(wyraz.length()-ile, wyraz.length()));
    }
}
