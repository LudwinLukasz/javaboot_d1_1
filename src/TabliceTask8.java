import java.util.Scanner;

/**
 * Created by arabk on 18.07.2017.
 */
public class TabliceTask8 {
    public static void main(String[] args) {

    int[] array = new int[15];
    Scanner sc = new Scanner(System.in);
    int counter = 0;
    for (int i = 0;i<15;i++) {
    int a = sc.nextInt()%37;
        if(!isInside(array,a)) {
            counter++;
        }
        array[i]=a;
    }
        System.out.println("ilość dzielników: "+counter);
    }

    public static boolean isInside(int[] in, int f) {
        boolean check = false;
        for (int i=0;i<in.length;i++){
            if (in[i] == f) check = true;
        }
        return check;
    }
}
