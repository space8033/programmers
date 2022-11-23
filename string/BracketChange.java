public class BracketChange {
    public String solution(String p) {
        String answer = "";

        if(check(p)) {
            return p;
        }

        answer = split(p);

        return answer;
    }

    public boolean check(String str) {
        int open = 0;

        if(str.charAt(0) == ')') {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                open++;
            }else {
                open--;
                if(open < 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public String split(String s) {
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();

        if(s.length() == 0) {
            return "";
        }

        int open = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                open++;
            }else {
                open--;
            }
            if(open == 0) {
                u.append(s.substring(0, i+1));
                v.append(s.substring(i+1, s.length()));

                if(check(u.toString())) {
                    u.append(split(v.toString()));
                }else {
                    StringBuilder str = new StringBuilder();
                    str.append("(");
                    str.append(split(v.toString()));
                    str.append(")");
                    str.append(reverse(u.toString()));

                    return str.toString();
                }
                break;
            }

        }
        return u.toString();
    }

    public String reverse(String str) {
        StringBuilder s = new StringBuilder();

        for(int i = 1; i < str.length()-1; i++) {
            if(str.charAt(i) == '(') {
                s.append(")");
            }else {
                s.append("(");
            }
        }

        return s.toString();
    }
}
