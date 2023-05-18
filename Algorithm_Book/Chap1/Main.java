import java.util.*;

public class Main {
    public static void spira(int n) {
        for(int i=1;i<=n;i++){
            int spaceNum = (2*n-1)/2-i+1;
            System.out.println(" ".repeat(spaceNum) + "*".repeat((i-1)*2+1));
        }
    }
    public static void spiraNum(int n) {
        for(int i=1;i<=n;i++){
            int spaceNum = (2*n-1)/2-i+1;
            System.out.println(" ".repeat(spaceNum) + Integer.valueOf(i).toString().repeat((i-1)*2+1));
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        spira(5);
        spiraNum(5);
       
    }
}
