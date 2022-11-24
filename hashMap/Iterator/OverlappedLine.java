import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OverlappedLine {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < 3; i++) {
            int max = Math.max(lines[i][0], lines[i][1]);
            int min = Math.min(lines[i][0], lines[i][1]);

            for(int j = min + 1; j < max + 1; j++) {
                map.put(j, map.getOrDefault(j,0) + 1);
            }
        }

        Iterator<Integer> cnt = map.values().iterator();

        while (cnt.hasNext()) {
            if(cnt.next().intValue() >= 2) {
                answer++;
            }
        }

        return answer;
    }
}
