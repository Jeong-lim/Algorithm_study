package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_5598 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        for(int i = 0; i < arr.length; i++) {
            byte num = (byte) arr[i];
            if(num > 67 && num <= 90) {
                arr[i] -= 3;
            } else {
                if((byte) arr[i] == 65) {
                    arr[i] = 88;
                } else if((byte) arr[i] == 66) {
                    arr[i] = 89;
                } else if((byte) arr[i] == 67) {
                    arr[i] = 90;
                }
            }
        }

        String str = new String(arr);
        System.out.println(str);

    }

}
