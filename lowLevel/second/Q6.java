package second;

import java.util.Arrays;

public class Q6 {
    public int[] solution(String my_string) {
        int[] answer = {};

        for(int i =0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57) {
                answer = Arrays.copyOf(answer, answer.length+1);
                answer[answer.length-1] = my_string.charAt(i) - '0';
            }
        }
        Arrays.sort(answer);

        return answer;
    }
}
