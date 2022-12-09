import java.util.HashSet;

public class MakeStar {
    public String[] solution(int[][] line) {
        String[] answer;
        HashSet<Point> set = new HashSet<>();
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;

        for(int i = 0 ;i < line.length; i++) {
            long a = line[i][0];
            long b = line[i][1];
            long e = line[i][2];

            for(int j = i + 1; j < line.length; j++) {
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];

                long adbc = a * d - b * c;
                if(adbc == 0) {
                    continue;
                }
                long bfed = b * f - e * d;
                if(bfed % adbc != 0) {
                    continue;
                }
                long ecaf = e * c - a * f;
                if(ecaf % adbc != 0) {
                    continue;
                }

                set.add(new Point(bfed / adbc, ecaf / adbc));

                minX = Math.min(minX, bfed / adbc);
                minY = Math.min(minY, ecaf / adbc);
                maxX = Math.max(maxX, bfed / adbc);
                maxY = Math.max(maxY, ecaf / adbc);
            }
        }

        long height = maxY - minY + 1;
        long width = maxX - minX + 1;
        answer = new String[(int)height];

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < width; i++) {
            sb.append(".");
        }
        for(int i = 0; i < height; i++) {
            answer[i] = sb.toString();
        }

        long x,y;
        for(Point p : set) {
            y = maxY - p.y;
            x = p.x - minX;

            answer[(int)y] = answer[(int)y].substring(0, (int)x) + "*" + answer[(int)y].substring((int)(x + 1));
        }
        return answer;
    }

    public class Point {
        long x;
        long y;
        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
}
