
import java.util.ArrayList;

public class Maximizing {
    ArrayList<Long> nums = new ArrayList<>();
    ArrayList<Character> opers = new ArrayList<>();
    long answer = 0L;

    public long solution(String expression) {
        char[] operators = {'*', '+', '-'};
        char[] oper = new char[3];
        boolean[] check = new boolean[3];

        stringToArray(expression);
        dfs(0, operators, oper, check);

        return answer;
    }

    public void stringToArray(String ex){
        String num = "";

        for(int i = 0; i < ex.length(); i++){
            if(Character.isDigit(ex.charAt(i))) num += ex.charAt(i);
            else{
                nums.add(Long.parseLong(num));
                opers.add(ex.charAt(i));
                num = "";
            }
        }
        nums.add(Long.parseLong(num));
    }
    public void dfs(int idx, char[] operators, char[] oper, boolean[] check){
        if(idx == 3) calcFormula(oper);
        else{
            for(int i = 0; i < 3; i++){
                if(!check[i]){
                    check[i] = true;
                    oper[idx] = operators[i];
                    dfs(idx+1, operators, oper, check);
                    check[i] = false;
                }
            }
        }
    }
    public void calcFormula(char[] oper){
        ArrayList<Long> tmpNums = new ArrayList<>(nums);
        ArrayList<Character> tmpOpers = new ArrayList<>(opers);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < tmpOpers.size(); j++){
                if(tmpOpers.get(j) == oper[i]){
                    long result = calculate(tmpNums.remove(j), tmpNums.remove(j), tmpOpers.remove(j));
                    tmpNums.add(j--, result);
                }
            }
        }
        answer = Math.max(answer, Math.abs(tmpNums.get(0)));
    }
    public long calculate(long n1, long n2, char c){
        switch(c){
            case '-': return n1 - n2;
            case '+': return n1 + n2;
            default : return n1 * n2;
        }
    }
}
