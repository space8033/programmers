import java.util.HashSet;

public class FindPrime {
    HashSet set = new HashSet<>();
    boolean[] visited;
    char[] arr;

    public int solution(String numbers) {
        int answer = 0;
        arr = numbers.toCharArray();
        visited = new boolean[numbers.length()];

        recursion("", 0);

        answer = set.size();

        return answer;
    }
    public void recursion(String s, int index) {
        int num;
        if(s != "") {
            num = Integer.parseInt(s);
            if(isPrime(num)) {
                set.add(num);
            }
        }

        if(index == arr.length) {
            return;
        }

        for(int i = 0; i < arr.length; i++) {
            if(visited[i]) {
                continue;
            }
            visited[i] =true;
            recursion(s + arr[i], index + 1);
            visited[i] = false;
        }
    }
    public boolean isPrime(int a) {
        if(a == 0 || a == 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if(a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
