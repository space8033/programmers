import java.util.LinkedList;
import java.util.Queue;

public class MakeDistance {
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];

        for(int i = 0; i < places.length;i ++) {
            String[] s = places[i];

            boolean check = true;
            for(int r = 0; r < 5 && check; r++) {
                for(int c = 0; c < 5 && check; c++) {
                    if(s[r].charAt(c) == 'P') {
                        if (!bfs(r, c, s)) {
                            check = false;
                        }
                    }
                }
            }
            if(check) {
                answer[i] = 1;
            }else {
                answer[i] = 0;
            }
        }
        return answer;
    }

    public boolean bfs(int r, int c, String[] s) {
        int x[] = {-1, 1, 0 ,0};
        int y[] = {0, 0, -1 ,1};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r, c});

        while (!queue.isEmpty()) {
            int[] position = queue.poll();

            for(int i = 0; i < 4; i++) {
                int nowR = position[0] + x[i];
                int nowC = position[1] + y[i];

                if(nowR < 0 || nowC < 0 || nowR >= 5 || nowC >= 5 || nowR == r && nowC == c) {
                    continue;
                }

                int d = Math.abs(nowR - r) + Math.abs(nowC - c);

                if(s[nowR].charAt(nowC) == 'P' && d <= 2) {
                    return false;
                }else if(s[nowR].charAt(nowC) == 'O' && d < 2) {
                    queue.offer(new int[]{nowR, nowC});
                }
            }
        }
        return true;
    }
}
