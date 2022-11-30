public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] once = {"aya", "ye", "woo", "ma"};
        String[] twice = {"ayaaya", "yeye", "woowoo", "mama"};

        for(int i = 0; i < babbling.length; i++) {
            String s = babbling[i];

            for(int j = 0; j < 4; j++) {
                s = s.replace(twice[j], "0");
            }
            for(int j = 0; j < 4; j++) {
                s = s.replace(once[j], "1");
            }

            boolean check = true;
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) != '1') {
                    check = false;
                }
            }

            if(check) {
                answer++;
            }
        }

        return answer;
    }
}
