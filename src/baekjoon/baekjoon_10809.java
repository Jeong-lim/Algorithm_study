package src.baekjoon;

import java.util.Scanner;

public class baekjoon_10809 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        for(int i = 97; i <= 122; i++) {

            for(int j = 0; j < arr.length; j++) {
                if((int) arr[j] == i) {
                    System.out.print(j + " ");
                }
            }

            // 배열 안에 없을 때 출력


        }


    }

}
