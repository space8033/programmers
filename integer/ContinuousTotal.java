public class ContinuousTotal {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        int sum = num * (num + 1) / 2;
        int first = (total - sum) / num;

        for(int i = 0; i < num; i++) {
            answer[i] = first + i + 1;
        }

        return answer;
    }
}
