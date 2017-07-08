import java.util.Scanner;

/**
 * Created by arabk on 08.07.2017.
 */
public class StringWycinka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(name.length()-1));
    }
}
