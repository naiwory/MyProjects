package module8.homework;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Library {

    public static void peopleInTheLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Count of people in the library:");
        int peopleCount = sc.nextInt();
        System.out.println("Max amount of people in the library:");
        int maxAmount = sc.nextInt();

        Semaphore semaphore = new Semaphore(maxAmount);

        Thread[] people = new Thread[peopleCount];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Thread();
        }
    }

    Runnable task = new Runnable (){
        @Override
        public void run ( ) {
            System.out.println ("Came to the library door");
            System.out.println ("Went inside");
            System.out.println ("Is reading some book");
            System.out.println ("Left the library");
        }
    };

    public static void main(String[] args) {

    }
}


