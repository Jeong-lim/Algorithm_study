package src.baekjoon;

import java.util.Scanner;

public class baekjoon_2576 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        int count = 0;
        // int 배열로 입력
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] % 2 == 1) {
                count++;
            }
        }

        int sum = 0;
        int min = 100; // 자연수는 100보다 작다.
        if(count > 0) {
            // for문으로 홀수 판별
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 == 1) {
                    sum += arr[i];

                    if(arr[i] < min) {
                        min = arr[i];
                    }
                }



            }

            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println("-1");// 홀수 존재 안하면 -1
        }




    }

}
