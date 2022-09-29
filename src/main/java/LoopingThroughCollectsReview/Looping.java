package LoopingThroughCollectsReview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Looping {
    public static void main(String[] args) {


        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("banana");
        //looping through using an iterator
       var i= fruit.iterator();
//       while(i.hasNext()){
//           System.out.println(i.next());
//       }
//       for(String item: fruit){
//           System.out.println(item);
//       }
//
//       fruit.forEach(x-> System.out.println(x));
        Map <String,Integer>peopleAge = new HashMap();
        peopleAge.put("mem",12);
        peopleAge.put("bro", 20);
        peopleAge.put("bro", 17);

        for(var entry: peopleAge.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}