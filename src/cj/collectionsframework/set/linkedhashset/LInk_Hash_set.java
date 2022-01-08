package cj.collectionsframework.set.linkedhashset;

import java.util.LinkedHashSet;

public class LInk_Hash_set {
    public static void main(String[] args) {
        LinkedHashSet lhs=new LinkedHashSet();

        lhs.add("a");
        lhs.add("b");
        lhs.add(1);
        lhs.add(2);
        lhs.add("a");
        lhs.add(1);
        lhs.add(null);
// we can add null in linkedshashset

        System.out.println(lhs);
     // searching a is present or not
        System.out.println(lhs.contains("a"));
    }
}
