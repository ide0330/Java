import java.util.*;

public class Square {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int length = stdIn.nextInt();
        for(int i=0;i<length;i++){
            System.out.println("*".repeat(length));
        }
       
    }
}
