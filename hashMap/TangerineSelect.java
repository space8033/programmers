import java.util.*;

public class TangerineSelect {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        int cnt = 0;
        int index = list.size()-1;
        while (cnt < k) {
            cnt += list.get(index).getValue();
            answer++;
            index--;

            if(index == -1) {
                break;
            }
        }

        return answer;
    }
}
