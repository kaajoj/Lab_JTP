import java.util.ArrayList;
import java.util.Random;


public class Names {

    int wylosowana;

    static int choose(int rozmiar){
        Random randGen = new Random();
        int los = randGen.nextInt(rozmiar);
//      System.out.println("indeks: " + los);
        return los;
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("nazwisko1");
        names.add("nazwisko2");
        names.add("nazwisko3");
        names.add("nazwisko4");
        names.add("nazwisko5");
        names.add("nazwisko6");
        System.out.println("Lista posiada " + names.size() + " elementów ");
        System.out.println("Zawartość początkowa: "+ names);

        int rozmiar = names.size();
        int wylosowana = choose(rozmiar);
        System.out.print("Wylosowana osoba: ");
        System.out.println(names.get(wylosowana));
        names.remove(wylosowana);
        System.out.println("Po usunięciu: "+ names);

        rozmiar = names.size();
        wylosowana = choose(rozmiar);
        System.out.print("Wylosowana osoba: ");
        System.out.println(names.get(wylosowana));
        names.remove(wylosowana);
        System.out.println("Po usunięciu: "+ names);
    }
}