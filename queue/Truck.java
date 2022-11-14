import java.util.LinkedList;
import java.util.Queue;

public class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int cnt = 0;
        int sum = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < truck_weights.length; i++) {
            while (true) {
                if(queue.isEmpty()) {
                    queue.add(truck_weights[i]);
                    sum += truck_weights[i];
                    cnt++;
                    break;
                }else if (queue.size() == bridge_length) {
                    sum -= queue.poll();
                }else {
                    if(sum + truck_weights[i] <= weight) {
                        queue.add(truck_weights[i]);
                        sum += truck_weights[i];
                        cnt++;
                        break;
                    }else {
                        queue.add(0);
                        cnt++;
                    }
                }
            }
        }

        answer = cnt + bridge_length;

        return answer;
    }
}
