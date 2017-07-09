import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class TabliceTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy:");
        int arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];
        for(int i =0; i < arrayLength; i++) {
            System.out.println("podaj liczbe pod index" + i);
            array[i]=sc.nextInt();
        }
        System.out.println("Odwrocona tablica: ");
        for (int i = arrayLength-1; i >= 0 ;i--) {
            System.out.println(array[i]);
        }
    }

}
