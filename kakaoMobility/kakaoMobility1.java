import java.util.HashSet;

//flowers가 여러 꽃의 [피는날, 지는날]의 배열로 주어질 때 하나 이상의 꽃이 피어있는 날의 수 리턴하기
public class KakaoMobility1 {
    public int solution(int[][] flowers) {
        int answer = 0;
        HashSet<Integer> blooms = new HashSet<>();

        for(int i = 0; i < flowers.length; i++) {
            for(int j = flowers[i][0]; j < flowers[i][1]; j++) {
                blooms.add(j);
            }
        }

        answer = blooms.size();

        return answer;
    }
}
