package module8One.homework;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Aryphmetycs {

    public static double calculation(String s, double a, double b) {
        ExecutorService pool = Executors.newFixedThreadPool ( 1 );
        if (s == "+")
            pool.submit ( ( ) -> {
                return a + b;
            } );
        else if (s == "-")
            pool.submit ( ( ) -> {
                return a - b;
            } );
        else if (s == "*")
            pool.submit ( ( ) -> {
                return a * b;
            } );
        else if(s == "/")
            pool.submit ( ( ) -> {
                return a / b;
            } );
        else if(s == "%")
            pool.submit ( ( ) -> {
                return a % b;
            } );
        else if(s == "==")
            pool.submit ( ( ) -> {
                if(a == b)
                    return true;
                else
                    return false;
            } );
        else if(s == ">")
            pool.submit ( ( ) -> {
                if(a > b)
                    return true;
                else
                    return false;
            } );
        else if(s == "<")
            pool.submit ( ( ) -> {
                if(a < b)
                    return true;
                else
                    return false;
            } );
        else
            System.out.println ("You entered the wrong symbol. Try again!");
        return 0;

    }

    public static void main ( String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.println ("First number:");
        double a = sc.nextDouble ();
        System.out.println ("Second number:");
        double b = sc.nextDouble ();

        System.out.println ("Choose what action do you want to perform: +, -, *, /, %, ==, >, or <");
        String s = sc.nextLine ();


    }
}
