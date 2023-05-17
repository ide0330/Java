
import java.util.*;

public class Cream {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int result = (x-a)%b;
        System.out.println(result);
    }
}
