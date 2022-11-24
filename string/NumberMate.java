public class NumberMate {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        cnt(X, arrX);
        cnt(Y, arrY);

        for(int i = arrX.length-1; i >= 0; i--) {
            while (arrX[i] >= 1 && arrY[i] >= 1) {
                arrX[i]--;
                arrY[i]--;

                answer.append(i);
            }
        }

        if(answer.toString().equals("")) {
            return "-1";
        }else if(answer.toString().startsWith("0")) {
            return "0";
        }else {
            return answer.toString();
        }
    }

    public void cnt(String s, int[] arr) {
        for(int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - '0';
            arr[index]++;
        }
    }
}
