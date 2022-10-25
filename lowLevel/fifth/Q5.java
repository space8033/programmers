package fifth;

public class Q5 {
    public String solution(String my_string) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++) {
            if(answer.contains("" + my_string.charAt(i))) {
                continue;
            }else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
