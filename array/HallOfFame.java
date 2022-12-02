import java.util.Arrays;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int last = score[0];

        if(k >= score.length) {
            for(int i = 0; i < score.length; i++) {
                if(last > score[i]) {
                    last = score[i];
                }
                answer[i] = last;
            }
        }else {
            int[] ranking = new int[k];

            for(int i = 0; i < k; i++) {
                if(last > score[i]) {
                    last = score[i];
                }

                answer[i] = last;
                ranking[i] = score[i];
            }

            Arrays.sort(ranking);

            for(int i = k; i < score.length; i++) {
                if(last > score[i]) {
                    answer[i] = last;
                }else {
                    ranking[0] = score[i];
                    Arrays.sort(ranking);
                    answer[i] = ranking[0];
                    last = ranking[0];
                }
            }
        }

        return answer;
    }
}
