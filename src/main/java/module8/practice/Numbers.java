package module8.practice;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Numbers {
    public static int[] read(String path)throws Exception{
        String json = new Scanner(new File(path)).useDelimiter("\\Z").next();
        int[] numbers = JSON.parseObject(json, int[].class);
        return numbers;
    }

    public static long executeSum(int[] numbers){
        long sum = 0;
        for(int i = 0; i < numbers.length - 1; i++)
            sum += numbers[i] + numbers[i + 1];
        return sum;
    }

    public static long executeMultiply(int[] numbers){
        long multiply = 0;
        for(int i = 0; i < numbers.length - 1; i++)
            multiply += numbers[i] * numbers[i + 1];
        return multiply;
    }

    public static long executeDivide(int[] numbers){
        long divideSum = 0;
        int sum;
        for(int i = 0; i < numbers.length - 1; i++) {
            sum = numbers[i] / numbers[i + 1];
            divideSum += sum;
            sum = 0;
        }
        return divideSum;
    }

    public static long executeMinus(int[] numbers){
        long minus = 0;
        for(int i = 0; i < numbers.length - 1; i++)
            if(numbers[i + 1] == 0)
                return 0;
            else
                minus += numbers[i] - numbers[i + 1];
        return minus;
    }


    public static void main(String[] args) throws Exception{
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("" + calendar.get(Calendar.MINUTE) + "\t:\t" + calendar.get(Calendar.SECOND));


        Thread threadSum = new Thread(() -> {
            try {
                executeSum(read("files/10 000 000 Numbers.txt"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        System.out.println("" + calendar.get(Calendar.MINUTE) + "\t:\t" + calendar.get(Calendar.SECOND));

        Thread threadMultiply = new Thread(() -> {
            try {
                executeMultiply(read("files/10 000 000 Numbers.txt"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        System.out.println("" + calendar.get(Calendar.MINUTE) + "\t:\t" + calendar.get(Calendar.SECOND));

        Thread threadDivide = new Thread(() -> {
            try {
                executeDivide(read("files/10 000 000 Numbers.txt"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        System.out.println("" + calendar.get(Calendar.MINUTE) + "\t:\t" + calendar.get(Calendar.SECOND));

        Thread threadMinus = new Thread(() -> {
            try {
                executeMinus(read("files/10 000 000 Numbers.txt"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        System.out.println("" + calendar.get(Calendar.MINUTE) + "\t:\t" + calendar.get(Calendar.SECOND));

        System.out.println(executeSum(read("files/10 000 000 Numbers.txt")));
        System.out.println(executeMultiply(read("files/10 000 000 Numbers.txt")));
        System.out.println(executeDivide(read("files/10 000 000 Numbers.txt")));
        System.out.println(executeMinus(read("files/10 000 000 Numbers.txt")));

    }
}
