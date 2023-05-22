import java.util.*;

public class Main3_1 {
    public static void main(String[] args) {
        Func1 func1 = FuncList::isOdd;
        FuncList funclist = new FuncList();
        Func2 func2 = funclist::passCheck;
        System.out.println(func1.call(5));
        System.out.println(func2.call(68,"吉田"));
        
    }
    
}
