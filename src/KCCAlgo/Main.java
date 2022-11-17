package src.KCCAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        System.out.println(testCase);

        for(int test=0; test<testCase; test++) {
            int result=0;
            int N = sc.nextInt(); // 6
            int M = sc.nextInt(); // 1
            
            sc.nextLine();


            int[] datas = new int[N*2];      // N*2 크기의 int형 배열 생성
            String[] dataStr = sc.nextLine().split(" ");
            for(int i=0; i<N*2; i++) {
                datas[i] = Integer.parseInt(dataStr[i]);
            }
            System.out.println("#"+ (test+1) + " " + result);
            System.out.println(Arrays.toString(datas));      // 배열을 알아서 출력해줌

           
        }


    }

}