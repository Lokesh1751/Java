import java.util.*;

public class treeset {
    public static void main(String[] args) {
        //OPERATIONS PERFORM IN O(LOGN) TIME COMPLEXITY (BECAUSE IT IMPLEMENTS BINARY TREE PROPERTIES)
        // DUPLICATE ELEMENTS ARE NOT ALLOWED
        // ORDER IS  MAINTAINED => ELEMENTS ARE STORED IN SORTED ORDER

        Set<Integer> s = new TreeSet<Integer>();

        // add element
        s.add(12);
        s.add(13);
        s.add(14);
        s.add(15);
        s.add(14);
        s.add(12);
        System.out.println(s);

        // remove by value
        s.remove(15);
        System.out.println(s);

        // contains a particular element or not => contains function => return true or
        // false
        System.out.println(s.contains(14));

        // check if set is empty or not => isempty() function => return true or false
        System.out.println(s.isEmpty());

        // clear function => to remove all elements from set and make it empty
        s.clear();
        System.out.println(s);
        System.out.println(s.isEmpty());

        // size of set
        System.out.println(s.size());
    }
}
