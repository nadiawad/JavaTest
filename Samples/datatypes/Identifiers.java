package datatypes;

import javax.sound.midi.SysexMessage;

/**
 * Created by Nadi on 28/08/2016.
 */
public class Identifiers {
    public static void main(String[] args){
        byte number_of_courses=7;
        //byte number-of-chapters=10; //Compilation Error: Hyphens are not allowed in the name of a Java identifier
        //int 1num=1; //Compilation Error: Cannot start with a digit
        int $money=1000;
        int £moneyInPounds__=750;
        int _money=450;
        //int specialCharacter^=2; //Compilation Error: Invalid Identifier. Special characters are not allowed
        //boolean true=true; //Compilation Error: reserved words are not allowed as a Java identifier
        boolean truefalse; //Valid: Combination of 2 keywords
        int javaVar,javavar,javaVAr,javaVAR; //Valid; but confusing :)
        //int car.count; //Invalid: A dot in a variable name
        int $€€money$$£; //Valid

        int a,b;
        a=b=10;
        long l=10L;
        l=a=5; //This is fine
        //a=l=6; //Compilation Error
        System.out.println(10/6 +" *** "+10.0/6.0);

        a=10;
        a=a+++a+a---a--+ ++a;
        System.out.println(a);

        int num1=10;
        long num2=10;
        double num3=10.1;
        char char1=65;
        boolean bool1=false, bool2=true;
        System.out.println((num1>=num2)+" *** "+(num1>=num3));
        System.out.println(char1+" *** "+(int)char1+" *** "+(num1<=char1));
        //System.out.println(bool1<num1); //Compilation Error
        num3=10.0;
        System.out.println(num1==num3);
        //System.out.println(bool1<bool2); //Compilation Error
        System.out.println(bool1==bool2);
        boolean bool3=num1<num2;
        a=10;b=20;
        System.out.println(a=b); // Be aware this is assigning the value of b to a then printing it

        System.out.println((a>20 && b>10) +" *** "+ ((a>20 || b>10)));
        System.out.println(a>20 && b++<5);
        System.out.println(b); // b value doesn't change
        System.out.println(a>20 || b++<5);
        System.out.println(b); // but it is changed here
    }
}
