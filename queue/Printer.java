import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Work> queue = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++) {
            queue.add(new Work(priorities[i],i));
        }

        while (!queue.isEmpty()) {
            boolean isLargest = true;
            Work current = queue.poll();

            for(Work work : queue) {
                if(work.priority > current.priority) {
                    isLargest = false;
                }
            }

            if(!isLargest) {
                queue.add(current);
            }else {
                answer++;
                if(current.location == location) {
                    break;
                }
            }
        }

        return answer;
    }

    class Work {
        int priority;
        int location;

        public Work(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }
}
