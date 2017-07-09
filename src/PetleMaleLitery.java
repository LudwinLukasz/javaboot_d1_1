import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class PetleMaleLitery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wyraz = sc.nextLine();
        int inc=0;
        for (int i = 0; i < wyraz.length(); i++) {
            char ch = wyraz.charAt(i);
            if (Character.isLowerCase(ch)) {
                inc++;
            }
        }
        System.out.print(inc);
    }
}
