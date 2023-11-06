package src.baekjoon;

import java.util.Scanner;

public class baekjoon_1037 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        int[] intArray = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            intArray[i] = Integer.parseInt(arr[i]);
;        }


        int max = 0;
        for(int i = 0; i < N; i++) {
            if(intArray[i] > max) {
                max = intArray[i];
            }
        }

        int min = max;

        for(int i = 0; i < N; i++) {
            if(intArray[i] < min) {
                min = intArray[i];
            }
        }

        System.out.println(min * max);



    }

}
