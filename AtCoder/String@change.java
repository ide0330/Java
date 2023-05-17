
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] S = stdIn.next().split("");
        String[] T = stdIn.next().split("");
        Map<Character, Integer> Scnt = new HashMap<>();
        Map<Character, Integer> Tcnt = new HashMap<>();

        Arrays.stream(S).forEach(s -> {
            
        });
        

        for(int i=0;i<S.length();i++){
            char sChar = S.charAt(i);
            char tChar = T.charAt(i);    
            Scnt.computeIfPresent(sChar, (k,v) -> v+1);
            Scnt.putIfAbsent(sChar, 1);
            Tcnt.computeIfPresent(tChar, (k,v) -> v+1);
            Tcnt.putIfAbsent(tChar, 1);
        }

        

        String atcoder="atcoder";
        for(int i=0;i<atcoder.length();i++){
            char c = atcoder.charAt(i);
            int M=Math.max(Scnt.getOrDefault(c,0), Tcnt.getOrDefault(c,0));
            if(Scnt.getOrDefault('@',0)<M-Scnt.getOrDefault(c,0) || Tcnt.getOrDefault('@',0)<M-Tcnt.getOrDefault(c,0)){
                System.out.println("No");
                System.exit(0);
            }
            Scnt.replace('@',Scnt.getOrDefault('@', 0)-M+Scnt.getOrDefault(c,0));
            Scnt.putIfAbsent(c, M);
            Scnt.replace(c,M);
            
            Tcnt.replace('@',Tcnt.getOrDefault('@', 0)-M+Tcnt.getOrDefault(c,0));
            Tcnt.putIfAbsent(c, M);
            Tcnt.replace(c,M);

        }

        if(Scnt.equals(Tcnt)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
