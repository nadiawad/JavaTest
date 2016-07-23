/**
 * Created by Nadi on 23/07/2016.
 */
public class LoopBreak {
    public static void main(String[] args) {
        String[] sa = {"tom ", "jerry "};
        for(int x = 0; x < 3; x++) {
            for(String s: sa) {
                System.out.print(x + " " + s);
                if( x == 1) break;
            }
        }
    }
}

/*
Given:

public class MyLoop {
public static void main(String[] args) {
String[] sa = {"tom ", "jerry "};
for(int x = 0; x < 3; x++) {
for(String s: sa) {
System.out.print(x + " " + s);
if( x == 1) break;
}
}
}
}


What is the result?
A) 0 tom 0 jerry 1 tom
B) 0 tom 0 jerry 1 tom 1 jerry
C) 0 tom 0 jerry 2 tom 2 jerry
D) 0 tom 0 jerry 1 tom 2 tom 2 jerry
E) 0 tom 0 jerry 1 tom 1 jerry 2 tom 2 jerry
F) Compilation fails.
 */