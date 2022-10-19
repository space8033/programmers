package fourth;

import java.util.Arrays;

public class Q5 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        for(int i =0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer = Arrays.copyOf(answer, answer.length+1);
                answer[answer.length-1] = arr[i];
            }
        }
        Arrays.sort(answer);

        if(answer.length == 0) {
            answer = Arrays.copyOf(answer, answer.length +1);
            answer[answer.length-1] = -1;
        }
        return answer;
    }
}
