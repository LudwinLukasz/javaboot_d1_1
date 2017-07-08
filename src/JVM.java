/**
 * Created by arabk on 08.07.2017.
 */
public class JVM {
    public static void main(String[] args) {
        int a =5;
        int b =5;
        // to jest jedno miejsce w pamieci nie tworzy sie dwoch zmiennych z 5 tka
        // operator == porownuje referencje
        // a == b; to true bo wskazuje na to samo miejsce w pamieci
        //a nie dlatego ze 5=5
        int c = 6;

        // to inna referencja
if (a==b) {
    System.out.println("Sa takie same");
}
String d ="Hello";
String f = "Hello";

        if (d==f) {
            System.out.println("Sa takie same");

        } else System.out.println("nie");

        String h = new String("Hello");
        String y = new String("Hello");
        String oo = y; // tu tworze obiekt z referencja do tego samego miejsca co y
        // zmieniajac oo zmienie tez y
        //   bo String jest immutable
        y.concat("world"); // to nie zmienia y tylko tworzy nowa instancje Stringa
        String newY = y.concat("world");
        if (h==y) {
            System.out.println("Sa takie same"); // tu porowannie referencji
            // wprzypadku obiektow rozne ref na stercie

        } else System.out.println("nie");
        if (h.equals(y)) {
            System.out.println("Sa takie same"); //tu porowaniae wnetrze obiektu

        } else System.out.println("nie");
        System.out.println(y);
        System.out.println(newY);
    }
}
