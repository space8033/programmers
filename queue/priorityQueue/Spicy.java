import java.util.PriorityQueue;

public class Spicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++) {
            priorityQueue.offer(scoville[i]);
        }

        while (priorityQueue.peek() <= K) {
            if(priorityQueue.size() == 1) {
                answer = -1;
                break;
            }

            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            int c = a + b * 2;

            priorityQueue.offer(c);
            answer++;
        }

        return answer;
    }
}
