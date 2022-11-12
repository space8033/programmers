import java.util.ArrayList;
import java.util.Arrays;
//구슬들이 주어질 때 양팔 저울을 수평으로 만드는 구슬 배열 구하기.
//양파저울에 들어가는 구슬 수의 차이가 적을수록, 배열이 길수록, 구슬의 무게가 무거울수록, 오름차순일수록 점수가 높음
//가장 높은 점수의 구슬 배열을 구하라

public class LGCNS1 {
    public int[] solution(int[] marbles) {
        int[] answer = {};
        int weight = 0;
        Arrays.sort(marbles);


        while (marbles.length > 1) {
            ArrayList<Integer> left = new ArrayList<>();
            boolean visited[] = new boolean[marbles.length];

            for(int i = 0; i < marbles.length; i++) {
                weight += marbles[i];
            }



        }
        return answer;
    }

    public void combination(int arr[], boolean visited[], int start, int n, int r) {
        if(r == 0) {
            return;
        }

        for(int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited,i+1, n, r-1);
            visited[i] = false;
        }
    }
}
