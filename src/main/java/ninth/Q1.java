package ninth;

import java.math.BigInteger;

public class Q1 {
    public BigInteger solution(int balls, int share) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        for(long i = 0; i < share; i++) {
            a = a.multiply(BigInteger.valueOf(balls).subtract(BigInteger.valueOf(i)));
            b = b.multiply(BigInteger.valueOf(share).subtract(BigInteger.valueOf(i)));
        }

        return a.divide(b);
    }
}
