package oracle.samples;

/**
 * Created by Nadi on 23/07/2016.
 */

interface Rideable {
    String getGait();
}

public class InterfaceImplementation implements Rideable {
    int weight = 2;

    public static void main(String[] args) {
        new InterfaceImplementation().go(8);
    }

    void go(int speed) {
        ++speed;
        weight++;
        int walkrate = speed * weight;
        System.out.print(walkrate + getGait());
    }

    public String getGait() {
        return " mph, lope";
    }
    /*
    String getGait() {
        return " mph, lope";
    }
     */
}

/*
Given:

interface Rideable {
String getGait();
}
public class Camel implements Rideable {
int weight = 2;
public static void main(String[] args) {
new Camel().go(8);
}
void go(int speed) {
++speed;
weight++;
int walkrate = speed * weight;
System.out.print(walkrate + getGait());
}
String getGait() {
return " mph, lope";
}
}


What is the result?
A) 16 mph, lope
B) 18 mph, lope
C) 24 mph, lope
D) 27 mph, lope
E) Compilation fails.
F) An exception is thrown at run time.
 */

/*
Resources:
The correct answer is E. The method getGait() in Camel has “default” or “package-private” level access. The method getGait() in interface Rideable is public. Camel.getGait() needs to match the same access level as the interface.
Methods in interfaces are by default public. Methods in concrete classes are by default “default”.
 */