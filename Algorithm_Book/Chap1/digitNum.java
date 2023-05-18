import java.util.*;

public class digitNum {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int value = stdIn.nextInt();
        int digit = 1;
        while(value/10!=0){
            digit++;
            value/=10;
        }
        System.out.println("その桁は"+digit+"桁です");
       
    }
}
