package others;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Nadi on 16/08/2016.
 */
public class Reader {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName=scanner.nextLine();
        System.out.println("Enter your Last name: ");
        String lastName=scanner.nextLine();
        System.out.println("Enter your age: ");
        Double age=scanner.nextDouble();
        System.out.println("\t\t\t\t===REPORT===");
        System.out.println("\tFull Name: "+firstName+" "+lastName);
        System.out.println("\tAge: "+age);

        System.out.println ( "Keep Entring strings- ** to exit" );
        ArrayList<String> strings=new ArrayList<>();
        String nextString=scanner.next();
        while (!"**".equals(nextString)){
            strings.add(nextString);
            nextString=scanner.next();
        }
        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);
    }
}
