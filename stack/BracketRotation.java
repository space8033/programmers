import java.util.Stack;

public class BracketRotation {
    public int solution(String s) {
        int answer = 0;
        String next = s;

        for(int i = 0; i < s.length(); i++) {
            if(check(next)) {
                answer++;
            }
            next = next.substring(1) + next.charAt(0);
        }

        return answer;
    }

    public boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            try{
                switch (s.charAt(i)) {
                    case '[' :
                        stack.add('[');
                        break;
                    case '{' :
                        stack.add('{');
                        break;
                    case '(' :
                        stack.add('(');
                        break;
                    case ']' :
                        if(stack.peek() != '[') {
                            return false;
                        }
                        stack.pop();
                        break;
                    case '}' :
                        if(stack.peek() != '{') {
                            return false;
                        }
                        stack.pop();
                        break;
                    case ')' :
                        if(stack.peek() != '(') {
                            return false;
                        }
                        stack.pop();
                        break;
                }
            }catch (Exception e) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
