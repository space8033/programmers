import java.util.ArrayList;

public class CycleOfLight {
    int R, C;
    int[] dirR = {-1, 0, 1, 0};
    int[] dirC = {0, -1, 0, 1};
    boolean[][][] check;
    public int[] solution(String[] grid) {
        ArrayList<Integer> answer = new ArrayList<>();

        R = grid.length;
        C = grid[0].length();

        check = new boolean[R][C][4];

        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                for(int k = 0; k < 4; k++) {
                    if(!check[i][j][k]) {
                        answer.add(light(grid, i, j, k));
                    }
                }
            }
        }

        return answer.stream().sorted().mapToInt(i -> i).toArray();
    }

    public int light(String[] grid, int r, int c, int d) {
        int cnt = 0;

        while (true) {
            if(check[r][c][d]) {
                break;
            }

            cnt++;
            check[r][c][d] = true;

            if(grid[r].charAt(c) == 'L') {
                if(d == 0) {
                    d = 3;
                }else {
                    d--;
                }
            }else if(grid[r].charAt(c) == 'R') {
                if(d == 3) {
                    d = 0;
                }else {
                    d++;
                }
            }

            r = (r + dirR[d] + R) % R;
            c = (c + dirC[d] + C) % C;
        }

        return cnt;
    }
}
