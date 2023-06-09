// 演習6-18
// 度数ソート（配列要素の値はmin以上max以下）

import java.util.Scanner;

class CountingSort2 {

	//--- 度数ソート（配列要素の値はmin以上max以下） ---//
	static void countingSort(int[] a, int n, int min, int max) {
		int[] f = new int[max - min + 2];	// 累積度数
		int[] b = new int[n];					// 作業用目的配列

		for (int i=0;   i < n;         i++)   f[a[i]-min]++;					// Step 1
		for (int i=1;   i <= max-min+1; i++)   f[i] += f[i - 1];				// Step 2
		for (int i=n-1; i >= 0;         i--)   b[--f[a[i]-min]] = a[i];	// Step 3
		for (int i=0;   i < n;         i++)   a[i] = b[i];						// Step 4
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("度数ソート");
		System.out.print("要素数：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			do {
				System.out.print("x[" + i + "]：");
				x[i] = stdIn.nextInt();
			} while (x[i] < 0);
		}

		int max = x[0];
		for (int i = 1; i < nx; i++)
			if (x[i] > max) max = x[i];

		int min = x[0];
		for (int i = 1; i < nx; i++)
			if (x[i] < min) min = x[i];

		countingSort(x, nx, min, max);	// 配列xを度数ソート
		
		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);
	}
}