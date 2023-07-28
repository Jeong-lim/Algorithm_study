// 완전 탐색
package src.Algo_lecture;

import java.util.Scanner;
// 100만보다 작고 2이상의 약수를 가지고 있으면 틀린 비밀번호
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long number = sc.nextInt(); // 1000036000099
            for(int j = 0; j < 1000001; j++) {
                if(number % i == 0) {
                    System.out.println("NO");
                    break;
                }
                if (i == 1000000) {
                    System.out.println("YES");
                }
            }
        }

    }
}
