import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
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
        int min = array[0];
        for (int tmp:array
             ) {
            if (min>tmp) min = tmp;
        }
        System.out.println(min);
        // tak mozna tez i to lepiej
        // tez lepiej nie foreach tylko for, ale
        int max = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int tmp:array
             ) {
            if (mini>tmp) mini = tmp;
        }
        System.out.println(mini);
        // albo sort
        Arrays.sort(array);
        System.out.println("Pierwsza posortowana: " + array[0] +" i ostatnia: "+ array[arrayLength-1]);
        System.out.println("minimum - pierwsza posortowana: "+array[0]);
    }

}
