import java.util.Arrays;

public class StrangeArray {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[] distance = new int[numlist.length];

        for(int i = 0; i < distance.length; i++) {
            if(numlist[i] >= n) {
                distance[i] = numlist[i] - n;
            }else {
                distance[i] = n - numlist[i];
            }
        }

        Arrays.sort(numlist);
        Arrays.sort(distance);

        for(int i = 0; i < distance.length; i++) {
            for(int j = numlist.length-1; j >= 0; j--){
                if(n - distance[i] == numlist[j]){
                    answer[i] = numlist[j];
                    numlist[j] = 0;
                    break;
                }else if(n + distance[i] == numlist[j]) {
                    answer[i] = numlist[j];
                    numlist[j] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
