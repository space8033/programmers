package second;

public class Q9 {
    public int solution(int hp) {
        int answer = 0;

        while (hp >= 5) {
            hp -= 5;
            answer += 1;
        }

        while (hp >= 3) {
            hp -= 3;
            answer += 1;
        }

        answer += hp;

        return answer;
    }
}
