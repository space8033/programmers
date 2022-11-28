public class LargestSquare {
    public int solution(int [][]board){
        int ans = 0;

        int sizeR = board.length;
        int sizeC = board[0].length;

        int[][] DP = new int[2][board[0].length];

        for (int i = 0; i < sizeC; i++) {
            DP[0][i] = board[0][i];
            if(DP[0][i] > ans)
                ans = DP[0][i];
        }

        for (int i = 1; i < sizeR; i++) {
            for (int j = 0; j < sizeC; j++) {
                if(board[i][j] == 0)
                    DP[1][j] = 0;
                else {
                    if(j == 0)
                        DP[1][j] = 1;
                    else {
                        DP[1][j] = 1;
                        if(DP[1][j-1] == 0 | DP[0][j] == 0 | DP[0][j-1] == 0)
                            DP[1][j] = 1;
                        else if(DP[1][j-1] == DP[0][j] && DP[0][j] == DP[0][j-1])
                            DP[1][j] = DP[0][j] + 1;
                        else {
                            if(DP[1][j-1] <= DP[0][j-1] && DP[1][j-1] <= DP[0][j])
                                DP[1][j] = DP[1][j-1] + 1;
                            else if(DP[0][j-1] <= DP[1][j-1] && DP[0][j-1] <= DP[0][j])
                                DP[1][j] = DP[0][j-1] + 1;
                            else if(DP[0][j] <= DP[0][j-1] && DP[0][j] <= DP[1][j-1])
                                DP[1][j] = DP[0][j] + 1;
                        }
                    }
                }
                if(DP[1][j] > ans)
                    ans = DP[1][j];
            }
            for (int j = 0; j < sizeC; j++) {
                DP[0][j] = DP[1][j];
            }

        }

        return ans*ans;
    }
}
