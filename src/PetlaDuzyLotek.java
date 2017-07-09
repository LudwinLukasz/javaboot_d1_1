import java.util.Random;

/**
 * Created by arabk on 09.07.2017.
 */
public class PetlaDuzyLotek {
    public static void main(String[] args) {
        Random random = new Random();
    for (int i = 0; i <=5; i++) {
        int liczba = random.nextInt(48)+1;
        // ładniej (max-min)+min
        System.out.println(liczba);
    }
    }
}
