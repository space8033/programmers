import java.util.ArrayDeque;
import java.util.Queue;

public class ColoringBook {
    int[][] p;
    boolean[][] check;
    int[][] direction = new int[][] {{-1,0}, {1,0}, {0,-1}, {0, 1}};

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        p = picture;
        check = new boolean[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(check[i][j] || picture[i][j] == 0) {
                    continue;
                }
                maxSizeOfOneArea = Math.max(bfs(i, j, m, n), maxSizeOfOneArea);
                numberOfArea++;
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public int bfs(int row, int col, int m, int n) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{row, col});
        int cnt = 0;

        while (!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int r = tmp[0];
            int c = tmp[1];

            if(check[r][c]) {
                continue;
            }
            check[r][c] = true;
            cnt++;

            for(int[] d : direction) {
                int nextR = r + d[0];
                int nextC = c + d[1];

                if(nextR >= 0 && nextR < m && nextC >= 0 && nextC < n && !check[nextR][nextC]
                        && p[nextR][nextC] == p[r][c]) {
                    queue.offer(new int[] {nextR, nextC});
                }
            }
        }
        return cnt;
    }
}
