public class Polynomial {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" \\+ ");
        int a = 0;
        int b = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].contains("x")) {
                if(arr[i].length() == 1) {
                    a += 1;
                }else {
                    a += Integer.parseInt(arr[i].replace("x", ""));
                }
            }else {
                b += Integer.parseInt(arr[i]);
            }
        }

        if(a == 0) {
            answer += b;
        }else if(b == 0) {
            answer += a + "x";
        } else {
            answer += a +"x + " + b;
        }

        if(a == 1) {
            answer = answer.substring(1);
        }

        return answer;
    }
}
