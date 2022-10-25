package seventh;

public class Q3 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index = -2;

        for(int i = 0; i < k; i++) {
            index += 2;
            if(index >= numbers.length) {
                index -= numbers.length;
            }
        }
        answer = numbers[index];

        return answer;
    }
}
