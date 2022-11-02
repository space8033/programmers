public class MakePrimeNum {
    public int solution(int[] nums) {
        int answer = 0;
        boolean check = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if (num >= 2)
                        check = prime(num);
                    if (check == true)
                        answer++;
                }
            }

        }
        return answer;
    }

    public boolean prime(int num) {
        boolean check = true;

        if(num==2) {
            return check;
        }

        for(int i=2; i<num; i++) {
            if(num%i ==0) {
                check = false;
                break;
            }
        }

        return check;
    }
}
