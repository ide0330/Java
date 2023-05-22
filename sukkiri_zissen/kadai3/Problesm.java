import java.util.*;

public class Problesm {
    public static void main(String[] args) {
        List<String> names = List.of("あいうえお","かきくけこ");
        names.stream().filter(name->name.length()<=4).forEach(name->{
            System.out.println(name+"さん");
        });

        };
    }
}
