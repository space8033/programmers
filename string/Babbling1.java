public class Babbling1 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] possible = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++) {
            String s = babbling[i];

            for(int j = 0; j < 4; j++) {
                s = s.replace(possible[j], "0");
            }

            boolean check = true;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) != '0') {
                    check = false;
                    break;
                }
            }

            if(check) {
                answer++;
            }
        }
        return answer;
    }
}
