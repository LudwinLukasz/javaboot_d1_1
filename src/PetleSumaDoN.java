import java.util.Scanner;

/**
 * Created by arabk on 09.07.2017.
 */
public class PetleSumaDoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dotego = sc.nextInt();
        int suma=0;
        for (int i = 1; i <=dotego; i++){
            suma = suma +i;
        }
        System.out.print(suma);
    }
}
