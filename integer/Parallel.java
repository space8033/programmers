public class Parallel {
    public int solution(int[][] dots) {
        if(line(dots[0][0], dots[0][1], dots[1][0], dots[1][1]) == line(dots[2][0], dots[2][1], dots[3][0], dots[3][1])) {
            return 1;
        }else if(line(dots[0][0], dots[0][1], dots[2][0], dots[2][1]) == line(dots[1][0], dots[1][1], dots[3][0], dots[3][1])){
            return 1;
        }else if(line(dots[0][0], dots[0][1], dots[3][0], dots[3][1]) == line(dots[2][0], dots[2][1], dots[1][0], dots[1][1])){
            return 1;
        }else {
            return 0;
        }
    }

    public double line(int x1, int y1, int x2, int y2) {
        return (double) (x1 - x2) / (y1 - y2);
    }
}
