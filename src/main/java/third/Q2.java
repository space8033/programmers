package third;

import java.util.Arrays;

public class Q2 {
    public long[] solution(int x, int n) {
        long[] answer = {};
        long a = 0;

        for(int i = 0 ; i < n; i ++) {
            a += x;
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length-1] = a;
        }
        return answer;
    }
}
