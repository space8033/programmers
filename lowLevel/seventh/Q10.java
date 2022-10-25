package seventh;

import java.util.Arrays;

public class Q10 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy = new int[emergency.length];

    //int[] copy = emergency 로 배열을 복사하면 copy를 sort 할 때 emergency까지 같이 바뀜!
        for(int i =0; i < emergency.length; i++) {
            copy[i] = emergency[i];
        }

        Arrays.sort(copy);
        int cnt = 0;

        for(int i = copy.length-1 ; i >= 0; i--) {
            for(int j = 0; j < emergency.length; j++) {
                if(copy[i] == emergency[j]) {
                    answer[j] = cnt + 1;
                    break;
                }
            }
            cnt++;
        }
        return answer;
    }

}
