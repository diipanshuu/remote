package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;

public class Stud {
    public int doSomething(){

        throw new ArithmeticException();

    }

    public void readFile(){
        try{
            File file = new File("abc.txt");
            FileReader fileReader = new
                    FileReader(file);
            System.out.println("Printing from within the try block");
        }catch (FileNotFoundException ex){
            System.out.println("File not found. PLease provide a different file name");
        }

        System.out.println("Printing from outside of the try block");

    }

    public void readFile2() throws FileNotFoundException{
        File file = new File("abc.txt");
        FileReader fileReader = new FileReader(file);
    }

    public void searchStudent(int id) throws StudentNotFoundException{
        if(userNotFound()){
            throw new StudentNotFoundException();
        }
    }

    public boolean userNotFound(){
        return true;
    }

    public void test(){
        test();
    }

    public int testingFinally(){
        try{
            if(false){
                throw new SQLException();
            }
            System.out.println("Printed only if no exception occurs");
            return 1;
        }catch (SQLException ex){
            System.out.println("SqlException caught!");
        }
        finally {
            System.out.println("This will be printed any way");
//            return 2;
        }
        return 3;
    }
}
