// 演習9-3
// ２分探索木クラスBinTree<K,V>の利用例
// 注意：
// 本プログラムは、キーは【整数の降順】です。
// 最小のキー値は、会員番号の【最大値】であり、
// 最大のキー値は、会員番号の【最小値】です。

import java.util.Scanner;
import java.util.Comparator;

class BinTreeTester {
	static Scanner stdIn = new Scanner(System.in);

	//--- データ（会員番号＋氏名） ---//
	static class Data {
		public static final int NO   = 1;	// 番号を読み込むか？
		public static final int NAME = 2;	// 氏名を読み込むか？

		private Integer no;				// 会員番号（キー値）
		private String  name;			// 氏名

		//--- キー値 ---//
		Integer keyCode() {
			return no;
		}

		//--- 文字列表現を返す ---//
		public String toString() {
			return name;
		}

		//--- データの読込み ---//
		void scanData(String guide, int sw) {
			System.out.println(guide + "するデータを入力してください。");

			if ((sw & NO) == NO) {
				System.out.print("番号：");
				no = stdIn.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.print("氏名：");
				name = stdIn.next();
			}
		}
	}

	//--- メニュー列挙型 ---//
	enum Menu {
		ADD(      "挿入"),
		REMOVE(   "削除"),
		SEARCH(   "探索"),
		PRINT(    "表示"),
		PRINTR(   "降順表示"),
		MIN_KEY(  "最小のキー値"),
		MIN_DATA( "最小のキーをもつデータ"),
		MAX_KEY(  "最大のキー値"),
		MAX_DATA( "最大のキーをもつデータ"),
		TERMINATE("終了");

		private final String message;			// 表示用文字列

		static Menu MenuAt(int idx) {			// 序数がidxである列挙を返す
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) {				// コンストラクタ
			message = string;
		}

		String getMessage() {				// 表示用文字列を返す
			return message;
		}
	}

	//--- メニュー選択 ---//
	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m : Menu.values())
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
			System.out.print("：");
			key = stdIn.nextInt();
		} while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu;								// メニュー
		Data data;								// 追加用データ参照
		Data ptr;									// 探索用データ参照
		Data temp = new Data();		// 読込み用データ

		class IntegerDecComparator implements Comparator<Integer> {
			public int compare(Integer n1, Integer n2) {
				return (n1 > n2) ? -1 : (n1 < n2) ? 1 : 0;
			}
		}

		//--- 整数の降順による順序付けを行うコンパレータ  ---//
		final IntegerDecComparator INT_DEC_COMP = new IntegerDecComparator();

		BinTree<Integer, Data> tree = new BinTree<Integer, Data>(INT_DEC_COMP);

		do {
			switch (menu = SelectMenu()) {
			 case ADD :					// ノードの挿入
					data = new Data();
			 		data.scanData("挿入", Data.NO | Data.NAME);
			 		tree.add(data.keyCode(), data);
			 		break;

			 case REMOVE :			// ノードの削除
					temp.scanData("削除", Data.NO);
			 		tree.remove(temp.keyCode());
			 		break;

			 case SEARCH :			// ノードの探索
					temp.scanData("探索", Data.NO);
					ptr = tree.search(temp.keyCode());
					if (ptr != null)
						System.out.println("その番号の氏名は" + ptr + "です。");
					else
						System.out.println("該当データはありません。");
					break;

			 case PRINT :				// 全ノードをキー値の昇順に表示
					tree.print();
					break;

			 case PRINTR :			// 全ノードをキー値の降順に表示
					tree.printReverse();
					break;

			 case MIN_KEY : {		// 最小のキー値を表示
					Integer key = tree.getMinKey();
					if (key != null)
						System.out.println("最小のキー値は" + key + "です。");
					else
						System.out.println("データがありません。");
					break;
					}

			 case MIN_DATA :		// 最小のキー値をもつデータを表示
					ptr = tree.getDataWithMinKey();
					if (ptr != null)
						System.out.println("最小のキー値をもつデータは" + ptr + "です。");
					else
						System.out.println("データがありません。");
					break;

			 case MAX_KEY : {		// 最大のキー値を表示
					Integer key = tree.getMaxKey();
					if (key != null)
						System.out.println("最大のキー値は" + key + "です。");
					else
						System.out.println("データがありません。");
					break;
					}

			 case MAX_DATA :		// 最大のキー値をもつデータを表示
					ptr = tree.getDataWithMaxKey();
					if (ptr != null)
						System.out.println("最大のキー値をもつデータは" + ptr + "です。");
					else
						System.out.println("データがありません。");
					break;
			}
		} while (menu != Menu.TERMINATE);
	}
}
