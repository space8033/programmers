package seventh;

public class Q9 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for(int i = 0; i < dic.length; i++) {
            boolean a = true;
            for(int j =0; j < spell.length; j++) {
                if(dic[i].indexOf(spell[j]) == -1) {
                    a= false;
                    break;
                }
            }
            if(a) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
