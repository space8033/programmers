import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {

        String[] arr = s.substring(2, s.length() - 2).split("},\\{");
        ArrayList<String> result = new ArrayList<>();

        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        for(int i = 0; i < arr.length; i++){
            for(String str : arr[i].split(",")){

                if(!result.contains(str)) result.add(str);
            }
        }

        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) answer[i] = Integer.parseInt(result.get(i));

        return answer;
    }
}