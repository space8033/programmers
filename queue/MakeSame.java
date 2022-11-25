import java.util.ArrayDeque;
import java.util.Queue;

public class MakeSame {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        long sum1 = 0;
        long sum2 = 0;
        long sum;

        for(int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            sum1 += queue1[i];
        }
        for(int i = 0; i < queue2.length; i++) {
            q2.add(queue2[i]);
            sum2 += queue2[i];
        }
        sum = sum1 + sum2;
        if(sum % 2 == 1) {
            return -1;
        }
        long target = sum / 2;

        int cnt1 = 0;
        int cnt2 = 0;
        while (cnt1 <= queue1.length * 2 && cnt2 <= queue2.length * 2) {
            if(sum1 == target) {
                return cnt1 + cnt2;
            }
            if(sum1 > target) {
                sum1 -= q1.peek();
                sum2 += q1.peek();
                q2.offer(q1.poll());
                cnt1++;
            }else {
                sum2 -= q2.peek();
                sum1 += q2.peek();
                q1.offer(q2.poll());
                cnt2++;
            }
        }
        return -1;
    }
}
