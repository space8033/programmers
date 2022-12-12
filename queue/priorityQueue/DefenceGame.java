import java.util.PriorityQueue;

public class DefenceGame {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < enemy.length; i++) {
            queue.add(enemy[i]);

            if(queue.size() > k) {
                n -= queue.poll();
            }

            if(n < 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
