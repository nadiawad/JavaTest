package javabasics.accessmodifiersexample.library;

/**
 * Created by Nadi on 03/08/2016.
 */
public class CourseBook extends Book {
    public CourseBook(){
        author="AAA";
        modifyTemplate();
        //countPages(); Compilation Error
    }
}
