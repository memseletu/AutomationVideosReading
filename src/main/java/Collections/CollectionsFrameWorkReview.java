package Collections;

import java.util.*;

public class CollectionsFrameWorkReview {
    //java provides a collctions framework to store and manipulate aggregate data.
    //collect is an interface. Java does not provide direct implementaion of collection interface.
    //List collection where the elements are ordered. they can contain duplicate elementa. they are listed in order.
    //list are ordered elemets which can be accessed by position
    //Que ordered elements for processing. Access in the order elements were added. first in, first out
    //Maps used to hold key value pairs.
    public static void main(String[] args) {
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("banana");
        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println(fruit.contains("apple"));
        System.out.println(fruit.iterator());
        System.out.println(fruit.remove("banana"));
        //fruit.clear("apple");

        List names = new ArrayList();//list are ordered, so they can be accessed by their positions
        names.add("Mem");
        names.add("Abedl");
        names.add("Jame");
        System.out.println(names.get(0));

        Queue artist = new LinkedList();
        artist.add("rihanna");
        artist.add("beyonce");
        artist.add("arya");
        System.out.println(artist.size());
        System.out.println(artist.remove());//automatically removes the first item
        //the first element of a que is called the head.
        //last element of a Queue is known as the tail

        Map peopleAge = new HashMap();
        peopleAge.put("mem",12);
        peopleAge.put("bro", 20);
        peopleAge.put("bro", 17);
        System.out.println(peopleAge.size());
        System.out.println(peopleAge);

        List memsList = List.of("mem","bro,", "sis");
        System.out.println(memsList.size());
        //map is not  a collection. meaning it does not inherit from the collection interface
        //does not have access to .add instead it used .pu to add things.
        //if you pass in a value that already exists, map just updates it.
    }
}