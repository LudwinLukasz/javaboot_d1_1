/**
 * Created by arabk on 28.07.2017.
 */
public class TabliceTask10 {
    public static void main(String[] args) {
        int[][] array = {{-1,2,3,4,5},{7,8,900,10,11},{12,13,14,15,16}};
        int size = array.length;
        int sizeX = array[0].length;
        int sizeY = array[1].length;
        int sizeZ = array[2].length;
        //System.out.println(""+sizeX + sizeY + sizeZ + size);
        int suma = 0;
        for (int i = 0; i < size;i++) {
            for (int j = 0; j < sizeX; j++) {
                suma += array[i][j];
            }
        }
        System.out.println("Suma wszystkich elementów tablicy to: "+suma);
        for (int k = 0; k < size;k++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int m =0; m<sizeX;m++) {
                if(array[k][m] < min) {
                    min = array[k][m];
                }
                if(array[k][m] > max) {
                    max = array[k][m];
                }
            }
            System.out.println("dla wiersza "+k+" wartość minimum to: "+min+", natomiast maksymalna to: "+max);
        }
    }
}
