import java.util.LinkedHashSet;

public class CountingSum {
    public int solution(int[] elements) {
        int answer = 0;
        int n = elements.length;
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();

        while (n > 0) {
            for(int i = 0; i < elements.length; i++) {
                int sum = 0;
                for(int j = 0; j < n; j++) {
                    sum += elements[(i + j) % elements.length];
                }
                hashSet.add(sum);
            }
            n--;
        }

        answer = hashSet.size();
        return answer;
    }
}
