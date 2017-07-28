/**
 * Created by arabk on 23.07.2017.
 */
public class TableCyclic {
    public static void main(String[] args) {
        int[] array = {3, 8, 9, 7, 6};
        for (int a: solution(array,3)
             ) {
            System.out.println(a);
        }

    }
    public static int[] solution(int[] a, int k) {
        int[] out = new int[a.length];
        for(int inc=1;inc<=k;inc++) {
            out[0] = a[a.length - 1];
            for (int i = 1; i < a.length; i++) {
                out[i] = a[i - 1];
            }
            for (int b=0; b<a.length;b++) {
                a[b]=out[b];
            }
        }
        return out;
    }

}
