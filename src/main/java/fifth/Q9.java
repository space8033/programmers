package fifth;

public class Q9 {
    public String solution(String s) {
        String answer = "";
        int[] alphabet = new int[26];

        for(int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i)-97]++;
        }

        for (int i = 0; i < 26; i++) {
            if(alphabet[i] == 1) {
                answer += (char)(i+97);
            }
        }

        return answer;
    }
}
