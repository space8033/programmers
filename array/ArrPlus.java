import java.util.Arrays;

public class ArrPlus {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j <numbers.length; j++) {
                boolean a = true;

                for(int k = 0; k < answer.length; k++) {
                    if(answer[k] == (numbers[i] + numbers[j])) {
                        a = false;
                    }else {
                        continue;
                    }
                }

                if(a) {
                    answer = Arrays.copyOf(answer, answer.length +  1);
                    answer[answer.length-1] = numbers[i] + numbers[j];
                }
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}
