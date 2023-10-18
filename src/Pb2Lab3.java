public class Pb2Lab3 {
    public static void main(String[] args)
    {
        int varsta, sex, inaltime;
        varsta=13;
        sex=1;
        inaltime=134;
        short wrap;
        wrap=(short)((((varsta << 1) | sex) << 8) | inaltime);

        System.out.println("\nInaltimea = "+(wrap&0xff));
        System.out.println("\nsex = "+((wrap>>>8)&1));
        System.out.println("\nvarsta = " + ((wrap>>>9)&0x7f));


    }
}
