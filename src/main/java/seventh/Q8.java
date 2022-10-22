package seventh;

import java.util.ArrayList;

public class Q8 {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        int a = -1;

        for(int i =0; i < arr.length; i++) {
            if(arr[i] != a) {
                arrList.add(arr[i]);
                a= arr[i];
            }
        }

        answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}
