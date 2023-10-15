import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        String name = "Mihai";
        System.out.println(name.toUpperCase());
        float salut=136_23.01f;
        salut++;
        System.out.println("salut = " + salut);
        Date currentDate = new Date();
        System.out.println("data curenta = " + currentDate);
        String newString = "Hiii";
        System.out.println(newString + " cacat");
        String newString2 = newString.replace('i','b');
        System.out.println(newString2 + ' ' + newString);

    }
}