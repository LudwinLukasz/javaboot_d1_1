import java.util.Scanner;

/**
 * Created by arabk on 17.07.2017.
 */
public class TabliceTask6 {
    public static void main(String[] args) {
        System.out.println("podaj rozmiar tablicy");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("element index "+i);
            array[i] = sc.nextInt();
        }
        for (int a: array
             ) {
            System.out.println(a);
        }
        int suma = 0;
        for (int i =0; i<arrayLength;i++) {
            for (int j = (arrayLength-1); j >= i; j--) {
                suma = suma +array[j];
            }
            System.out.println(suma);
            suma = 0;
        }
        suma = 0;
        for (int a:array
             ) {
            suma = suma + a;
        }
        System.out.println("drugi" + suma);
        for (int i = 0; i < arrayLength-1;i++) {
            suma = suma - array[i];
            System.out.println("drugi"+ suma);
        }
    }
}

