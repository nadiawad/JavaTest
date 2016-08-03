package javabasics.accessmodifiersexample.building;

import javabasics.accessmodifiersexample.library.Book;

/**
 * Created by Nadi on 03/08/2016.
 */
public class House {
    public House(){
        Book book=new Book();
        book.isbn="12345678910";
        book.printBook();
        //book.author="Nadi"; --> Compilation Error
        //book.modifyTemplate(); --> Compilation Error
        //book.issueHistory();
    }

}
