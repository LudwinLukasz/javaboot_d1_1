import java.util.Scanner;

/**
 * Created by arabk on 08.07.2017.
 */
public class StringWycinka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Pierwsza: " + name.substring(0,1));
        System.out.println("Ostatnia: " + name.substring(name.length()-1));
        System.out.println("Przed ostatnia: " + name.substring(name.length()-2,name.length()-1));
    }
}
