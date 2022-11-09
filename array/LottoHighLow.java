public class LottoHighLow {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correct = 0;
        int cnt = 0;
        int min = 0;
        int max = 0;

        for(int i = 0; i < 6; i++) {
            if(lottos[i] == 0) {
                cnt++;
            }
        }

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j]) {
                    correct++;
                    break;
                }
            }
        }

        min = correct;
        max = correct + cnt;

        answer[0] = 7 - max;
        answer[1] = 7 - min;

        for(int i = 0; i < 2; i++) {
            if(answer[i] == 0) {
                answer[i] = 1;
            }
            if(answer[i] == 7) {
                answer[i] = 6;
            }
        }

        return answer;
    }
}
