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

Recommended reading: https://en.wikipedia.org/wiki/Design_by_contract
 */