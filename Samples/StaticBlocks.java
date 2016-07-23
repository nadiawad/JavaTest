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
