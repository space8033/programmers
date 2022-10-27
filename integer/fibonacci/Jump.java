public class Jump {
    public long solution(int n) {
        long answer = fibo(n);

        return answer;
    }

    public long fibo(int a) {
        long[] fibonacci = new long[2001];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        fibonacci[2] = 2;

        for(int i = 3; i <= a; i++) {
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % 1234567;
        }

        return fibonacci[a];
    }
}
