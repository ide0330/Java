// 演習1-9
// 整数bから整数aを引いた値を求める（b > aとなるように読み込む）

import java.util.Scanner;

class Difference {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("aの値：");
		int a = stdIn.nextInt();

		int b;
		while (true) {
			System.out.print("bの値：");
			b = stdIn.nextInt();
			if (b > a) break;
			System.out.println("aより大きな値を入力せよ！");
		}

		System.out.println("b - aは" + (b - a) + "です。");
	}
}

