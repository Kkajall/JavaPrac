package collection;

import java.util.*;

public class Mapp {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer,Integer> map2= new TreeMap<>();
        Map<Integer,Integer> map3= new LinkedHashMap<>();

        map.put(8,8);
        map.put(88,99);
        map.put(67,56);

        map2.put(66,876);
        map2.put(45,67);


        map3.put(456,234);
        map3.put(23,23);


        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
            System.out.println(m);

        }

        Iterator it= map.entrySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
