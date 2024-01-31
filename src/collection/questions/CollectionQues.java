package collection.questions;

import java.util.*;

public class CollectionQues {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,1,66,44,23,54);

        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(22);
        set.add(12);
        set.add(32);
        set.add(54);
        set.add(4);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Orange");
        map.put(4, "Kiwi");
        map.put(3, "Orange");


//        Check if an element is present in list or not
        System.out.println(list.contains(5));
        System.out.println(list.contains(45));

//        copy one list into another
        List<Integer> list2 = new ArrayList<>();
        Collections.copy(list2, list);
        System.out.println(list2);

//        Check if an element is present in set
        System.out.println(set.contains(22));
        System.out.println(set.contains(23));

//        check if a key is present in hashmap
        System.out.println(map.containsKey(2));

//        check if a value is present in hashmap
        System.out.println(map.containsValue("Orange"));

//        clone one hashset to another hashset
        HashSet<Integer> clone = new HashSet<>();
        clone = (HashSet<Integer>) set.clone();
        System.out.println(clone);

//        Empty a hashSet
        set.removeAll(set);
        System.out.println(set);

//        check if a hashset is empty or not
        System.out.println(set.isEmpty());

//        Convert a hashset to an array
        Arrays.stream(clone.toArray()).forEach(System.out::println);

//        put all the values of a map into second map
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println(map2);

//        remove all mapping from a map
        map2.clear();
        System.out.println(map2);



    }
}
