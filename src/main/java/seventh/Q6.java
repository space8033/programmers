package seventh;

public class Q6 {
    boolean solution(String s) {
        boolean answer = true;
        int[] a = new int[2];

        for(int i =0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                a[0]++;
            }else {
                a[1]++;
            }

            if(a[0] < a[1]) {
                answer = false;
                break;
            }
        }

        if(a[0] != a[1]) {
            answer = false;
        }

        return answer;
    }
}
