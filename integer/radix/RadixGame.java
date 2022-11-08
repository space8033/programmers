public class RadixGame {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        int index = 0;

        while (sb.length() < m * t) {
            sb.append(Integer.toString(index++,n));
        }

        for(int i = p - 1; i < m * t; i += m) {
            answer.append(sb.charAt(i));
        }

        return answer.toString().toUpperCase();
    }
}
