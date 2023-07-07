package src.baekjoon;

import java.util.Scanner;

public class baekjoon_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("");
        int num = sc.nextInt();

        System.out.println(arr[num - 1]);


    }
}
