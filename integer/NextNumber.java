public class NextNumber {
    public int solution(int[] common) {
        int answer = 0;

        if(common.length == 2) {
            answer = common[1] * 2 - common[0];
        }else {
            if(common[1] - common[0] == common[2] - common[1]) {
                answer = common[common.length-1] + common[1] - common[0];
            }else {
                answer = common[common.length-1] * common[1] / common[0];
            }
        }

        return answer;
    }
}
