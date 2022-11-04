public class TargetNumber {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        answer = dfs(numbers, target, 0, 0);

        return answer;
    }

    public int dfs(int[] numbers, int target, int depth, int sum) {
        int cnt = 0;

        if(depth == numbers.length) {
            if(sum == target) {
                return 1;
            }
            return 0;
        }

        cnt += dfs(numbers, target, depth + 1, sum+numbers[depth]);
        cnt += dfs(numbers, target, depth + 1, sum-numbers[depth]);

        return cnt;
    }
}
