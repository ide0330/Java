import java.util.Scanner;

public class  XMax{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int result = Math.max(a+b, Math.max(a-b, a*b));
        System.out.println(result);
    }
}
