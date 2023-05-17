
import java.util.*;

public class InfiniteCoins {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a = stdIn.nextInt();
        if(n%500<=a){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
