import java.util.Scanner;

/**
 * Created by arabk on 08.07.2017.
 */
public class TaskTrzyLiczby {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int a = sc1.nextInt();
        int b = sc2.nextInt();
        int c = sc3.nextInt();

//        String res = (a<b && a>c) || (a<c && a>b) ? "a" : "nie a ";
//        System.out.println(res);
String mess;
        if ((a<b && a>c) || (a<c && a>b)) {
            mess = "a";
        } else if ((b<a && b>c) || (b<c && b>a)) {
            mess = "b";
        } else mess = "c";
        System.out.println(mess);




    }
}

