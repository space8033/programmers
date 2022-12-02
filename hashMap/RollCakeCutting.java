import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RollCakeCutting {
    public int solution(int[] topping) {
        int answer = 0;

        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();

        set.add(topping[0]);

        for(int i = 1; i < topping.length; i++) {
            map.put(topping[i], map.getOrDefault(topping[i], 0) + 1);
        }

        for(int i = 1; i < topping.length; i++) {
            set.add(topping[i]);

            int size = map.get(topping[i]);
            if(size == 1) {
                map.remove(topping[i]);
            }else {
                map.put(topping[i], size - 1);
            }

            if(set.size() == map.size()) {
                answer++;
            }
        }

        return answer;
    }
}
