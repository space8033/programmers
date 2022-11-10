import java.util.Arrays;
import java.util.Comparator;

public class ArrayFile {
    public String[] solution(String[] files) {
        Arrays.sort(files, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] file1 = slice(o1);
                String[] file2 = slice(o2);

                int headValue = file1[0].compareTo(file2[0]);

                if(headValue == 0) {
                    int num1 = Integer.parseInt(file1[1]);
                    int num2 = Integer.parseInt(file2[1]);

                    return num1 - num2;
                }else {
                    return headValue;
                }
            }

            public String[] slice(String str) {
                String head = "";
                String number = "";
                String tail = "";

                for(int i = 0; i < str.length() ; i++) {
                    char ch = str.charAt(i);
                    if(ch >= '0' && ch <= '9') {
                        str = str.substring(i + 1);
                        break;
                    }
                    head += ch;
                }

                for(int i = 0; i < str.length() ; i++) {
                    char ch = str.charAt(i);
                    if(!(ch >= '0' && ch <= '9')) {
                        str = str.substring(i + 1);
                        break;
                    }
                    number += ch;
                }

                for(int i = 0; i < str.length() ; i++) {
                    char ch = str.charAt(i);
                    tail += ch;
                }

                String[] file = {head.toLowerCase(), number, tail};

                return file;
            }
        });

        return files;
    }
}
