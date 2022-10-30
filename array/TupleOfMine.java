public class TupleOfMine {
    public int[] solution(String s) {
        s = s.substring(2);
        s = s.substring(0, s.length()-2);
        s = s.replace("},{", "-");

        String[] arr = s.split("-");
        int length = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() > length) {
                length = arr[i].length();
                index = i;
            }
        }

        String[] tuple = arr[index].split(",");
        int[] answer = new int[tuple.length];
        int[] cnt = new int[tuple.length];

        for(int i = 0; i < tuple.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j].contains(tuple[i])) {
                    cnt[i]++;
                }
            }
        }

        for(int i = 0; i < tuple.length; i++) {
            for(int j = 0; j < tuple.length; j++) {
                if(cnt[j] == tuple.length - i) {
                    answer[i] = Integer.parseInt(tuple[j]);
                }
            }
        }

        return answer;
    }
}
