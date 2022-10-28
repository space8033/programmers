import java.util.Arrays;

public class Ranking {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] total = new int[score.length];

        for(int i = 0; i < score.length; i++) {
            total[i] = score[i][0] + score[i][1];
        }

        Arrays.sort(total);

        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < total.length; j++) {
                if(score[i][0] + score[i][1] == total[j]) {
                    answer[i] = total.length - j;
                }
            }
        }
        return answer;
    }
}
