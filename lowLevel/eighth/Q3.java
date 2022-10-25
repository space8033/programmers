package eighth;

public class Q3 {
    public int solution(int n) {
        int answer = 0;
        String a = "";

        while (n > 0) {
            a += n%3;
            n /= 3;
        }

        answer = Integer.parseInt(a, 3);

        return answer;
    }
}
