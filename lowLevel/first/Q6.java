package first;

import java.util.Arrays;

public class Q6 {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length-1] = numlist[i];
            }
        }

        return answer;
    }
}
