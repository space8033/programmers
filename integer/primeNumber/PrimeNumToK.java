public class PrimeNumToK {
    public int solution(int n, int k) {
        int answer = 0;
        String s = Integer.toString(n, k);
        String[] arr = s.split("0");
        long[] num = new long[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("")) {
                continue;
            }else {
                num[i] = Long.parseLong(arr[i]);
            }
        }

        for(int i = 0; i < num.length; i++) {
            if(isPrime(num[i])) {
                answer++;
            }
        }

        return answer;
    }

    public boolean isPrime(long a) {
        if(a == 0 || a == 1) {
            return false;
        }else if(a == 2) {
            return true;
        }else {
            for(int i = 2; i <= Math.sqrt(a); i++) {
                if(a % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}
