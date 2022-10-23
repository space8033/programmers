package eighth;

public class Q4 {
    public int solution(int n) {
        int answer = 0;
        int[] a = new int[n+1];

        for(int i =0; i < n+1; i++) {
            if(i == 0) {
                a[i] = 0;
            }else if(i == 1) {
                a[i] = 1;
            } else {
                a[i] = (a[i-2] + a[i-1]) % 1234567;
            }
        }
        answer = a[n];

        return answer;
    }

}
