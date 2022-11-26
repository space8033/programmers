import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

// 물품을 구매하는 고객은 하루 최대 10%할인 쿠폰을 1개 받을 수 있다.
// 고객 한명당 최대 k개까지 쿠폰을 받을 수 있다.
// 고객들의 id list가 주어질 때, 발급하는 총 쿠폰의 수를 구하라.
// id list에 같은 고객이 들어있을 수 있음.

public class KakaoMobility2 {
    public int solution(String[] id_list, int k) {
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < id_list.length; i++) {
            String[] clients = id_list[i].split(" ");
            HashSet<String> overlap = new HashSet<>();

            for(int j = 0; j < clients.length; j++) {
                overlap.add(clients[j]);
            }

            for(String id : overlap) {
                map.put(id, map.getOrDefault(id,0) + 1);
            }
        }

        Iterator<Integer> count = map.values().iterator();

        while (count.hasNext()) {
            answer += Math.min(count.next(), k);
        }

        return answer;
    }
}
