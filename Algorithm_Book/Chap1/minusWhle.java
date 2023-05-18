import java.util.*;

public class minusWhle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b;
        do {
            System.out.println("aより大きな値を入力せよ！");
            b = stdIn.nextInt();
        } while (b<=a);
       System.out.println(b-a);
    }
}
