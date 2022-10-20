package fifth;

public class Q10 {
    public String solution(String letter) {
        String answer = "";
        String[] morse = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] ofLetter = letter.split(" ");

        for(int i = 0; i < ofLetter.length; i++) {
            char alphabet = 0;

            for(int j = 0; j < 26; j ++) {
                if(morse[j].equals(ofLetter[i])) {
                    alphabet = (char)(j+97);
                }
            }
            answer += alphabet;
        }
        return answer;
    }
}
