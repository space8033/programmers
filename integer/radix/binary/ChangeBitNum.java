public class ChangBitNum {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            answer[i] = find(numbers[i]);
        }

        return answer;
    }

    public long find(long a) {
        if(a % 2 == 0) {
            return a+1;
        }else {
            String s = Long.toBinaryString(a);
            int zeroIndex = s.lastIndexOf("0");
            if(zeroIndex != -1) {
                s = s.substring(0, zeroIndex) + "10" + s.substring(zeroIndex+2, s.length());
                return Long.parseLong(s,2);
            }else {
                s = "10" + s.substring(1, s.length());
                return Long.parseLong(s, 2);
            }

        }
    }
}
