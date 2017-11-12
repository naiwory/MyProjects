package module3.homework;

import java.util.Scanner;

public class AdditionalHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ввод значений массива без указания размера массива

        System.out.println("Введите значения массива через пробел: ");

        String line = sc.nextLine();
        String[] numbers = line.split(" ");

        int[] array = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            array[i] = Integer.parseInt(numbers[i]);
        }

        for(int a : array){


        }

        //Максимальное количество повторений числа в массиве

        int max = 0;
        for(int i = 0; i < array.length; i++){
            int count = 0;
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j])
                    count++;
            }
            if(count >= max)
                max = count;
        }
        System.out.println("Максимальное количество повторений числа в массиве: " + max);

        //Минимальное количество повторений числа в массиве

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length - 1; i++){
            int count = 0;
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j])
                    count++;
            }
            if(count <= min)
                min = count;
        }
        System.out.println("Минимальное количество повторений числа в массиве: " + min);
    }
}
