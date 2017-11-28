package module8.homework;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class Library {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



        System.out.print("Количество человек: ");

        int peopleCount = in.nextInt();



        System.out.print("Лимит библиотеки: ");

        int maxAmount = in.nextInt();



        in.nextLine();



        Library library = new Library(maxAmount);



        for (int i = 0; i < peopleCount; i++)

            new Thread(() -> {



                try {

                    library.talkingCustomers();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }



            }).start();

    }

    private final int MIN_READ_TIME = 1000;

    private final int MAX_READ_TIME = 5000;

    private final int DOOR_TRAVEL_TIME = 500;

    private final int DOOR_CAPACITY = 1;



    private final Semaphore librarySemaphore;

    private final Semaphore doorSemaphore;



    public Library(int maxAmount) {

        librarySemaphore = new Semaphore(maxAmount, true);

        doorSemaphore = new Semaphore(DOOR_CAPACITY, true);

    }



    public void talkingCustomers() throws InterruptedException{

        Random random = new Random(System.currentTimeMillis());

        String threadName = Thread.currentThread().getName();



        System.out.println(threadName + " подошел к двери с улицы.");



        // check empty place

        if (!librarySemaphore.tryAcquire()) {

            System.out.println(threadName + " ждет входа в библиотеку.");

            librarySemaphore.acquire();

        }



        // going in

        doorSemaphore.acquire();

        System.out.println(threadName + " проходит через дверь внутрь.");

        Thread.sleep(DOOR_TRAVEL_TIME);

        System.out.println(threadName + " прошел через дверь внутрь.");

        doorSemaphore.release();



        // reading book

        System.out.println(threadName + " читает книгу.");

        Thread.sleep(random.nextInt(MAX_READ_TIME - MIN_READ_TIME) + MIN_READ_TIME);



        System.out.println(threadName + " подошел к двери изнутри.");



        // going out

        doorSemaphore.acquire();

        System.out.println(threadName + " проходит через дверь наружу.");

        Thread.sleep(DOOR_TRAVEL_TIME);

        System.out.println(threadName + " прошел через дверь наружу.");

        doorSemaphore.release();



        librarySemaphore.release();

    }

}


