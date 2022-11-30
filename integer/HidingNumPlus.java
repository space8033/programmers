public class HidingNumPlus {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
                sb.append(" ");
            }else if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) {
                sb.append(" ");
            }else {
                sb.append(my_string.charAt(i));
            }
        }
        String s = sb.toString();
        String[] arr = s.split(" ");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].isEmpty()) {
                continue;
            }else {
                arr[i].replace(" ", "");
                answer += Integer.parseInt(arr[i]);
            }
        }

        return answer;
    }
}
