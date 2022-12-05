public class StringSplit {
    public int solution(String s) {
        int answer = 0;
        boolean end = false;

        while (s.length() > 0) {
            char start = s.charAt(0);
            int y = 0;
            int n = 0;
            for(int i = 0; i < s.length(); i++) {
                if(start == s.charAt(i)) {
                    y++;
                }else {
                    n++;
                }

                if(y == n) {
                    answer++;
                    s = s.substring(i + 1);
                    break;
                }

                if(i == s.length() - 1) {
                    end = true;
                }
            }

            if(end) {
                answer++;
                break;
            }
        }

        return answer;
    }
}
