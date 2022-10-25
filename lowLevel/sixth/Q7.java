package sixth;

import java.util.Arrays;

public class Q7 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] difference = new int[array.length];

        Arrays.sort(array);

        int index = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[array.length-1] <= n) {
                return array[array.length-1];
            }

            if( array[i] > n) {
                index = i;
                break;
            }
        }

        if(n-array[index -1] > array[index] - n) {
            answer = array[index];
        }else  {
            answer = array[index-1];
        }

        return answer;
    }
}
