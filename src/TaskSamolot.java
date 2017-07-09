import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class TaskSamolot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ilość miejsc: ");
        int miejsc = sc.nextInt();
        System.out.println("Ilość rzedow:");
        int rzedow = sc.nextInt();
        int ile = miejsc % rzedow;
        int rozmiar = miejsc / rzedow;
        switch (ile) {
            case 0: {
                System.out.println("wielkosc rzedu: " + rozmiar);
                break;
            }
            default: {
                rzedow = rzedow -1;
                rozmiar = miejsc / rzedow;
                System.out.println("wielkosc rzedu: " + (rozmiar));
                System.out.println("w ostatnim rzedzie: " + (miejsc - rozmiar*rzedow));
                break;
            }

        }
    }
}

