import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Compact {
    public int[] solution(String msg) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int index = 1;

        for(char i = 'A'; i <= 'Z'; i++) {
            map.put(i + "", index++);
        }

        int size = msg.length();
        for(int i = 0; i < size; i++) {
            int a = 1;
            while (i + a <= size && map.containsKey(msg.substring(i, i+a))) {
                a++;
            }
            if(i + a > size) {
                answer = Arrays.copyOf(answer, answer.length + 1);
                answer[answer.length-1] = map.get(msg.substring(i));
                break;
            }
            answer = Arrays.copyOf(answer, answer.length + 1);
            answer[answer.length-1] = map.get(msg.substring(i, i + a - 1));

            map.put(msg.substring(i, i + a), index++);

            if(a > 1) {
                i += a - 2;
            }

        }
        return answer;
    }
}
