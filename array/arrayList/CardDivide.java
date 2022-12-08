import java.util.ArrayList;
import java.util.List;

public class CardDivide {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        List<Integer> divisorA = getDivisor(arrayA);
        List<Integer> divisorB = getDivisor(arrayB);

        int targetA = maxNonDivisor(arrayB, divisorA);
        int targetB = maxNonDivisor(arrayA, divisorB);

        answer = Math.max(targetA, targetB);

        return answer;
    }

    public int maxNonDivisor(int[] arrays, List<Integer> divisors) {
        int target = 0;
        for(int div : divisors) {
            boolean noDivide = true;
            for(int num : arrays) {
                if(num % div == 0) {
                    noDivide = false;
                    break;
                }
            }

            if(noDivide) {
                target = Math.max(target, div);
            }
        }

        return target;
    }

    public List<Integer> getDivisor(int[] arrays) {
        List<Integer> list = new ArrayList<>();
        int length = arrays.length;
        int min = arrays[0];

        for(int i = 2; i <= min; i++) {
            boolean isDivide = true;
            for(int j = 0; j < length; j++) {
                if(arrays[j] % i != 0) {
                    isDivide = false;
                    break;
                }
            }

            if(isDivide) {
                list.add(i);
            }
        }

        return list;
    }
}
