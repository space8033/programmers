package ninth;

public class Q4 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int vMax = 0;
        int hMax = 0;

        for(int i = 0; i < sizes.length; i++) {
            int v = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);

            vMax = Math.max(vMax, v);
            hMax = Math.max(hMax, h);
        }

        answer = vMax * hMax;

        return answer;
    }
}
