package fifth;

public class Q6 {
    public String[] solution(String my_str, int n) {
        String[] answer;
        if(my_str.length() % n == 0) {
            answer = new String[my_str.length() / n];

            for(int i = 0; i < my_str.length()/n; i ++) {
                answer[i] = "";
                for(int j = n*i; j < n*(i+1); j++) {
                    answer[i] += my_str.charAt(j);
                }
            }

        }else {
            answer = new String[my_str.length() / n + 1];

            for(int i = 0; i < my_str.length()/n; i ++) {
                answer[i] = "";
                for(int j = n*i; j < n*(i+1); j++) {
                    answer[i] += my_str.charAt(j);
                }
            }

            answer[my_str.length()/n] = "";

            for(int i = my_str.length() - my_str.length()%n; i < my_str.length(); i++) {
                answer[my_str.length()/n] += my_str.charAt(i);
            }
        }
        return answer;


    }
}
