public class Country124 {
    public String solution(int n) {
        String answer = "";
        String[] arr = {"4", "1", "2"};

        while (n > 0) {
            int remain = n % 3;
            n /= 3;

            if(remain == 0) {
                n--;
            }

            answer = arr[remain] + answer;
        }

        return answer;
    }
}
