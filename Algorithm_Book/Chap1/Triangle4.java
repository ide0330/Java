import java.util.*;

public class Triangle4 {
    public static void triangleLB(int n) {
        for(int i=1;i<=n;i++){
            System.out.println("*".repeat(i));
        }        
    }
    public static void triangleLU(int n) {
        for(int i=n;i>0;i--){
            System.out.println("*".repeat(i));
        }        
    }
    public static void triangleRB(int n) {
        for(int i=1;i<n;i++){
            System.out.println(" ".repeat(n-i) + "*".repeat(i));
        }        
    }
    public static void triangleRU(int n) {
        for(int i=n;i>0;i--){
            System.out.println(" ".repeat(n-i) + "*".repeat(i));
        }        
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        triangleLB(5);
        triangleLU(5);
        triangleRB(5);
        triangleRU(5);
       
    }
}
