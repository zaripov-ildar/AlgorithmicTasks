package LeetCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HandsomeMethods {
    public static boolean assertListEquals(List<String> l1, List<String> l2) {
        Collections.sort(l1);
        Collections.sort(l2);
        System.out.println(l1);
        System.out.println(l2);
        return new HashSet<>(l1).containsAll(l2) && new HashSet<>(l2).containsAll(l1) && l1.size() == l2.size();
    }
}
