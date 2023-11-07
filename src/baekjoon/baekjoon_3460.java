package src.baekjoon;

import java.util.Scanner;

public class baekjoon_3460 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < T; i++) {
            int n = sc.nextInt();
            String Binary = Integer.toBinaryString(n);
            for(int j=Binary.length()-1; j>=0; j--) {
                if(Binary.charAt(j)=='1') {
                    System.out.print(Binary.length()-j-1+" ");
                }
            }
        }


    }

}
