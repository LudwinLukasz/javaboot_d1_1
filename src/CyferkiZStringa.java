import java.util.Scanner;

/**
 * Created by arabk on 08.07.2017.
 */
public class CyferkiZStringa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String out="";
        for (char ch: str.toCharArray()) {
            if (ch < 58 && ch > 47) {
                System.out.println(ch);
                out = out + ch;
            }
        }
        System.out.println(out);


    }
}
