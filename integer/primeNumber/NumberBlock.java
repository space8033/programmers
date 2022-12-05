public class NumberBlock {
    public int[] solution(long begin, long end) {
        int[] answer = new int[(int) (end - begin + 1)];

        for(long i = begin; i <= end; i++) {
            if(i == 1) {
                answer[(int)(i - begin)] = 0;
            }else {
                answer[(int)(i - begin)] = (int)minimumFactor(i);
            }
        }

        return answer;
    }

    public long minimumFactor(long a) {
        for(long i = 2; i * i <= a; i++) {
            if(a % i == 0) {
                if(a / i > 10000000) {
                    continue;
                }
                return a / i;
            }
        }
        return 1;
    }
}
