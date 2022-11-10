package src.KCCAlgo;

import java.util.Arrays;


public class Main2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int N = 3;
		permutation(arr, 0, N);
	}
	
	// 순서 없이 N개를 뽑는 경우
	static void permutation(int[] arr, int start, int n) {
		// 재귀호출은 반드시 종료하는 조건을 추가해야 함
		if(start == n) {
//			System.out.println(Arrays.toString(arr));
			for(int i = 0; i <3; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			swap(arr, start, i);
			permutation(arr, start+1, n);
			swap(arr, start, i);
		}
	}
	
	static void swap(int[] arr, int depth, int i) {
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}
}

