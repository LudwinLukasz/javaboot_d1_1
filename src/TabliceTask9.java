/**
 * Created by arabk on 17.07.2017.
 */
public class TabliceTask9 {
    public static void main(String[] args) {
        int[] a = {12,3,2,2,3,54,7,8,9,6,5,5,4};
        int k = 2;
        int tmp = 0;
        for (int i:a
             ) {
            if (i == k) tmp++;
        }
        System.out.println("liczba "+k+" wystąpiła "+tmp+" razy");
    }
}
