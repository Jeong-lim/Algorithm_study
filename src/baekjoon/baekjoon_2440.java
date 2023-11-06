package src.baekjoon;

import java.util.Scanner;

public class baekjoon_2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            int k = N - i;
            for(int j = N; j > 0; j--) {
                System.out.print("*");

            }

            System.out.print("\n");
        }
    }

}
