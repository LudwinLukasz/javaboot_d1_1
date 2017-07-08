import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Scanner;

/**
 * Created by arabk on 08.07.2017.
 */
public class Task2 {
    public static void main(String[] args) {


        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int b = scanner2.nextInt();
        int t = b;

        b = a;
        a = t;
        System.out.println(a + " " + b);

//        a+=b;
//        b= a-b;
//        a=a-b;

    }
}
