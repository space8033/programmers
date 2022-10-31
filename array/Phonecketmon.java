public class Phonecketmon {
    public int solution(int[] nums) {
        int answer = 0;
        int half = nums.length / 2;
        int cnt = 0;

        for(int i = 0; i < nums.length; i++) {
            boolean exist = true;
            for(int j = 0; j < i; j++) {
                if(nums[i] == nums[j]) {
                    exist = false;
                    break;
                }
            }

            if(exist) {
                cnt++;
            }
        }

        answer = Math.min(half, cnt);

        return answer;
    }
}
