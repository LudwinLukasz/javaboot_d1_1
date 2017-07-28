import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by arabk on 17.07.2017.
 */
public class TabliceTask7 {
    public static void main(String[] args) {
        System.out.println("podaj wielkosc tablicy");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        System.out.println("wprowadz tablice");
        for (int i = 0; i < arrayLength;i++) {
             array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        String msg = "NIE";
        for (int i = 1; i < arrayLength-1;i++) {
            if (array[i] == array[i-1] && array[i] == array[i+1]) {
                msg = "TAK";
            }
        }

    }
}
