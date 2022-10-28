public class RectangleArea {
    public int solution(int[][] dots) {
        int answer = 0;
        int a = 0;
        int b = 0;

        for(int i = 0; i < 4; i++) {
            if(dots[0][0] != dots[i][0] && dots[0][1] != dots[i][1]){
                a = dots[i][0];
                b = dots[i][1];
                break;
            }
        }

        answer = Math.abs((a - dots[0][0]) * (b - dots[0][1]));

        return answer;
    }
}
