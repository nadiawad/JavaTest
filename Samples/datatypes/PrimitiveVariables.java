package datatypes;

/**
 * Created by Nadi on 27/08/2016.
 */
public class PrimitiveVariables {
    public static void main(String[] args){
        boolean examPrepStarted=true; // true is a boolean literal
        boolean voucherPurchased=Boolean.FALSE; // Autounboxing
        Boolean boxingDone=true; //Autoboxing

        //byte byteInteger= 128; //Compilation Error
        byte byteInteger= (byte) 128;
        System.out.println(byteInteger);

        long longByte=128L;

        //Integer literals can be binary, octal, decimal, and hexadecimal
        int baseDecimal=267;
        int octVal=0413;
        int hexVal=0X10B;
        int binVal=0b1_000_010_11;
        if (octVal==hexVal && baseDecimal==binVal){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        int num1=123_456;
        //int num2=_123; //Compilation Error: Cannot start or end a literal value with an underscore
        //int num3=123_; //Compilation Error: Cannot start or end a literal value with an underscore
        //long num4=123_L; //Compilation Error: Cannot place an underscore before the suffix L
        int num5=Integer.parseInt("123_456"); //Runtime Error: Invalid Use of underscore where a string of digits is expected

    }
}
