package sixth;

import java.util.Arrays;

public class Q2 {
    public String solution(String s) {
        String answer = "";

        char[] a = s.toCharArray();
        Arrays.sort(a);

        for(int i = a.length-1; i >= 0; i--) {
            answer += a[i];
        }
        return answer;
    }
}
