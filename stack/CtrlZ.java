import java.util.Stack;

public class CtrlZ {
    public int solution(String s) {
        int answer = 0;
        String[] a = s.split(" ");

        Stack<String> stack = new Stack<String>();

        for(int i = 0; i < a.length; i++) {
            if(a[i].equals("Z") ){
                stack.pop();
            } else {
                stack.push(a[i]);
            }
        }

        while (!stack.isEmpty()) {
            answer += Integer.parseInt(stack.pop());
        }

        return answer;
    }
}
