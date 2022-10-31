import java.util.HashMap;
import java.util.Iterator;

public class Camouflage {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        Iterator<Integer> cnt = map.values().iterator();

        while (cnt.hasNext()) {
            answer *= cnt.next().intValue() + 1;
        }
        answer--;

        return answer;
    }
}
