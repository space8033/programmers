package ninth;

public class Q5 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int w = 0;
        int h = 0;

        for(int i =1; i <= brown + yellow; i++) {
            if((brown + yellow) % i == 0) {
                w = i;
                h = (brown + yellow) / i;
            }

            if((w + h) * 2 - 4 == brown && (w-2) * (h-2) == yellow) {
                answer[0] = Math.max(w,h);
                answer[1] = Math.min(w,h);
                break;
            }
        }

        return answer;
    }
}
