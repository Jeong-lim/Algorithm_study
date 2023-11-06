package src.baekjoon;

import java.util.Scanner;

public class baekjoon_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int b = sc.nextInt();

        for(int i = 0; i < N; i++) {
            if(arr[i] == b) {
                count++;
            }
        }

        System.out.println(count);

    }
}
