//멀티탭 문제.
//1번 멀티탭으로부터 나머지 멀티탭들이 전력을 얻음.
//연결된 socket 하나당 전력이 k씩사용됨.
//각 멀티탭당 전력 제한은 limits[] 일때,
//socket배열에서 최소 몇개의 소켓 코드를 뽑아내야 전력 제한을 맞출 수 있는가.
public class LGCNS2 {
    public int solution(int k , int[] limits, int[][] sockets) {
        int answer = 0;
        int[] socketConnect = new int[limits.length];
        int[] multiConnect = new int[limits.length];

        for(int i = 0; i < sockets.length; i++) {
            for(int j = 0; j < 5; j++) {
                if(sockets[i][j] == -1) {
                    socketConnect[i]++;
                }
                if(sockets[i][j] != -1 && sockets[i][j] != 0) {
                    multiConnect[i]++;
                }
            }
        }

        for(int i = 0; i < limits.length; i++) {
            while (limits[i] >= k * socketConnect[i]) {
                answer++;
                socketConnect[i]--;
            }
        }

        return answer;
    }
}
