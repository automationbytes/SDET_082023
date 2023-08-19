package Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {


    static void checkAge(int age) throws Exception {
        if(age < 18){
            throw new Exception("Vignesh says Yu cant vote");
        }
    }



    public static void main(String[] args) throws Exception {

        FileInputStream fileInputStream = new FileInputStream("C:\\Java\\abc.txt");
       // fileInputStream.read();


        try{
            String a = null;
            System.out.println(a.length());

        }catch (Exception e){
            System.out.println("There is an exception");
           // e.printStackTrace();
        }finally {
            System.out.println("Finally is executed");
        }

        System.out.println("Hello");

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }


        checkAge(17);


    }
}
