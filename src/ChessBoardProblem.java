import java.math.BigInteger;

public class ChessBoardProblem {

    private final int nrCasute;
    private BigInteger totalBoabe;
    public ChessBoardProblem(int nrSquares)
    {
       this.nrCasute = nrSquares;
       totalBoabe=BigInteger.ZERO;
   }

   public BigInteger getTotalBoabe()
   {
       BigInteger currentBoabe=BigInteger.ZERO;
       for(int i=1;i<=nrCasute;i++)
       {
           currentBoabe=BigInteger.valueOf(2).pow((i-1));
           totalBoabe=totalBoabe.add(currentBoabe);
       }
       return totalBoabe;
   }


}
