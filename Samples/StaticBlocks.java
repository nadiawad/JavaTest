/**
 * Created by Nadi on 14/04/2016.
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
