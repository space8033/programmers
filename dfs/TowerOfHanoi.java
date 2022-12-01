import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
    List<int[]> answerList;
    public int[][] solution(int n) {
        answerList = new ArrayList<>();
        dfs(n, 1, 3, 2);

        int[][] answer = new int[answerList.size()][];

        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public void dfs(int n, int start, int end, int mid) {
        if(n == 1) {
            answerList.add(new int[]{start, end});
            return;
        }

        dfs(n-1, start, mid, end);
        answerList.add(new int[]{start, end});

        dfs(n-1, mid, end, start);
    }
}
