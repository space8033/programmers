package seventh;

import java.util.Arrays;

public class Q5 {
    public int solution(int []A, int []B) {
        int answer = 0;
        int[] as = A;
        int[] bs = B;

        Arrays.sort(as);
        Arrays.sort(bs);

        for(int i = 0; i < A.length; i++) {
            answer += as[i] * bs[bs.length-1-i];
        }

        return answer;
    }
}
