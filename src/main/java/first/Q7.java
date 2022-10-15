package first;

import java.util.Arrays;

public class Q7 {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        for(int i =0; i< arr.length; i ++) {
            answer += arr[i];
        }

        return answer;
    }
}
