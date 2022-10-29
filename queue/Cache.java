import java.util.LinkedList;

public class Cache {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0) {
            return cities.length * 5;
        }
        int answer = 0;

        LinkedList<String> list = new LinkedList<>();

        for(int i = 0; i < cities.length; i++) {
            String s = cities[i].toUpperCase();
            if(list.remove(s)) {
                answer += 1;
                list.add(s);
            }else {
                answer += 5;
                if(list.size() >= cacheSize) {
                    list.remove(0);
                }
                list.add(s);
            }
        }

        return answer;
    }
}
