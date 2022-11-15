public class KeyPad {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int curLeft = 10;
        int curRight = 12;

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                curLeft = numbers[i];
            }else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                curRight = numbers[i];
            }else {
                if(numbers[i] == 0) {
                    numbers[i] = 11;
                }
                int lLength = Math.abs(numbers[i] - curLeft) / 3 + Math.abs(numbers[i] - curLeft) % 3;
                int rLength = Math.abs(numbers[i] - curRight) / 3 + Math.abs(numbers[i] - curRight) % 3;

                if(lLength > rLength) {
                    answer += "R";
                    curRight = numbers[i];
                }else if (lLength < rLength) {
                    answer += "L";
                    curLeft = numbers[i];
                }else {
                    if(hand.equals("right")) {
                        answer += "R";
                        curRight = numbers[i];
                    }else {
                        answer += "L";
                        curLeft = numbers[i];
                    }
                }
            }
        }

        return answer;
    }
}
