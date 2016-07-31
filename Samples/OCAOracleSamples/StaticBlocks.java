package OCAOracleSamples;

/**
 * Created by Nadi on 23/07/2016.
 */

public class StaticBlocks {
    StaticBlocks(){
        System.out.println("Inside Constructor");
    }
    static{
        System.out.println("Inside Static Block");
    }
    void printSomething(){
        System.out.println("Inside Method");
    }
    {
        System.out.println("Inside Non-static Block");
    }
    public static void main(String[] args){
        new StaticBlocks().printSomething();
        new StaticBlocks().printSomething();
    }
}

/*
public class Sequence {
Sequence() { System.out.print("c "); }
{ System.out.print("y "); }
public static void main(String[] args) {
new Sequence().go();
}
void go() { System.out.print("g "); }
static { System.out.print("x "); }
}

What is the result?
A) c x y g
B) c g x y
C) x c y g
D) x y c g
E) y x c g
F) y c g x
 */

/*
Resources:
1.
This:
static {
        System.out.print("x ");
    }
is a static initialization block, and is called when the class is loaded. You can have as many of them in your class as you want, and they will be executed in order of their appearance (from top to bottom).

This:
    {
        System.out.print("y ");
    }
is an initialization block, and the code is copied into the beginning of each constructor of the class. So if you have many constructors of your class, and they all need to do something common at their beginning, you only need to write the code once and put it in an initialization block like this.

2.
http://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
 */