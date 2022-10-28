public class CoordinateGame {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;

        for(int i = 0 ; i < keyinput.length; i++) {
            if(keyinput[i].equals("right")) {
                x++;
            }else if(keyinput[i].equals("left")) {
                x--;
            }else if(keyinput[i].equals("up")) {
                y++;
            }else {
                y--;
            }

            if(x >= 0) {
                x = Math.min(board[0]/2, x);
            }else {
                x = Math.max(-board[0]/2, x);
            }

            if(y >= 0) {
                y = Math.min(board[1]/2, y);
            }else {
                y = Math.max(-board[1]/2, y);
            }
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }
}
