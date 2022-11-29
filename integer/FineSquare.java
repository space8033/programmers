public class FineSquare {
    public long solution(int w, int h) {
        long answer = 1;
        int gcd = gcd(w,h);
        answer = ((long)w * (long)h) - (((long)w / gcd) + (long)h / gcd - 1) * gcd;
        return answer;
    }

    public int gcd(int a, int b) {
        if(b == 0) {
            return a;
        }

        return gcd(b, a%b);
    }
}
