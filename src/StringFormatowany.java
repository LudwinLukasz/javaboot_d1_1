import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class StringFormatowany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wyraz1 = sc.nextLine();
        String wyraz2 = sc.nextLine();
        System.out.printf("Imię i nazwisko to: %s %s \n",wyraz1, wyraz2);
        System.out.print("Imię i nazwisko to: ".concat(wyraz1).concat(" ").concat(wyraz2));
    }

}
