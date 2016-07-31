/**
 * Created by Nadi on 31/07/2016.
 */
class NonAccessModifiers {

    int x=5;
    static void changeX(){
        //x=x+1; //Non-static field (x) cannot be referenced from a static context
    }

    static int y=6;
    void changeY(){
        y=y+1; // This is Ok. Static fields can be referenced by static and non-static methods
    }

    final int z=8;
    void changeZ(){
        //z=z+1; // Cannot assign a value to final variables after they are already defined and were assigned a value
    }

    //final int a; // Final Variables must be initialised

}
