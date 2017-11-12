package module8.homework;

import java.util.Scanner;

public class Library {

    public static void peopleInTheLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Count of people in the library:");
        int peopleCount = sc.nextInt();
        System.out.println("Max amount of people in the library:");
        int maxAmount = sc.nextInt();

        Thread[] people = new Thread[peopleCount];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Thread();
        }
    }

    public static void arrival(int index){
        
    }

    public static void main(String[] args) {

    }
}
