import java.util.LinkedList;
import java.util.Queue;

public class ShortestLength {
    public int solution(int[][] maps) {
        int answer = 0;
        int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<Position> queue = new LinkedList<>();
        int[][] count = new int[maps.length][maps[0].length];

        queue.add(new Position(0, 0));
        count[0][0] = 1;

        while (!queue.isEmpty()) {
            Position current = queue.poll();
            int currentCount = count[current.y][current.x];

            for (int i = 0; i < 4; i++) {
                Position p = new Position(current.x + direction[i][0], current.y + direction[i][1]);

                if (p.x < 0 || p.y < 0 || p.x == maps[0].length || p.y == maps.length) {
                    continue;
                }
                if (maps[p.y][p.x] == 0) {
                    continue;
                }

                count[p.y][p.x] = currentCount + 1;
                maps[p.y][p.x] = 0;
                queue.add(p);
            }
        }

        answer = count[maps.length - 1][maps[0].length - 1];

        if (answer == 0) {
            return -1;
        }
        return answer;
    }
}
class Position {
    int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

