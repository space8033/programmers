import java.util.*;

public class Mode {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i],0) + 1);
        }

        List<Integer> cnt = new ArrayList<>();

        int cntMax = Collections.max(map.values());

        map.forEach((key, value) -> {
            if(value == cntMax) {
                cnt.add(key);
            }
        });

        if(cnt.size() > 1) {
            return -1;
        }else {
            return cnt.get(0);
        }

    }
}
