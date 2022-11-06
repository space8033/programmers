import java.util.HashMap;
import java.util.Map;

public class OpenChat {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        int cnt = 0;

        for(int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");

            if(info[0].equals("Leave")) {
                continue;
            }else if(info[0].equals("Enter")) {
                map.put(info[1], info[2]);
            }else {
                map.put(info[1], info[2]);
                cnt++;
            }
        }

        String[] answer = new String[record.length - cnt];
        int index = 0;

        for(int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            String nickname = map.get(info[1]);

            if(info[0].equals("Enter")) {
                answer[index++] = nickname + "님이 들어왔습니다.";
            }else if(info[0].equals("Leave")) {
                answer[index++] = nickname + "님이 나갔습니다.";
            }
        }

        return answer;
    }
}
