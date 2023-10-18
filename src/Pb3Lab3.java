import java.util.Locale;
import java.util.Scanner;

public class Pb3Lab3 {
    public static void main(String[] args)
    {
        Scanner newSc = new Scanner(System.in);
        String givenChar = newSc.nextLine();
        String cuvant;
        cuvant = "Martipan";
        cuvant = cuvant.toLowerCase(Locale.ROOT);
        int noOfVows=0;
        int noOfCons=0;

        for(int i=0;i<cuvant.length();i++)
        {
            if(cuvant.charAt(i)=='a'||cuvant.charAt(i)=='e'||cuvant.charAt(i)=='o'||cuvant.charAt(i)=='u'||cuvant.charAt(i)=='i')
            {
                if(cuvant.charAt(i)==givenChar.charAt(0))
                {
                    System.out.println(i);
                }
                noOfVows++;
            }
            else
                noOfCons++;
        }
        System.out.println("NrVocale = "+noOfVows+"\nNrConsoane = "+noOfCons);
    }
}
