import java.util.ArrayList;
import java.util.Arrays;

public class UnfinishedPlayer {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        ArrayList arrayParticipant = new ArrayList(Arrays.asList(participant));
        ArrayList arrayCompletion = new ArrayList(Arrays.asList(completion));

        arrayCompletion.add("-1");

        for(int i = 0; i < arrayCompletion.size(); i++) {
            if(!arrayParticipant.get(i).equals(arrayCompletion.get(i))) {
                answer = (String) arrayParticipant.get(i);
                break;
            }
        }
        return answer;
    }
}
