package eighth;

import java.util.Arrays;

public class Q7 {
    public int[] solution(int n) {
        int[] answer = {};
        int a = 0;

        while (n != 1) {
            for(int i = 2; i <= n; i++) {
                if(n % i == 0) {
                    if(i != a) {
                        answer = Arrays.copyOf(answer, answer.length+1);
                        answer[answer.length-1] = i;
                    }

                    n /= i;
                    a = i;
                    break;
                }
            }
        }
        return answer;
    }
}
