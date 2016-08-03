package javabasics.accessmodifiersexample.building;
import javabasics.accessmodifiersexample.library.Book;
/**
 * Created by Nadi on 03/08/2016.
 */
public class StoryBook extends Book {
    public StoryBook(){
        author="Nadi";
        modifyTemplate();
        //issueCount=5; // Compilation Error
    }
}
