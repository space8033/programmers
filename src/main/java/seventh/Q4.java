package seventh;

public class Q4 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcd = 0;
        int lcm = 0;

        if(n >= m) {
            for(int i = m; i > 0; i--) {
                if(n % i == 0 && m % i == 0) {
                    gcd = i;
                    lcm = n * m/i;
                    break;
                }
            }
        } else {
            for(int i = n; i > 0; i--) {
                if(n % i == 0 && m % i == 0) {
                    gcd = i;
                    lcm = m * n/i;
                    break;
                }
            }
        }

        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }
}
