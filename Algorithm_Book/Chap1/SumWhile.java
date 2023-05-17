package Chap1;
import java.util.*;

public class SumWhile {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1からnまでの総和");
        System.out.println("ｎの値");
        int n = stdIn.nextInt();

        int sum=0;
        int i=1;

        while(i<=n){
            sum+=i;
            i++;
            System.out.println(i);
        }
        System.out.println("１から"+n+"までの総和は"+sum+"です");
    }
}
