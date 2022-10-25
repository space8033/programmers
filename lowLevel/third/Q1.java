package third;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i ++) {
            String s = "";
            for(int j = 0; j < i; j++) {
                s += "*";
            }
            System.out.println(s);
        }
    }
}
