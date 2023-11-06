package src.baekjoon;

import java.util.Scanner;

public class baekjoon_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int num = N - i;

            for(int k = num - 1; k > 0; k--) { //
                System.out.print(" ");
                num--;
            }

            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }

}
