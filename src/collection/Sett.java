package collection;

import java.util.*;

public class Sett {

    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        Set<Integer> set2= new TreeSet<>();
        Set<Integer> set3= new LinkedHashSet<>();

        set.add(6);
        set.add(8);
        set.add(7);

        set2.add(2);
        set2.add(56);
        set2.add(7);

        set3.add(67);
        set3.add(677);
        set3.add(87);

        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);

        Iterator it = set.iterator();
        Iterator it2= set2.iterator();
        while( it.hasNext()){
            System.out.println(it.next());
            System.out.println(it2.next());


        }
    }
}
