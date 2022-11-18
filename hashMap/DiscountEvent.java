import java.util.HashMap;
import java.util.Map;

public class DiscountEvent {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < want.length; i++) {
            map.put(want[i], i);
        }

        int total  = 0;
        for(int i = 0; i < number.length; i++) {
            total += number[i];
        }
        int start = 0;
        int end = total-1;

        int[] arr = new int[number.length];
        for(int i = 0; i < total; i++) {
            if(map.containsKey(discount[i])) {
                arr[map.get(discount[i])]++;
            }
        }

        while (true) {
            if(check(number, arr)){
                answer++;
            }
            if(map.containsKey(discount[start])) {
                arr[map.get(discount[start])]--;
            }

            start++;
            end++;

            if(end == discount.length) {
                break;
            }
            if(map.containsKey(discount[end])) {
                arr[map.get(discount[end])]++;
            }
        }

        return answer;
    }

    public boolean check(int[] number, int[] arr) {
        for(int i = 0; i < number.length; i++) {
            if(number[i] > arr[i]) {
                return false;
            }
        }
        return true;
    }
}
