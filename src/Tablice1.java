/**
 * Created by arabk on 09.07.2017.
 */
public class Tablice1 {
    public static void main(String[] args) {
        int[] arrayOfInts = {1,2,3,45,5,5,120};
        arrayOfInts[5]=444;
        System.out.println(arrayOfInts[5]);
        System.out.println(arrayOfInts[6]);

        int[] empty = new int[100];
        System.out.println(empty[6]);

        int[] cos = new int[]{4,2,3,4,5,6,};
        for (int a: cos) {
            System.out.println(a);
        }
        for (int i = 0; i<cos.length;i++){
            System.out.println(cos[i]);
        }

        String[] wyrazy = {"ala","ma","kota"};
        for (String wyraz: wyrazy
             ) {
            System.out.println(wyraz);
        }

       /* for (int i=0;i<=10;i++){
            for(int j = 0; j<=10;j++) {
                for (int k=0; k<=10;k++){
                    System.out.println("i: "+i +" j: "+j+" k: "+k);
                }
            }
        }*/




    }
}
