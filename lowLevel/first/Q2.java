package first;

import java.util.Arrays;

public class Q2 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/2];
        return answer;
    }
}
