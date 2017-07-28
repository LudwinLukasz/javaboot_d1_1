/**
 * Created by arabk on 24.07.2017.
 */
public class TabliceOddOccurrency {
    public static void main(String[] args) {
int[] array = {2,1,1,1,4,2,4};
        System.out.println(solution(array));
    }
    public static int solution(int[] a) {
        int tmp;
        int odd = a[a.length-1];
        for (int i = 0;i <a.length; i++) {
            tmp = a[i];
            for (int k = i+1; k<a.length;k++){
                if (tmp == a[k]) {
                    a[i] = a[k] = -1;
                    break;
                }
                if (k==a.length-1 && tmp!=a[k] && tmp!=-1) return tmp;
            }
        }
        return odd;
    }
}
