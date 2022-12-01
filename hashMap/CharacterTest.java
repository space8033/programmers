import java.util.HashMap;

public class CharacterTest {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = {3, 2, 1, 0, 1, 2, 3};
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R',0);
        map.put('T',0);
        map.put('C',0);
        map.put('F',0);
        map.put('J',0);
        map.put('M',0);
        map.put('A',0);
        map.put('N',0);

        for(int i = 0; i < survey.length; i++) {
            if(choices[i] <= 4) {
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + score[choices[i] - 1]);
            }else {
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + score[choices[i] - 1]);
            }
        }

        int R = map.get('R');
        int T = map.get('T');
        int C = map.get('C');
        int F = map.get('F');
        int J = map.get('J');
        int M = map.get('M');
        int A = map.get('A');
        int N = map.get('N');

        StringBuilder sb = new StringBuilder();
        if(R >= T) {
            sb.append("R");
        }else {
            sb.append("T");
        }
        if(C >= F) {
            sb.append("C");
        }else {
            sb.append("F");
        }
        if(J >= M) {
            sb.append("J");
        }else {
            sb.append("M");
        }
        if(A >= N) {
            sb.append("A");
        }else {
            sb.append("N");
        }

        answer = sb.toString();

        return answer;
    }
}
