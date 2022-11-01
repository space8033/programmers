import java.util.Arrays;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3];

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == student1[i%5]) {
                cnt[0]++;
            }
            if(answers[i] == student2[i%8]) {
                cnt[1]++;
            }
            if(answers[i] == student3[i%10]) {
                cnt[2]++;
            }
        }

        int[] answer = {};
        int max = Math.max(cnt[0],Math.max(cnt[1], cnt[2]));
        for(int i = 0; i < 3; i++) {
            if(cnt[i] == max) {
                answer = Arrays.copyOf(answer, answer.length+1);
                answer[answer.length-1] = i+1;
            }
        }

        return answer;
    }
}
