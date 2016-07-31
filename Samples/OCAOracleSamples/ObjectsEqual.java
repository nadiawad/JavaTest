package OCAOracleSamples;

/**
 * Created by Nadi on 23/07/2016.
 */
public class ObjectsEqual {
    ObjectsEqual(String n) { name = n; }
    String name;
    public static void main(String[] args) {
        ObjectsEqual m1 = new ObjectsEqual("guitar");
        ObjectsEqual m2 = new ObjectsEqual("tv");
        System.out.println(m2.equals(m1));
    }
    public boolean equals(Object o) {
        ObjectsEqual m = (ObjectsEqual) o;
        if(m.name != null)
            return true;
        return false;
    }
}

/*
Given:

public class MyStuff {
MyStuff(String n) { name = n; }
String name;
public static void main(String[] args) {
MyStuff m1 = new MyStuff("guitar");
MyStuff m2 = new MyStuff("tv");
System.out.println(m2.equals(m1));
}
public boolean equals(Object o) {
MyStuff m = (MyStuff) o;
if(m.name != null)
return true;
return false;
}
}
What is the result?
A) The output is "true" and MyStuff fulfills the Object.equals() contract.
B) The output is "false" and MyStuff fulfills the Object.equals() contract.
C) The output is "true" and MyStuff does NOT fulfill the Object.equals() contract.
D) The output is "false" and MyStuff does NOT fulfill the Object.equals() contract
E) Compilation fails
 */

/*
Resources:
1. http://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object)
2. https://en.wikipedia.org/wiki/Design_by_contract
3. https://annatheannoying.wordpress.com/2015/03/11/java-7-certification-exam-sample-questions/:
It is reflexive: for any non-null reference value x, x.equals(x) should return true.

It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.

It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.

It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.

For any non-null reference value x, x.equals(null) should return false.

The last part fails, if you try m2.equals(null), you will get a NullPointerException. It also fails if you do:

MyStuff m1 = new MyStuff(null);

MyStuff m2 = new MyStuff(“asdf”);

m1.equals(m2) returns true.

m2.equals(m1) returns false.

It’s not symmetric, and will not be transitive.
 */