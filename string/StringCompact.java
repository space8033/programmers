public class StringCompact {
    public int solution(String s) {
        int answer = s.length();
        int cnt = 1;

        for(int i = 1; i <= s.length() / 2; i++) {
            StringBuilder sb = new StringBuilder();
            String base = s.substring(0, i);

            for(int j = i; j <= s.length(); j += i) {
                int end = Math.min(j + i, s.length());
                String next = s.substring(j, end);
                if(base.equals(next)) {
                    cnt++;
                }else {
                    if(cnt >= 2) {
                        sb.append(cnt);
                    }
                    sb.append(base);
                    base = next;
                    cnt = 1;
                }
            }
            sb.append(base);
            answer = Math.min(answer, sb.length());
        }
        return answer;
    }
}
