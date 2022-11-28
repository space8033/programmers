import java.util.Arrays;

public class FruitSeller {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        int[] desc = new int[score.length];

        for(int i = 0; i < score.length; i++) {
            desc[score.length - i - 1] = score[i];
        }

        for(int i = m - 1; i < desc.length; i += m) {
            answer += m * desc[i];
        }

        return answer;
    }
}
