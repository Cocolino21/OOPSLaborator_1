import java.util.Scanner;

public class Pb4Lab3 {




    public static boolean isPrime(int x)
    {
        boolean isPrimeTemp=true;
        if(x<=1 || (x%2==0&&x!=2))
            return false;
        else if(x==2) return true;
        else
        {
            for (int i = 2; i <= Math.sqrt(x); i++)
            {
                if(x%i==0) {
                    isPrimeTemp = false;
                    break;
                }
            }
        }
        return isPrimeTemp;
    }

    public static void main(String[] args)
    {
        int n,m;
        Scanner newSc = new Scanner(System.in);
        n = newSc.nextInt();
        m = newSc.nextInt();
        newSc.close();
        for(int i=m;i<=n;i++)
        {
            if(i%2==0)
            {
                for(int j=3;j<=i/2;j++)
                {
                    int x,y;
                    x=j;
                    y=i-j;
                    if(isPrime(x)&&isPrime(y))
                    {
                        System.out.println(i + " = " + x + "+" +  y);
                    }
                }
            }
        }



    }

}
