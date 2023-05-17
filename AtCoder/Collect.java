//Collection test

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collect{
    public static void main(String[] args){
        //ArrayList test
        List<String> books = new ArrayList<>();
        books.add("Java 1");
        books.add("Java 2");
        System.out.println(books.get(1));


        //LinkedList test
        List<String> linkedListBooks = new LinkedList<>();
        linkedListBooks.add("list1");
        linkedListBooks.add("list2");
        System.out.println(linkedListBooks.get(1));

        //Map test
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(0, "tree1");
        treeMap.put(1, "tree2");
        treeMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
        System.out.println(treeMap.entrySet());

        //Lambda test
        final List<String> cities = Arrays.asList("Kyoto","Osaka","Kobe");
        cities.stream().forEach(System.out::println);
        cities.stream().map(city -> city.toUpperCase()).forEach(city -> System.out.println(city));
        
        System.out.println("-------filetr---------");

        final List<String> startWithK = cities.stream().filter(city -> city.startsWith("K")).collect(Collectors.toList());
        System.out.println(startWithK);
        
    }
}