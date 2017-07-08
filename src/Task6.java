import java.util.Scanner;

/**
 * Created by arabk on 08.07.2017.
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ile = sc.nextInt() ;
        switch (ile%4) {
            case 0: {
                System.out.println("jest");
                break;
            }
            default: System.out.println("nie");
                break;
        }
if (ile%4 == 0) {
    System.out.println("jest");
} else {
    System.out.println("nie");
}
String message = ile%4 == 0 ? "tak" : "nie";
        System.out.println(message);
       /*
        int promo = 0;
        switch (age%10) {
            case 0: {
                System.out.println("jest wielokrotność 10");
                promo=age;
                if (age==50) promo = 40;
                break;
            }
            default: System.out.println("spadaj");
            break;
        }
        System.out.println("znizka"+promo);*/
    }


}
