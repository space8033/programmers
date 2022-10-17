package second;

public class Q2 {
    public int solution(int num, int k) {
        int answer = -1;
        String strNum = Integer.toString(num);

        for(int i = 0; i < strNum.length(); i ++) {
            int n = strNum.charAt(i) - '0';
            if(n == k) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}
