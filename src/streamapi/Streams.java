package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,5,4,3,3,5,5,6,6);
        List<String> str= new ArrayList<>();
        str.add("tfgh");
        str.add("dfgh");
        str.add("werdfght");
        str.add("zxcv");


       List<Integer> ll= list.stream().distinct().collect(Collectors.toList());
        System.out.println(ll);

        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        list.stream().filter(i->i%2==0).forEach(System.out::println);
      int s=  list.stream().reduce(0,(a,b)->a+b);
        System.out.println(s);

       // List<String> li= new ArrayList<>();

        str.stream().filter(i->i.length()>4).forEach(System.out::println);
        str.stream().collect(Collectors.groupingBy((h)->h.length())).forEach((a, li)-> System.out.println(a +" "+ li));
        str.stream().filter(i->i.startsWith("t")).forEach(System.out::println);
        str.stream().filter(i->i.length()<9).forEach(System.out::println);

    }
}

// git add .
//git commit -m "message"
// git push origin main