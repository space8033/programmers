public class Lcm1 {
    public int solution(int[] arr) {
        int answer = arr[0];
        int gcd = 0;
        for(int i = 1; i < arr.length; i++) {
            gcd = gcd(answer, arr[i]);
            answer *= arr[i]/gcd;
        }

        return answer;
    }

    public int gcd(int a, int b) {
        int min = Math.min(a, b);
        int gcd = 1;
        for(int i = min; i >=1; i--) {
            if(a % i == 0 && b % i == 0){
                gcd = i;
                break;
            }
        }

        return gcd;
    }
}
