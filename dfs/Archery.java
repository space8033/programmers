public class Archery {
    int max;
    int[] answer;
    public int[] solution(int n, int[] info) {
        answer = new int[11];

        dfs(0, n, 0, new int[n], info);

        if(max == 0) {
            return new int[]{-1};
        }

        return answer;
    }

    public void dfs(int start, int r, int index, int[] result, int[] info) {
        if(index == r) {
            int ryan = 0;
            int apeach = 0;

            int[] info2 = new int[11];
            for(int i = 0; i < result.length; i++) {
                info2[10 - result[i]]++;
            }

            for(int i = 0; i < 11; i++) {
                int score = 10 - i;
                if(info2[i] > info[i]) {
                    ryan += score;
                }else if(info2[i] < info[i]) {
                    apeach += score;
                }else if(info[i] != 0 && info2[i] == info[i]) {
                    apeach += score;
                }
            }

            if(ryan - apeach > max) {
                max = ryan - apeach;
                answer = info2;
            }

            return;
        }

        for(int i = start; i < 11; i++) {
            result[index] = i;
            dfs(i, r, index + 1, result, info);
        }
    }
}
