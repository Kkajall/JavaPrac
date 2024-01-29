package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListt {

    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        List<Integer> ll= Arrays.asList(4,6,7,8,9);
        List<Integer> li= new LinkedList<>();


        li.add(99);
        li.add(67);

        l.add(3);
        l.add(5);
        l.add(8);


        for( int i: ll){
            System.out.println(i);

        }

        for( int h: li){
            System.out.println(h);
        }

        for(int i=0; i<l.size();i++){
            System.out.println(l.get(i));
        }

    }
}
