import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ReportResponse {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> reporterMap = new HashMap<>();
        HashMap<String, Integer> reportedCnt = new HashMap<>();
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

        for(String info : reportSet) {
            String reporter = info.split(" ")[0];
            String reported = info.split(" ")[1];

            reporterMap.putIfAbsent(reporter, new HashSet<String>() {{add(reported);}});
            reporterMap.get(reporter).add(reported);
            reportedCnt.put(reported, reportedCnt.getOrDefault(reported, 0) + 1);
        }

        for(String reported : reportedCnt.keySet()) {
            int cnt = reportedCnt.get(reported);
            if(cnt >= k) {
                for(int i = 0; i < id_list.length; i++) {
                    if(reporterMap.containsKey(id_list[i]) && reporterMap.get(id_list[i]).contains(reported)) {
                        answer[i]++;
                    }
                }
            }
        }

        return answer;
    }
}
