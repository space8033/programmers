public class SafetyZone {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] tmp = new int[board.length + 2][board[0].length + 2];

        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 1) {
                    tmp[i][j] = 1;
                    tmp[i][j+1] = 1;
                    tmp[i][j+2] = 1;
                    tmp[i+1][j] = 1;
                    tmp[i+1][j+1] = 1;
                    tmp[i+1][j+2] = 1;
                    tmp[i+2][j] = 1;
                    tmp[i+2][j+1] = 1;
                    tmp[i+2][j+2] = 1;
                }
            }
        }

        for(int i = 1; i < tmp.length - 1; i++) {
            for(int j = 1; j < tmp.length -1; j++) {
                if(tmp[i][j] != 1) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
