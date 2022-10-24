package ninth;

public class Q3 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            String s1 = Integer.toBinaryString(arr1[i]);
            String s2 = Integer.toBinaryString(arr2[i]);

            s1 = "0".repeat(n - s1.length()) + s1;
            s2 = "0".repeat(n - s2.length()) + s2;

            String s3 = "";

            for(int j = 0; j < n; j++) {
                if(s1.charAt(j) == '0' && s2.charAt(j) == '0') {
                    s3 += " ";
                }else {
                    s3 += "#";
                }
            }

            answer[i] = s3;
        }

        return answer;
    }
}
