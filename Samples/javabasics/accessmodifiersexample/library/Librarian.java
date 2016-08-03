package javabasics.accessmodifiersexample.library;

/**
 * Created by Nadi on 03/08/2016.
 */
public class Librarian {
    public Librarian(){
        Book book=new Book();
        book.author="This works";
        book.modifyTemplate();
        book.issueHistory();
        //book.countPages(); Compilation Error
    }
}
