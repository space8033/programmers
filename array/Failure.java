public class Failure {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] now = new int[N];
        double[] failure = new double[N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] == i + 1) {
                    now[i]++;
                }
            }
        }

        int challenge = stages.length;
        for(int i = 0; i < N; i++) {
            if(challenge == 0) {
                failure[i] = 0;
            }else {
                failure[i] = (double) now[i] / challenge;
            }
            challenge -= now[i];
        }

        double max = 0;
        int target = 1;
        for(int i = 0; i < now.length; i++) {
            max = failure[0];
            target = 1;
            for(int j = 0; j < now.length; j++) {
                if(failure[j] > max) {
                    max = failure[j];
                    target = j + 1;
                }
            }
            failure[target-1] = -1;
            answer[i] = target;
        }

        return answer;
    }
}
