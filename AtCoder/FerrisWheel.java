
import java.util.*;

public class FerrisWheel {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int result=0;
        if(a>=13){
            result=b;
        }else if(a>=6 && a<=12){
            result = b/2;
        }else if(a<=5){
            result = 0;
        }
        System.out.println(result);
    }
}
