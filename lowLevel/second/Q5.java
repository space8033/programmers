package second;

public class Q5 {
    public int solution(String my_string) {
        int answer = 0;

        for(int i =0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57) {
                answer += my_string.charAt(i) - '0';
            }
        }

        return answer;
    }
}
