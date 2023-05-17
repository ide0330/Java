import java.util.*;

public class Takoyaki {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int x = stdIn.nextInt();
        int t = stdIn.nextInt();
        int result = 0;
        result = (n+x-1)/x*t;
        System.out.println(result);
    }
}
