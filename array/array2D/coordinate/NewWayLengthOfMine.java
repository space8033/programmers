public class NewWayLength {
    public int solution(String dirs) {
        int answer = 0;
        int x = 5;
        int y = 5;

        Boolean[][] up = new Boolean[11][11];
        Boolean[][] down = new Boolean[11][11];
        Boolean[][] left = new Boolean[11][11];
        Boolean[][] right = new Boolean[11][11];

        for(int i = 0; i < 11; i++) {
            for(int j = 0; j < 11; j++){
                up[i][j] = false;
                down[i][j] = false;
                left[i][j] = false;
                right[i][j] = false;

                left[0][j] = true;
                right[10][j] = true;
            }
            up[i][10] = true;
            down[i][0] = true;
        }


        for(int i = 0; i < dirs.length(); i++) {
            if(dirs.charAt(i) == 'U') {
                if(!up[x][y]) {
                    answer++;
                    up[x][y] = true;
                    if(y == 11) {
                        continue;
                    }else {
                        down[x][y+1] = true;
                    }
                }
                if(y == 11) {
                    continue;
                }else {
                    y++;
                }
            }else if(dirs.charAt(i) == 'D') {
                if(!down[x][y]) {
                    answer++;
                    down[x][y] = true;
                    if(y == 0) {
                        continue;
                    }else {
                        up[x][y-1] = true;
                    }
                }
                if(y == 0) {
                    continue;
                }else {
                    y--;
                }
            }else if(dirs.charAt(i) == 'R') {
                if(!right[x][y]) {
                    answer++;
                    right[x][y] = true;
                    if(x == 11) {
                        continue;
                    }else {
                        left[x+1][y] = true;
                    }
                }
                if(x == 11) {
                    continue;
                }else {
                    x++;
                }
            }else {
                if(!left[x][y]) {
                    answer++;
                    left[x][y] = true;
                    if(x == 0) {
                        continue;
                    }else {
                        right[x-1][y] = true;
                    }
                }
                if(x == 0) {
                    continue;
                }else {
                    x--;
                }
            }
        }

        return answer;
    }
}
