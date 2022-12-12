public class GroupPhoto {
    int answer = 0;
    String[] kakao = {"A", "C", "F", "J", "M", "N", "R", "T"};

    public int solution(int n, String[] data) {
        boolean[] visited = new boolean[8];
        dfs("", visited, data);

        return answer;
    }

    public void dfs(String names, boolean[] visited, String[] datum) {
        if(names.length() == 7) {
            if(check(names, datum)) {
                answer++;
            }
            return;
        }

        for(int i = 0; i < 8; i++) {
            if(!visited[i]) {
                visited[i] = true;
                String name = names + kakao[i];
                dfs(name, visited, datum);
                visited[i] = false;
            }
        }
    }

    private boolean check(String names, String[] datum) {
        for(String data : datum) {
            int p1 = names.indexOf(data.charAt(0));
            int p2 = names.indexOf(data.charAt(2));
            char c = data.charAt(3);
            int index = data.charAt(4) - '0';

            if (c == '=') {
                if(!(Math.abs(p1 - p2) == index + 1)) {
                    return false;
                }
            }else if (c == '>') {
                if(!(Math.abs(p1 - p2) > index + 1)) {
                    return false;
                }
            }else if (c == '<') {
                if(!(Math.abs(p1 - p2) < index + 1)) {
                    return false;
                }
            }
        }

        return true;
    }
}
