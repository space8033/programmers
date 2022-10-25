package sixth;

public class Q6 {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;

        while(n >= cnt) {
            answer++;
            cnt *= answer;
        }

        answer--;

        return answer;
    }
}
