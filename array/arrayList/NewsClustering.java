import java.util.ArrayList;

public class NewsClustering {
    public int solution(String str1, String str2) {
        int answer = 0;

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> cross = new ArrayList<>();
        ArrayList<String> plus = new ArrayList<>();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for(int i = 0; i<str1.length()-1;i++){
            char first = str1.charAt(i);
            char second = str1.charAt(i+1);
            if(first >='a' && first <='z' && second >='a' && second <='z'){
                arr1.add(first +""+second);
            }
        }

        for(int i = 0; i<str2.length()-1;i++){
            char first = str2.charAt(i);
            char second = str2.charAt(i+1);
            if(first >='a' && first <='z' && second >='a' && second <='z'){
                arr2.add(first +""+second);
            }
        }

        for(String s : arr1){
            if(arr2.remove(s)){
                cross.add(s);
            }
            plus.add(s);
        }

        plus.addAll(arr2);

        double cross_len = cross.size();
        double plus_len = plus.size();
        if(plus_len == 0){
            return 65536;
        }
        answer = (int)(cross_len/plus_len* 65536) ;

        return answer;
    }
}
