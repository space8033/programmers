public class DartGame {
    public int solution(String dartResult) {
        int answer = 0;
        String str = "";
        int[] arr = new int[3];
        int index = 0;

        for(int i  = 0; i< dartResult.length(); i++) {
            switch (dartResult.charAt(i)) {
                case '*':
                    arr[index-1] *= 2;
                    if(index > 1) {
                        arr[index-2] *= 2;
                    }
                    break;
                case '#':
                    arr[index-1] *= -1;
                    break;
                case 'S':
                    arr[index] = (int) Math.pow(Integer.parseInt(str),1);
                    index++;
                    str = "";
                    break;
                case 'D':
                    arr[index] = (int) Math.pow(Integer.parseInt(str),2);
                    index++;
                    str = "";
                    break;
                case 'T':
                    arr[index] = (int) Math.pow(Integer.parseInt(str),3);
                    index++;
                    str = "";
                    break;
                default:
                    str += String.valueOf(dartResult.charAt(i));
                    break;
            }
        }

        for(int i = 0; i < 3; i++) {
            answer += arr[i];
        }

        return answer;
    }
}
