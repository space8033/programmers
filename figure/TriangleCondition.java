public class TriangleCondition {
    public int solution(int[] sides) {
        int answer = 0;
        int longer = Math.max(sides[0], sides[1]);
        int shorter = Math.min(sides[0], sides[1]);

        answer = shorter + shorter - 1;

        return answer;
    }
}
