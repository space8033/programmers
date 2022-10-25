package eighth;

public class Q2 {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split("");

        int idx = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                a[i] = a[i].toUpperCase();
                idx++;
            } else  {
                a[i] = a[i].toLowerCase();
                idx++;
            }
            answer += a[i];
        }

        return answer;
    }
}
