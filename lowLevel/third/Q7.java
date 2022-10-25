package third;

public class Q7 {
    public long solution(int a, int b) {
        long answer = 0;
        int c;

        if(a > b) {
            c = a;
            a = b;
            b = c;
        }

        for(int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}
