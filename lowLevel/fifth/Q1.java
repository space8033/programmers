package fifth;

public class Q1 {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] num = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            num[numbers[i]]++;
        }

        for(int i = 0; i < 10; i++) {
            if(num[i] == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
