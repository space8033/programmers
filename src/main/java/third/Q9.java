package third;

public class Q9 {
    public String solution(int age) {
        String answer = "";
        String sAge = String.valueOf(age);
        int[] arr = new int[sAge.length()];

        for(int i = 0; i < sAge.length(); i ++) {
            arr[i] = sAge.charAt(i) - '0';
        }

        char[] alphabet = new char[26];

        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (97 + i);
        }

        for(int i = 0; i < arr.length; i++) {
            answer += alphabet[arr[i]];
        }

        return answer;
    }
}
