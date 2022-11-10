import java.util.ArrayList;

public class NewWayLength {
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;
        int y = 0;
        ArrayList<String> visit = new ArrayList<>();

        for(int i = 0; i < dirs.length(); i++) {
            int nowX = x;
            int nowY = y;

            char c = dirs.charAt(i);

            if(c == 'U' && y < 5) {
                y++;
            }else if(c == 'D' && y > -5) {
                y--;
            }else if(c == 'R' && x < 5) {
                x++;
            }else if(c == 'L' && x > -5) {
                x--;
            }

            String now = Integer.toString(nowX) + Integer.toString(nowY);
            String after = Integer.toString(x) + Integer.toString(y);

            String goLine = now + after;
            String backLine = after + now;

            if(!visit.contains(goLine) && !visit.contains(backLine) && !goLine.equals(backLine)) {
                visit.add(goLine);
                visit.add(backLine);
            }

        }

        answer = visit.size() / 2;

        return answer;
    }
}
