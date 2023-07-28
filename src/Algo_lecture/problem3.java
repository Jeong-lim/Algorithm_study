package src.Algo_lecture;

import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();

        for(int x = -10000; x < 10001; x++) {
            for(int y = -10000; y < 10001; y++) {
                if(A*x + B*y == C) {
                    if(D*x + E*y == F) {
                        System.out.println(x + " " + y);
                        System.exit(0);
                    }
                }
            }
        }




    }
}
