package src.baekjoon;

import java.util.Scanner;

public class baekjoon_2443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();



        for(int i = 0; i < N; i++) {
            int k = N - i;
            for(int j = 1; j < i + 1; j++) {
                System.out.print(" ");
            }

            for(int j = k; j > 0; j--) {
                System.out.print("*");
            }
            for(int j = k-1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
