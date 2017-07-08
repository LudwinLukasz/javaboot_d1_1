import java.util.Scanner;

/**
 * Created by arabk on 08.07.2017.
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.print("Ile masz lat? ");
        Scanner a = new Scanner(System.in);

        int dayOfWeek = 3;
      int age = a.nextInt();
      if (age >= 21 && !(dayOfWeek == 5 || dayOfWeek == 6)) {
       System.out.println("możesz wejść");
      /* else if (age >= 17 && dayOfWeek == 3) {
          System.out.println("mozesz wejsc w srode");
          */
      } else {
          System.out.println("spadaj");
      }


    }
}
