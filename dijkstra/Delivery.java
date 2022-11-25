public class Delivery {
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        int[][] map = new int[N+1][N+1];

        for(int i = 1; i < N + 1; i++) {
            for(int j = 1; j < N + 1; j++) {
                if(i == j) {
                    continue;
                }else {
                    map[i][j] = 500001;
                }
            }
        }

        for(int i = 0; i < road.length; i++) {
            int v1 = road[i][0];
            int v2 = road[i][1];
            int d = road[i][2];

            if(map[v1][v2] > d) {
                map[v1][v2] = d;
                map[v2][v1] = d;
            }
        }

        int[] distance = new int[N+1];
        for(int i = 2; i <= N; i++) {
            if(distance[i] == 0) {
                distance[i] = 500001;
            }else {
                distance[i] = map[1][i];
            }
        }

        boolean[] visited = new boolean[N+1];
        visited[1] = true;

        for(int i = 1; i <= N - 1; i++) {
            int min = 500001;
            int index = 1;

            for(int j = 2; j <= N; j++) {
                if(!visited[j] && distance[j] < min) {
                    min = distance[j];
                    index = j;
                }
            }

            visited[index] = true;

            for(int j = 2; j <= N; j++) {
                if(distance[j] > distance[index] + map[index][j]) {
                    distance[j] = distance[index] + map[index][j];
                }
            }
        }

        for(int i = 1; i <= N; i++) {
            if(distance[i] <= K) {
                answer++;
            }
        }

        return answer;
    }
}
