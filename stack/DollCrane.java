import java.util.Stack;

public class DollCrane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for(int i = 0; i < moves.length; i++) {
            for(int j = 0; j < board.length; j++) {
                int current = board[j][moves[i]-1];
                if(current != 0) {
                    if(stack.peek() == current) {
                        stack.pop();
                        answer += 2;
                    }else {
                        stack.push(current);
                    }
                    board[j][moves[i]-1] = 0;
                    break;
                }else {
                    continue;
                }
            }
        }
        return answer;
    }
}
