package exception_handling;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Stud stud = new Stud();
//        int n = stud.doSomething();

//        stud.readFile();

        /* Caught Exceptions
        try {
            stud.readFile2();
        }catch (FileNotFoundException ex){
            System.out.println("Caught FileNotFoundException");
        }

        try {
            stud.searchStudent(1);
        }catch (StudentNotFoundException ex){
            System.out.println("Caught StudentNotFoundException");
        }
        */

        // Error
        // stud.test();

        System.out.println(stud.testingFinally());
    }
}
