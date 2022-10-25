package fourth;

public class Q9 {
    public int solution(String before, String after) {
        int answer = 1;
        int[] alphabet1 = new int[26];
        int[] alphabet2 = new int[26];

        for(int i = 0; i < before.length(); i++) {
            alphabet1[before.charAt(i)-97]++;
        }
        for(int i = 0; i < after.length(); i++) {
            alphabet2[after.charAt(i)-97]++;
        }

        for(int i = 0; i < 26; i ++) {
            if(alphabet1[i] != alphabet2[i]) {
                answer = 0;
            }
        }
        return answer;
    }
}
