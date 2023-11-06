package src.baekjoon;

import java.util.Scanner;

public class baekjoon_10872 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num = 1;

        if( N != 0) {
            for(int i = 1; i <= N; i++) {
                num = num * i;
            }
        }

        System.out.println(num);


    }

}
