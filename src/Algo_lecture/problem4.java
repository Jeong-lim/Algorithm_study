package src.Algo_lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class problem4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> hint = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            hint.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < hint.toArray().length; i++) {
            System.out.println(hint.get(i));
        }


        // [[123, 1, 1]
    }
}
