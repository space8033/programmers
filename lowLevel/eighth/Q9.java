package eighth;

public class Q9 {
    public int solution(int n) {
        int answer = 0;
        int cntS1 = 0;
        String s1 = Integer.toBinaryString(n);

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == '1') {
                cntS1++;
            }
        }

        for(int i = n+1; n < 1000001; i++) {
            String s2 = Integer.toBinaryString(i);
            int cntS2 = 0;

            for(int j = 0; j < s2.length(); j++) {
                if(s2.charAt(j) == '1') {
                    cntS2++;
                }
            }

            if(cntS1 == cntS2) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
