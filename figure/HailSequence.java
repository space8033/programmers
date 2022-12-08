public class HailSequence {
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        int cnt = count(k);
        double[] value = new double[cnt + 1];
        value[0] = k;
        for(int i = 1; i < cnt + 1; i++) {
            value[i] = calculate(value[i-1]);
        }

        double[] area = new double[cnt + 1];
        for(int i = 1; i < cnt + 1; i++) {
            area[i] = (value[i-1] + value[i]) / 2;
        }

        double[] sum = new double[cnt + 1];
        sum[1] = area[1];
        for(int i = 2; i < cnt + 1; i++) {
            sum[i] = sum[i-1] + area[i];
        }

        for(int i = 0; i < ranges.length; i++) {
            int start = ranges[i][0];
            int end = ranges[i][1] + cnt;
            if(start < end) {
                double val = sum[end] - sum[start];
                String s = String.format("%.1f", val);
                answer[i] = Double.parseDouble(s);
            }else if(start > end){
                answer[i] = -1.0;
            }else {
                answer[i] = 0.0;
            }
        }

        return answer;
    }

    public int count(int k) {
        int cnt = 0;
        while (k > 1) {
            if(k % 2 == 0) {
                k /= 2;
            }else {
                k = k * 3 + 1;
            }
            cnt++;
        }

        return cnt;
    }

    public double calculate(double a) {
        if(a % 2 == 0) {
            return a/2;
        }else {
            return a * 3 + 1;
        }
    }
}
