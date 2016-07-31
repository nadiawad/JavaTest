/**
 * Created by Nadi on 23/07/2016.
 */
class Feline {
    public String type = "f ";
    public Feline() {
        System.out.print("feline ");
    }
}
class Cougar extends Feline {
    public Cougar() {
        System.out.print("cougar ");
    }
    public static void main(String[] args) {
        new Cougar().go();
    }
    void go() {
        type = "c ";
        System.out.print(this.type + super.type);
    }
}

/*
Given:

class Feline {
public String type = "f ";
public Feline() {
System.out.print("feline ");
}
}
public class Cougar extends Feline {
public Cougar() {
System.out.print("cougar ");
}
public static void main(String[] args) {
new Cougar().go();
}
void go() {
type = "c ";
System.out.print(this.type + super.type);
}
}


What is the result?
A) cougar c c
B) cougar c f
C) feline cougar c c
D) feline cougar c f
E) Compilation fails
F) An exception is thrown at run time.
 */

/*
Resources:
The correct answer is C. When Cougar’s constructor is called, it calls Feline’s constructor first, which prints “feline “. Then Cougar’s constructor is called, printing “cougar “. go() assigns “c ” to the type of the object, which Cougar inherits from Feline. So this.type and super.type are both “c “.
 */