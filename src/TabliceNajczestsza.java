import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by arabk on 17.07.2017.
 */
public class TabliceNajczestsza {
    public static void main(String[] args) {
        System.out.println("Podaj rozmiar tablicy");
        Scanner sc = new Scanner(System.in);
        int arrayLenght = sc.nextInt();
        int[] array = new int[arrayLenght];
        for(int i = 0; i<arrayLenght; i++) {
            System.out.println("podaj element tablicy o index: " + i);
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int t =1;
        int global = 1;
        int ktory = array[0];
        for(int i=1; i<arrayLenght-1;i++){
            if(array[i]==array[i-1]) {
                t++;
                if(t>global) {
                    global = t;
                    ktory = array[i];
                }
            } else {
                t=1;
            }
        }
        System.out.println("liczba "+ktory+" wystpiła  "+global+" razy");
    }
}
