public class FriendsBlock {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] arr = new char[m][n];
        for(int i = 0; i < m; i++) {
            arr[i] = board[m-i-1].toCharArray();
        }

        while (true) {
            boolean exist = true;
            boolean[][] check = new boolean[m][n];

            for(int i = 0; i < m - 1; i++) {
                for(int j = 0; j < n - 1; j++) {
                    if(arr[i][j] == '0') {
                        continue;
                    }

                    char c = arr[i][j];
                    if(c == arr[i+1][j] && c == arr[i][j+1] && c == arr[i+1][j+1]){
                        check[i][j] = true;
                        check[i+1][j] = true;
                        check[i][j+1] = true;
                        check[i+1][j+1] = true;
                        exist = false;
                    }
                }
            }

            if(exist) {
                break;
            }

            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(check[i][j]) {
                        arr[i][j] = '0';
                        answer++;
                    }
                }
            }

            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if(arr[i][j] == '0') {
                        for(int k = i; k < m; k++) {
                            if(arr[k][j] == '0') {
                                continue;
                            }
                            arr[i][j] = arr[k][j];
                            arr[k][j] = '0';
                            break;
                        }
                    }
                }
            }
        }

        return answer;
    }
}
