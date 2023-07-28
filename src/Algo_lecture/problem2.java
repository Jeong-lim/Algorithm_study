package src.Algo_lecture;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int candy = sc.nextInt();
        int answer = 0;
        for(int a = 0; a < candy + 1; a++) { // A에게 줄 수 있는 사탕은 0 ~ 6개
            for(int  b = 0; b < candy + 1; b++) { // B에게 줄 수 있는 사탕은 0 ~ 6개
                for(int c = 0; c < candy + 1; c++) { // C에게 줄 수 있는 사탕은 0 ~ 6개
                    if (a + b + c == candy) {
                        if(a >= b + 2) {
                            if( a != 0 && b != 0 && c != 0) {
                                if (c % 2 == 0) {
                                    answer += 1;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(answer);


    }
}
