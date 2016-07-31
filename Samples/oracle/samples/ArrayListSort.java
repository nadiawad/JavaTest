package oracle.samples; /**
 * Created by Nadi on 23/07/2016.
 */
import java.util.*;
public class ArrayListSort {
    public static void main(String[] args) {
        List p = new ArrayList();
        p.add(7);
        p.add(2);
        p.add(5);
        p.add(2);
        //1. p.sort();
        //2. Collections.sort(p);
        System.out.println(p);
    }
}

/*
Given:

import java.util.*;
public class Primes {
public static void main(String[] args) {
List p = new ArrayList();
p.add(7);
p.add(2);
p.add(5);
p.add(2);
p.sort();
System.out.println(p);
}
}


What is the result?
A) [2, 5, 7]
B) [2, 2, 5, 7]
C) [7, 2, 5, 2]
D) [7, 5, 2, 2]
E) Compilation fails
 */