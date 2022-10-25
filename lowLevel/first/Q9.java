package first;

public class Q9 {
    public String solution(String rsp) {
        String answer = "";
        char[] arr = rsp.toCharArray();
        for(int i =0; i < arr.length; i ++) {
            if(arr[i] == '2') {
                answer += '0';
            }else if ( arr[i] == '0') {
                answer += '5';
            }else {
                answer += '2';
            }
        }
        return answer;
    }
}
