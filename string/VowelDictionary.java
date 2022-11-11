import java.util.Arrays;
import java.util.LinkedHashSet;

public class VowelDictionary {
    public int solution(String word) {
        int answer = 0;
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        String[] vowel = new String[]{"","A","E","I","O","U"};
        for(int a = 0; a < 6; a++) {
            for(int b = 0; b < 6; b++) {
                for(int c = 0; c < 6; c++) {
                    for(int d = 0; d< 6; d++) {
                        for(int e = 0; e < 6; e++) {
                            String s = vowel[a] + vowel[b] + vowel[c] + vowel[d] + vowel[e];
                            hashSet.add(s);
                        }
                    }
                }
            }
        }

        String[] dictionary = hashSet.toArray(new String[]{});
        Arrays.sort(dictionary);

        for(int i = 0; i < dictionary.length; i++) {
            if(dictionary[i].equals(word)) {
                answer = i;
            }
        }

        return answer;
    }
}
