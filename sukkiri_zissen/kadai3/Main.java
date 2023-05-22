import java.util.*;
import java.util.function.IntPredicate;

public class Main {
    public static void main(String[] args) {
        IntPredicate func1 = x->(x%2==1);
        FuncList funclist = new FuncList();
        Func2 func2 = (point,name)->name+(point>65 ? "合格" : "不合格");
        System.out.println(func1.test(5));
        System.out.println(func2.call(68,"吉田"));
        
    }
    
}
