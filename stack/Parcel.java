import java.util.Stack;

public class Parcel {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int number = 1;
        int index = 0;

        while (true) {
            if(!stack.isEmpty() && order[index] == stack.peek()) {
                answer++;
                index++;
                stack.pop();
                continue;
            }

            if(number > order.length) {
                break;
            }

            if(order[index] == number) {
                answer++;
                index++;
                number++;
                continue;
            }

            stack.push(number);
            number++;
        }

        return answer;
    }
}
