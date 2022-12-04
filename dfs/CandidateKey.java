import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CandidateKey {
    List<String> candidate = new ArrayList<>();

    public int solution(String[][] relation) {
        int answer = 0;

        for(int i = 0; i < relation[0].length; i++) {
            boolean[] visited = new boolean[relation[0].length];
            dfs(visited, 0 , 0, i + 1, relation);
        }

        answer = candidate.size();

        return answer;
    }

    public void dfs(boolean[] visited, int start, int depth, int end, String[][] relation) {
        if(depth == end) {
            List<Integer> list = new ArrayList<>();
            String key = "";

            for(int i = 0; i < visited.length; i++) {
                if(visited[i]) {
                    key += String.valueOf(i);
                    list.add(i);
                }
            }

            Map<String, Integer> map = new HashMap<>();

            for(int i = 0; i <relation.length; i++) {
                String s = "";
                for(Integer j : list) {
                    s += relation[i][j];
                }

                if (map.containsKey(s)) {
                    return;
                }else {
                    map.put(s, 0);
                }
            }

            for(String s : candidate) {
                int cnt = 0;
                for(int i = 0; i < key.length(); i++) {
                    String sub = String.valueOf(key.charAt(i));

                    if(s.contains(sub)) {
                        cnt++;
                    }
                }

                if(cnt == s.length()) {
                    return;
                }
            }
            candidate.add(key);
            return;
        }

        for(int i = start; i < visited.length; i++) {
            if(visited[i]) {
                continue;
            }
            visited[i] = true;
            dfs(visited, i, depth + 1, end, relation);
            visited[i] = false;
        }
    }
}
