package src;

import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int T = scan.nextInt();
//      System.out.println(T);

      for(int test=0; test<T; test++) {
         int result = 0;
         int N = scan.nextInt();
         scan.nextLine(); // 엔터를 지나감

         int[] A = new int[N+1];
         String[] dataStr = scan.nextLine().split(" ");
         for(int i=1; i<=N; i++) {
            A[i] = Integer.parseInt(dataStr[i-1]);
         }
//         System.out.println(Arrays.toString(A));
         // 여기에  알고리즘 포함
         int score_sum = 0;      // 같은 줄 테스트 케이스의 팀의 실력의 최대 합을 계산후 절댓값을 취해서 더한 값
         for(int i=1; i<=N; i++) {
            int team_score_max = -2147483648;      // 같은 줄의 선수들의 실력의 최대 합을 저장
            for(int s=1; s<=i; s++) {
               int i_score_max = -2147483648;      // 해당 선수를 포함한 팀의 점수 중 가장 큰 값
               for(int t=i; t<=N; t++) {
                  int i_score = 0;            // i번째 선수가 포함된 팀의 실력
                  int min = 10001;            // 선수들의 실력중 가장 큰값이 10000이므로 그보다 1큰 값을 min으로 초기화
                  for(int j=s; j<=t; j++) {
//                     System.out.print(j + " ");
                     i_score = i_score + A[j];   // i번째 선수가 포함된 팀의 실력을 계산
                     if(j!=i && A[j]<min) {
                        min = A[j];            // 가장 작은 값을 저장
                     }
                  }
                  if(min<0) {                  // 가장 작은값이 음수이면 빼고 더하는것이 더 큰 값이므로...
                     i_score = i_score - min;    // 팀의 점수에서 가장 작은 값을 더해줘야 한다.(음수이므로 - 연산해야 함)
                  }
                  if(i_score > i_score_max) {      // 각 선수별 팀 실력이 가장 큰 값을 저장
                     i_score_max = i_score;      // 팀의 점수중 가장 큰 점수를 저장
                  }
                  System.out.print(i_score+ " ");
               }
//               System.out.print(i_score_max+ " ");
               if(i_score_max > team_score_max) {
                  team_score_max = i_score_max;
               }
            }
//            System.out.print(team_score_max + " ");
            team_score_max = (team_score_max<0) ? -team_score_max : team_score_max; // 절댓값을 취한 후
            score_sum = score_sum + team_score_max;         // 모두 더함
         }
         result = score_sum % 100000007;         // 1,000,000,007로 나눈 나머지 계산
         System.out.println("#" + (test+1) + " " + result);
      }
      scan.close();
   }
}