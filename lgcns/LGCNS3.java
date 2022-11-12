import java.util.*;
//성공한듯.
// reference의 부분배열들로 track이 나누어질 때, 부분배열의 길이 중 가장 짧은 부분배열의 길이가 점수가됨.
//점수 구하기

public class LGCNS3 {
    public int solution(String reference, String track) {
        int answer = 10000;
        Queue<Character> queue = new LinkedList<>();
        for(int i = 0; i < track.length(); i++) {
            queue.add(track.charAt(i));
        }

        String s = "";
        while (queue.size() >= 1) {
            for(int i = 0; i < queue.size(); i++) {
                char c = queue.poll();
                s += c;
                if(reference.contains(s)) {
                    continue;
                }else {
                    answer = Math.min(s.length()-1, answer);
                    s = c + "";
                    break;
                }
            }

        }

        return answer;
    }

}
