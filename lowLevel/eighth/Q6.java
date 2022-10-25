package eighth;

public class Q6 {
    public int solution(String A, String B) {
        int answer = 0;
        boolean c = false;

        for(int i = 0; i< A.length(); i++) {
            if(B.equals(A)) {
                c = true;
                break;
            }

            answer++;
            A = A.charAt(A.length()-1) + A.substring(0,A.length()-1);

        }

        if(!c) {
            answer = -1;
        }
        return answer;
    }
}
