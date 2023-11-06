package src.baekjoon;

import java.util.Scanner;

public class baekjoon_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 번호
        int M = sc.nextInt(); // 반복 횟수
        int[] arr = new int[N];

        for (int n = 0; n < M; n++) {

            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int m = i; m < j; m++) {

                if(arr[i - 1] != 0) {
                    arr[i - 1] = 0;
                    arr[i - 1] += 1;
                }
            }



        }

        int b = sc.nextInt();



    }
}
