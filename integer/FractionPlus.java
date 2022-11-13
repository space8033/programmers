public class FractionPlus {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int lcm = lcm(num1, num2);

        int denum = denum1 * (lcm / num1) + denum2 * (lcm / num2);
        int num = lcm(num1, num2);

        int gcd = gcd(denum, num);

        answer[0] = denum / gcd;
        answer[1] = num / gcd;

        return answer;
    }

    public int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }
    public int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }

        return gcd(b, a%b);
    }
}
