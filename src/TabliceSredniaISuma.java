/**
 * Created by arabk on 17.07.2017.
 */
public class TabliceSredniaISuma {
    public static void main(String[] args) {
        int[] array = {200,3,4,5,1,7,-19};
        int suma = 0;
        double srednia=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
            suma = suma + array[i];
        }
        System.out.println("suma elementow tablicy to : "+suma+" a średnia to: "+ (double)suma/array.length);
        System.out.println("minimum to: "+min+" a max to: "+max);


    }
}
