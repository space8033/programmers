import java.util.ArrayList;
import java.util.List;

public class LiningMethod {
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        List<Integer> list = new ArrayList<>();

        long a = 1;
        for(int i = 1; i <= n; i++) {
            list.add(i);
            a *= i;
        }

        k--;
        int index = 0;
        while (index < n) {
            a /= (n - index);
            answer[index++] = list.remove((int) (k/a));
            k %= a;
        }

        return answer;
    }
}
