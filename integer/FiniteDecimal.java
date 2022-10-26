public class FiniteDecimal {
    public int solution(int a, int b) {
        int answer = 1;
        int gcd = gcd(a,b);

        b /= gcd;

        while (b != 1) {
            if(b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                answer = 2;
                break;
            }
        }

        return answer;
    }

    public int gcd(int a, int b) {
        int min = Math.min(a,b);
        int gcd = 0;

        for(int i = min; i >= 1; i--) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }
}
