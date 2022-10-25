package tenth;

public class Q1 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int a = 0;
        int b = 0;

        for(int i = 0; i < words.length-1; i++) {
            for(int j = i+1; j < words.length; j++){
                if(words[i].equals(words[j])) {
                    a = j+1;
                    break;
                }
            }

            if(words[i].charAt(words[i].length()-1) != words[i+1].charAt(0)) {
                b = i+1+1;
                break;
            }
        }
        int c;

        if(a == 0 && b == 0) {
            c = 0;
        } else if(a != 0 && b != 0) {
            c = Math.min(a,b);
        } else {
            c = Math.max(a,b);
        }

        if(c == 0) {
            answer[0] = 0;
            answer[1] = 0;
        }else if( c % n == 0) {
            answer[0] = n;
            answer[1] = c / n;
        }else {
            answer[0] = c % n;
            answer[1] = c / n + 1;
        }

        return answer;
    }
}
