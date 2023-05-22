import java.util.*;

public class Attack {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long a = stdIn.nextLong();
        long b = stdIn.nextLong();

        long result = (a+b-1)/b;
        System.out.println(result);
    }
}
