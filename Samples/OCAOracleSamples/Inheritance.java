package OCAOracleSamples;

/**
 * Created by Nadi on 23/07/2016.
 */

class Alpha {
    String getType() { return "alpha"; }
}
class Beta extends Alpha {
    String getType() { return "beta"; }
}
class Gamma extends Beta {
    String getType() { return "gamma"; }
    public static void main(String[] args) {
        /*
        Gamma g1 = new Alpha();
        Gamma g2 = new Beta();
        System.out.println(g1.getType() + " "
                + g2.getType());
                */
        Alpha g1=new Gamma();
        Beta g2=new Gamma();
        System.out.println(g1.getType() + " "
                + g2.getType());
    }
}

/*
Given:

class Alpha {
String getType() { return "alpha"; }
}
class Beta extends Alpha {
String getType() { return "beta"; }
}
class Gamma extends Beta {
String getType() { return "gamma"; }
public static void main(String[] args) {
Gamma g1 = new Alpha();
Gamma g2 = new Beta();
System.out.println(g1.getType() + " "
+ g2.getType());
}
}


What is the result?
A) alpha beta
B) beta beta
C) gamma gamma
D) alpha alpha
E) Compilation fails.
 */

/*
Resources:
The correct answer is E. Alpha and Beta cannot be assigned to an object of Gamma as Gamma is the subclass of Beta, which is a subclass of Alpha. The opposite can be done, i.e. a Gamma assigned to an Alpha, or a Beta, in which case it would print “gamma gamma”.
 */