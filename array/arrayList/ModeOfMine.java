
public class Mode {
    public int solution(int[] array) {
        int answer = 0;
        int arrMax = 0;

        for(int i = 0; i < array.length; i++) {
            if(arrMax < array[i]) {
                arrMax = array[i];
            }
        }

        int[] cnt = new int[arrMax + 1];

        for(int i = 0; i < array.length; i++) {
            cnt[array[i]]++;
        }

        int cntMax = 0;
        int repeat = 0;
        int index = 0;

        for(int i = 0; i < cnt.length; i++) {
            if(cntMax < cnt[i]) {
                cntMax = cnt[i];
                index = i;
            }
        }
        for(int i = 0; i < cnt.length; i++) {
            if(cnt[i] == cntMax) {
                repeat++;
            }
        }

        if(repeat > 1) {
            answer = -1;
        }else {
            answer = index;
        }
        return answer;
    }
}
