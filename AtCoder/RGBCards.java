
import java.util.*;

public class RGBCards {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int r = stdIn.nextInt();
        int g = stdIn.nextInt();
        int b = stdIn.nextInt();

        int sum = 100*r + 10*g + b;
        if(sum%4==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
