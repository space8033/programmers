package first;

public class Q10 {
    public boolean solution(int x) {
        boolean answer = false;
        int total  = 0;
        int y = x;

        if(x <= 10) {
            return true;
        }

        while(x > 10) {
            total += x % 10;
            x /= 10;
        }
        total += x;

        if(y % total == 0) {
            answer = true;
        }

        return answer;
    }
}
